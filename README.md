[![](https://jitpack.io/v/buyukyilmaz/lothlorien.svg)](https://jitpack.io/#buyukyilmaz/lothlorien)

## Setup

Add jitpack.io to settings.gradle.kts

```gradle
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { setUrl("https://jitpack.io") }
    }
}
```
Add dependency to build.gradle.kts

```gradle
implementation("com.github.buyukyilmaz:lothlorien:1.0.1")
```

## AppConfig

|                   |        |
|-------------------|--------|
| compileSdk        | 34     |
| buildToolsVersion | 34.0.0 |
| minSdk            | 28     |
| kotlinVersion     | 2.0.0  |
| gradleVersion     | 8.4.1  |
| jvmToolchain      | 17     |

## Dependencies

```sh
implementation("androidx.compose:compose-bom:2024.05.00")
implementation("androidx.compose.ui:ui")
implementation("androidx.compose.foundation:foundation")
implementation("androidx.compose.material3:material3")
implementation("androidx.constraintlayout:constraintlayout-compose:1.0.1")
implementation("io.coil-kt:coil-compose:2.6.0")
```
