object VersionApp {
    //Kotlin
    const val kotlinVersion                     = "1.5.10"
    //SDK
    const val compileSdkVersion                 = 30
    const val buildToolsVersion                 = "30.0.3"
    const val minSdkVersion                     = 23
    const val targetSdkVersion                  = 30

    const val testInstrumentationRunner         = "androidx.test.runner.AndroidJUnitRunner"

    const val coreKtxVersion                    = "1.6.0"
    const val appCompatVersion                  = "1.3.1"
    const val materialVersion                   = "1.4.0"
    const val constraintLayoutVersion           = "2.1.0"

    const val junitVersion                      = "4.13.2"
    const val mockitoCoreVersion                = "3.9.0"
    const val extJUnitVersion                   = "1.1.3"
    const val espressoCoreVersion               = "3.4.0"
    const val mockitoInlineVersion              = "3.1.0"
    const val mockitoKotlinVersion              = "2.2.0"
    const val kotlinCoroutinesTestVersion       = "1.3.2"
    const val robolectricVersion                = "4.3"

    const val daggerVersion                     = "2.35.1"
    const val daggerCompilerVersionError        = "2.35.1"

    const val koinVersion                       = "2.2.3"

    const val retrofitVersion                   = "2.9.0"
    const val converterGsonVersion              = "2.9.0"
    const val gsonVersion                       = "2.8.6"
    const val loggingInterceptorVersion         = "4.9.0"
    const val okHttpJsonMockVersion             = "3.0"

    const val rxJavaVersion                     = "2.2.7"
    const val rxAndroidVersion                  = "2.1.1"
    const val adapterRxJavaVersion              = "2.5.0"

    const val gmsMapsVersion                    = "17.0.1"
    const val hmsMapsVersion                    = "6.0.0.301"
}

object MainApplicationDependencies {
    const val kotlinStdlib                      = "org.jetbrains.kotlin:kotlin-stdlib:${VersionApp.kotlinVersion}"
    const val coreKtx                           = "androidx.core:core-ktx:${VersionApp.coreKtxVersion}"
    const val appCompat                         = "androidx.appcompat:appcompat:${VersionApp.appCompatVersion}"
    const val material                          = "com.google.android.material:material:${VersionApp.materialVersion}"
    const val constraintLayout                  = "androidx.constraintlayout:constraintlayout:${VersionApp.constraintLayoutVersion}"

    const val dagger                            = "com.google.dagger:dagger:${VersionApp.daggerVersion}"
    const val daggerCompiler                    = "com.google.dagger:dagger-compiler:${VersionApp.daggerCompilerVersionError}"

    const val koinCore                          = "io.insert-koin:koin-core:${VersionApp.koinVersion}"
    const val koinAndroidxScope                 = "io.insert-koin:koin-androidx-scope:${VersionApp.koinVersion}"
    const val koinAndroidxViewModel             = "io.insert-koin:koin-androidx-viewmodel:${VersionApp.koinVersion}"

    const val retrofit                          = "com.squareup.retrofit2:retrofit:${VersionApp.retrofitVersion}"
    const val converterGson                     = "com.squareup.retrofit2:converter-gson:${VersionApp.converterGsonVersion}"
    const val gson                              = "com.google.code.gson:gson:${VersionApp.gsonVersion}"
    const val loggingInterceptor                = "com.squareup.okhttp3:logging-interceptor:${VersionApp.loggingInterceptorVersion}"
    const val okHttpJsonMock                    = "com.github.mirrajabi:okhttp-json-mock:${VersionApp.okHttpJsonMockVersion}"

    const val rxJava                            = "io.reactivex.rxjava2:rxjava:${VersionApp.rxJavaVersion}"
    const val rxAndroid                         = "io.reactivex.rxjava2:rxandroid:${VersionApp.rxAndroidVersion}"
    const val adapterRxJava                     = "com.squareup.retrofit2:adapter-rxjava2:${VersionApp.adapterRxJavaVersion}"

    const val gmsMaps                           = "com.google.android.gms:play-services-maps:${VersionApp.gmsMapsVersion}"
    const val hmsMaps                           = "com.huawei.hms:maps:${VersionApp.hmsMapsVersion}"
}

object TestDependencies{
    const val junit                             = "junit:junit:${VersionApp.junitVersion}"
    const val extJUnit                          = "androidx.test.ext:junit:${VersionApp.extJUnitVersion}"

    const val espressoCore                      = "androidx.test.espresso:espresso-core:${VersionApp.espressoCoreVersion}"

    const val mockitoCore                       = "org.mockito:mockito-core:${VersionApp.mockitoCoreVersion}"
    const val mockitoInline                     = "org.mockito:mockito-inline:${VersionApp.mockitoInlineVersion}"
    const val mockitoKotlin                     = "com.nhaarman.mockitokotlin2:mockito-kotlin:${VersionApp.mockitoKotlinVersion}"

    const val kotlinCoroutinesTest              = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${VersionApp.kotlinCoroutinesTestVersion}"
    const val robolectric                       = "org.robolectric:robolectric:${VersionApp.robolectricVersion}"
}