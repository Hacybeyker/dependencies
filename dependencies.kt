object VersionApp {
    const val kotlinVersion                     = "1.5.10"
    const val compileSdkVersion                 = 30
    const val buildToolsVersion                 = "30.0.3"
    const val applicationId                     = "com.hacybeyker.moviesmvp"
    const val minSdkVersion                     = 23
    const val targetSdkVersion                  = 30
    const val versionCode                       = 1
    const val versionName                       = "1.0.0"
    const val testInstrumentationRunner         = "androidx.test.runner.AndroidJUnitRunner"

    const val coreKtxVersion                    = "1.5.0"
    const val appCompatVersion                  = "1.3.0"
    const val materialVersion                   = "1.3.0"
    const val constraintLayoutVersion           = "2.0.4"

    const val junitVersion                      = "4.13.2"
    const val mockitoCoreVersion                = "3.9.0"
    const val extJUnitVersion                   = "1.1.2"
    const val espressoCoreVersion               = "3.3.0"

    const val daggerVersion                     = "2.35.1"
    const val daggerCompilerVersionError        = "2.35.1"

    const val retrofitVersion                   = "2.9.0"
    const val converterGsonVersion              = "2.9.0"
    const val gsonVersion                       = "2.8.6"
    const val loggingInterceptorVersion         = "4.9.0"
    const val okHttpJsonMockVersion             = "3.0"

    const val rxJavaVersion                     = "2.2.7"
    const val rxAndroidVersion                  = "2.1.1"
    const val adapterRxJavaVersion              = "2.5.0"
}

object MainApplicationDependencies {
    const val kotlinStdlib                      = "org.jetbrains.kotlin:kotlin-stdlib:${VersionApp.kotlinVersion}"
    const val coreKtx                           = "androidx.core:core-ktx:${VersionApp.coreKtxVersion}"
    const val appCompat                         = "androidx.appcompat:appcompat:${VersionApp.appCompatVersion}"
    const val material                          = "com.google.android.material:material:${VersionApp.materialVersion}"
    const val constraintLayout                  = "androidx.constraintlayout:constraintlayout:${VersionApp.constraintLayoutVersion}"

    const val dagger                            = "com.google.dagger:dagger:${VersionApp.daggerVersion}"
    const val daggerCompiler                    = "com.google.dagger:dagger-compiler:${VersionApp.daggerCompilerVersionError}"

    const val retrofit                          = "com.squareup.retrofit2:retrofit:${VersionApp.retrofitVersion}"
    const val converterGson                     = "com.squareup.retrofit2:converter-gson:${VersionApp.converterGsonVersion}"
    const val gson                              = "com.google.code.gson:gson:${VersionApp.gsonVersion}"
    const val loggingInterceptor                = "com.squareup.okhttp3:logging-interceptor:${VersionApp.loggingInterceptorVersion}"
    const val okHttpJsonMock                    = "com.github.mirrajabi:okhttp-json-mock:${VersionApp.okHttpJsonMockVersion}"

    const val rxJava                            = "io.reactivex.rxjava2:rxjava:${VersionApp.rxJavaVersion}"
    const val rxAndroid                         = "io.reactivex.rxjava2:rxandroid:${VersionApp.rxAndroidVersion}"
    const val adapterRxJava                     = "com.squareup.retrofit2:adapter-rxjava2:${VersionApp.adapterRxJavaVersion}"
}

object TestDependencies{
    const val junit                             = "junit:junit:${VersionApp.junitVersion}"
    const val mockitoCore                       = "org.mockito:mockito-core:${VersionApp.mockitoCoreVersion}"
    const val extJUnit                          = "androidx.test.ext:junit:${VersionApp.extJUnitVersion}"
    const val espressoCore                      = "androidx.test.espresso:espresso-core:${VersionApp.espressoCoreVersion}"
}