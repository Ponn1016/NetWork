plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
}

android {
    namespace = "app.uemura.ponn.weatherforecast"
    compileSdk = 33

    defaultConfig {
        applicationId = "app.uemura.ponn.weatherforecast"
        minSdk = 24
        targetSdk = 33
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
        viewBinding =true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    //Retrofit,Okhttpの導入
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-moshi:2.9.0")
    implementation("com.squareup.okhttp3:okhttp:4.10.0")
    implementation("com.squareup.okhttp3:logging-interceptor:4.10.0")

    //Moshiの導入
    implementation("com.squareup.moshi:moshi.1.14.0")
    implementation("com.squareup.moshi:moshi-kotlin:1.14.0")

    //coilの導入
    implementation("io.coil-kt:coil:2.2.2")
    implementation("io.coil-kt:coil-svg:2.2.2")

    //Coroutinesの導入
    implementation("org.jetbrains.kotlinx:kotlin-coroutines-core:1.6.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.5.1")
}