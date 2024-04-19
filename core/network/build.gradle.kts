import java.util.Properties

plugins {
    id(libs.plugins.android.library.get().pluginId)
    id(libs.plugins.kotlin.android.get().pluginId)
}

apply<CommonGradlePlugin>()

val properties = Properties()
properties.load(rootProject.file("./local.properties").inputStream())

android {
    namespace = "com.seunghoon.core.network"

    buildTypes {
        release {
            buildConfigField(
                type = "String",
                name = "BASE_URL",
                value = properties.getProperty("BASE_URL_PROD", "\"\""),
            )
        }
        debug {
            buildConfigField(
                type = "String",
                name = "BASE_URL",
                value = properties.getProperty("BASE_URL_DEV", "\"\""),
            )
        }
    }
    buildFeatures {
        buildConfig = true
    }
}

dependencies {

    api(project(":core:common"))
    api(project(":core:local"))

    api(libs.io.ktor.android)
    api(libs.io.ktor.serialization)
    api(libs.io.ktor.serialization.json)
    api(libs.io.ktor.logging)
    api(libs.io.ktor.content.negotiation)
}
