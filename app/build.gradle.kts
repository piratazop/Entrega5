import org.gradle.internal.impldep.com.google.api.services.storage.model.Bucket

plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
  


}

android {
    namespace = "com.example.modulo5"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.modulo5"
        minSdk = 30
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
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
    }
    buildFeatures{
        //noinspection DataBindingWithoutKapt
        dataBinding = true
    }
}

dependencies {

    implementation(libs.androidx.navigation.fragment.ktx)
    implementation(libs.androidx.navigation.ui.ktx)


    //Room
    //val room_version = "2.6.0"
    //implementation(libs.androidx.room.runtime)
   // implementation(libs.androidx.room.ktx)
    //kapt(libs.androidx.room.compiler)

    //Fragment KTX
    //implementation(libs.androidx.fragment.ktx)
    //Bucket.Lifecycle and LiveData val lifecycle_version = "2.4.0"

    //implementation(libs.androidx.lifecycle.viewmodel.ktx.v240)
    //implementation("androidx.lifecycle:lifecycle-li


    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.viewmodel.ktx)
    implementation (libs.androidx.lifecycle.extensions)

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}