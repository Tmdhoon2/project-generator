import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

class ComposeGradlePlugin : Plugin<Project> {
    override fun apply(project: Project) {
        setProjectConfig(project)
        setDependencies(project)
    }

    private fun setProjectConfig(project: Project) {
        project.android().apply {
            buildFeatures {
                compose = true
            }
            composeOptions {
                kotlinCompilerExtensionVersion = ProjectProperties.COMPOSE_VERSION
            }
        }
    }

    private fun setDependencies(project: Project) {
        val libs = project.libs
        project.dependencies {
            implementation(libs.findLibrary("androidx.lifecycle.runtime.ktx").get())
            implementation(libs.findLibrary("androidx.activity.compose").get())
            implementation(platform(libs.findLibrary("androidx.compose.bom").get()))
            implementation(libs.findLibrary("androidx.compose.ui").get())
            implementation(libs.findLibrary("androidx.compose.ui.graphics").get())
            implementation(libs.findLibrary("androidx.compose.ui.tooling.preview").get())
            implementation(libs.findLibrary("androidx.compose.material3").get())

            androidTestImplementation(libs.findLibrary("androidx.espresso.core").get())
            androidTestImplementation(platform(libs.findLibrary("androidx.compose.bom").get()))
            androidTestImplementation(libs.findLibrary("androidx.compose.ui.test.junit4").get())
            debugImplementation(libs.findLibrary("androidx.compose.ui.tooling").get())
            debugImplementation(libs.findLibrary("androidx.compose.ui.test.manifest").get())
        }
    }
}
