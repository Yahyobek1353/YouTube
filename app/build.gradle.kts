plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
    kotlin("kapt")
    alias(libs.plugins.hiltAndroid)
}

android {
    namespace = "com.myself223.metube"
    compileSdk = config.versions.compileSdk.get().toInt()

    defaultConfig {
        applicationId = "com.myself223.metube"
        minSdk = config.versions.minSdk.get().toInt()
        targetSdk = config.versions.targetSdk.get().toInt()
        versionCode = config.versions.versionCode.get().toInt()
        versionName = config.versions.versionName.get()
        buildConfigField("String","BASE_URL","\"https://www.googleapis.com/youtube/v3/\"")
        buildConfigField("String","API_KEY","\"AIzaSyDyLGRas-kZFUc2kUusMSB4sED9X-PbzWI\"")
        buildConfigField("String","CHANEL_ID","\"UC2oIn4q3AiBK5-I-NbqMvFw\"")
        testInstrumentationRunner = config.versions.testInstrumentationRunner.get()
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile(config.versions.getDefaultProguardFile.get()),
                config.versions.proguardFiles.get()
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures{
        viewBinding = true
        buildConfig = true
    }
}

dependencies {

    implementation(libs.bundles.ui.component)
    implementation(libs.bundles.test.component)
    implementation(libs.bundles.network.component)

    //Hilt
    implementation(libs.hilt.android)
    kapt(libs.hilt.compilar)


}