plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.projetws"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.projetws"
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
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    implementation(libs.firebase.crashlytics.buildtools)
    implementation(libs.tracing.perfetto.handshake)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)


    implementation(libs.glide)
    annotationProcessor(libs.glide.compiler)
    implementation(libs.firebase.crashlytics.buildtools)
    implementation(libs.tracing.perfetto.handshake)

    implementation(libs.volley)
    implementation(libs.gson)

    implementation(libs.circleimageview)

}


