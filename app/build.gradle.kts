plugins {
    id("com.android.library")
    kotlin("android")
    id("org.jmailen.kotlinter")
    `maven-publish`
}

android {
    namespace = "com.glorfindel.lothlorien"
    compileSdk = 34
    buildToolsVersion = "34.0.0"
    defaultConfig.minSdk = 28
    kotlin.jvmToolchain(17)
    buildFeatures.compose = true
    composeOptions.kotlinCompilerExtensionVersion = "1.5.14"
    buildTypes.getByName("release").isMinifyEnabled = false
    packaging.resources.excludes += "/META-INF/{AL2.0,LGPL2.1}"

    androidComponents {
        beforeVariants(selector().withBuildType("debug")) { variantBuilder ->
            variantBuilder.enable = false
        }
    }
}

dependencies {
    implementation(platform("androidx.compose:compose-bom:2024.05.00"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.foundation:foundation")
    implementation("androidx.compose.material3:material3")

    implementation("androidx.constraintlayout:constraintlayout-compose:1.0.1")
    implementation("io.coil-kt:coil-compose:2.6.0")
}

afterEvaluate {
    publishing {
        publications {
            register("release", MavenPublication::class) {
                from(components["release"])
                groupId = "com.glorfindel.lothlorien"
                artifactId = "lothlorien"
                version = "1.0.0"
            }
        }
    }
}
