plugins {
    id(libs.plugins.android.library.get().pluginId)
    id(libs.plugins.kotlin.android.get().pluginId)
}

apply<CommonGradlePlugin>()

android {
    namespace = "com.seunghoon.core.data"
}

dependencies {

    api(project(":core:common"))
    api(project(":core:network"))
    api(project(":core:local"))
}
