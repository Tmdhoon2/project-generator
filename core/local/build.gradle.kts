plugins {
    id(libs.plugins.android.library.get().pluginId)
    id(libs.plugins.kotlin.android.get().pluginId)
}

apply<CommonGradlePlugin>()

android {
    namespace = "com.seunghoon.core.local"
}

dependencies {

    api(project(":core:common"))
}
