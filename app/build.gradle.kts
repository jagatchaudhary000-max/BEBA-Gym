plugins {
    id("com.android.application")
}

android {
    namespace = "com.beba.app"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.beba.app"
        minSdk = 26          // Android 8.0 and newer
        targetSdk = 34
        versionCode = 3
        versionName = "1.2"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}
