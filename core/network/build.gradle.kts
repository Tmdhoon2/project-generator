plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

apply<CommonGradlePlugin>()

android {
    namespace = "com.seunghoon.core.network"
}

dependencies {
    api(project(":core:common"))
}
