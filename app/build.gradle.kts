plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.zhangjiluo.android.demo"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.zhangjiluo.android.demo"
        minSdk = 28
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

    }

    buildTypes {
        release {
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    implementation("androidx.constraintlayout:constraintlayout:2.2.1") // 约束布局
}