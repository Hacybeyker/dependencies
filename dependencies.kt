object AppVersion {

    const val kotlinVersion                     = "1.5.31"

    const val compileSdkVersion                 = 31
    const val buildToolsVersion                 = "30.0.3"
    const val minSdkVersion                     = 23
    const val targetSdkVersion                  = 31

    const val testInstrumentationRunner         = "androidx.test.runner.AndroidJUnitRunner"

    const val coreKtxVersion                    = "1.7.0"
    const val appCompatVersion                  = "1.4.1"
    const val materialVersion                   = "1.5.0"
    const val constraintLayoutVersion           = "2.1.3"
    const val viewPager2Version                 = "1.0.0"

    const val daggerVersion                     = "2.35.1"
    const val hiltVersion                       = "2.40.5"
    const val fragmentKtxVersion                = "1.4.0"

    const val koinVersion                       = "2.2.3"

    const val retrofitVersion                   = "2.9.0"
    const val converterGsonVersion              = "2.9.0"
    const val gsonVersion                       = "2.8.6"
    const val loggingInterceptorVersion         = "4.9.0"
    const val okHttpJsonMockVersion             = "3.0"

    const val rxJavaVersion                     = "2.2.7"
    const val rxAndroidVersion                  = "2.1.1"
    const val adapterRxJavaVersion              = "2.5.0"

    const val lifecycleVersion                  = "2.4.1"
    const val coroutinesVersion                 = "1.6.0"

    const val roomVersion                       = "2.4.2"
    const val preferencesVersion                = "1.2.0"

    const val chuckerVersion                    = "3.5.0"

    const val glideVersion                      = "4.12.0"

    const val gmsMapsVersion                    = "17.0.1"
    const val hmsMapsVersion                    = "6.0.0.301"

    const val lottieVersion                     = "5.0.3"

    const val shimmerFacebookVersion            = "0.5.0"
}

object AppDependencies {
    const val kotlinStdlib                      = "org.jetbrains.kotlin:kotlin-stdlib:${AppVersion.kotlinVersion}"
    const val coreKtx                           = "androidx.core:core-ktx:${AppVersion.coreKtxVersion}"

    const val appCompat                         = "androidx.appcompat:appcompat:${AppVersion.appCompatVersion}"
    const val material                          = "com.google.android.material:material:${AppVersion.materialVersion}"
    const val constraintLayout                  = "androidx.constraintlayout:constraintlayout:${AppVersion.constraintLayoutVersion}"
    const val viewPager2                        = "androidx.viewpager2:viewpager2:${AppVersion.viewPager2Version}"

    const val dagger                            = "com.google.dagger:dagger:${AppVersion.daggerVersion}"
    const val daggerCompiler                    = "com.google.dagger:dagger-compiler:${AppVersion.daggerVersion}"

    const val hilt                              = "com.google.dagger:hilt-android:${AppVersion.hiltVersion}"
    const val hiltCompiler                      = "com.google.dagger:hilt-compiler:${AppVersion.hiltVersion}"
    const val fragmentKtx                       = "androidx.fragment:fragment-ktx:${AppVersion.fragmentKtxVersion}"

    const val koinCore                          = "io.insert-koin:koin-core:${AppVersion.koinVersion}"
    const val koinAndroidxScope                 = "io.insert-koin:koin-androidx-scope:${AppVersion.koinVersion}"
    const val koinAndroidxViewModel             = "io.insert-koin:koin-androidx-viewmodel:${AppVersion.koinVersion}"

    const val retrofit                          = "com.squareup.retrofit2:retrofit:${AppVersion.retrofitVersion}"
    const val converterGson                     = "com.squareup.retrofit2:converter-gson:${AppVersion.converterGsonVersion}"
    const val gson                              = "com.google.code.gson:gson:${AppVersion.gsonVersion}"
    const val loggingInterceptor                = "com.squareup.okhttp3:logging-interceptor:${AppVersion.loggingInterceptorVersion}"
    const val okHttpJsonMock                    = "com.github.mirrajabi:okhttp-json-mock:${AppVersion.okHttpJsonMockVersion}"

    const val rxJava                            = "io.reactivex.rxjava2:rxjava:${AppVersion.rxJavaVersion}"
    const val rxAndroid                         = "io.reactivex.rxjava2:rxandroid:${AppVersion.rxAndroidVersion}"
    const val adapterRxJava                     = "com.squareup.retrofit2:adapter-rxjava2:${AppVersion.adapterRxJavaVersion}"

    const val lifecycleViewModel                = "androidx.lifecycle:lifecycle-viewmodel-ktx:${AppVersion.lifecycleVersion}"
    const val lifecycleLiveData                 = "androidx.lifecycle:lifecycle-livedata-ktx:${AppVersion.lifecycleVersion}"
    const val lifecycleRuntime                  = "androidx.lifecycle:lifecycle-runtime-ktx:${AppVersion.lifecycleVersion}"

    const val coroutinesCore                    = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${AppVersion.coroutinesVersion}"
    const val coroutinesAndroid                 = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${AppVersion.coroutinesVersion}"

    const val roomRuntime                       = "androidx.room:room-runtime:${AppVersion.roomVersion}"
    const val roomCompiler                      = "androidx.room:room-compiler:${AppVersion.roomVersion}"
    const val roomKtx                           = "androidx.room:room-ktx:${AppVersion.roomVersion}"

    const val preferences                       = "androidx.preference:preference-ktx:${AppVersion.preferencesVersion}"

    const val glide                             = "com.github.bumptech.glide:glide:${AppVersion.glideVersion}"
    const val glideCompiler                     = "com.github.bumptech.glide:compiler:${AppVersion.glideVersion}"

    const val gmsMaps                           = "com.google.android.gms:play-services-maps:${AppVersion.gmsMapsVersion}"
    const val hmsMaps                           = "com.huawei.hms:maps:${AppVersion.hmsMapsVersion}"

    const val lottie                            = "com.airbnb.android:lottie:${AppVersion.lottieVersion}"

    const val chucker                           = "com.github.chuckerteam.chucker:library:${AppVersion.chuckerVersion}"
    const val chuckerNoOp                       = "com.github.chuckerteam.chucker:library-no-op:${AppVersion.chuckerVersion}"

    const val shimmerFacebook                   = "com.facebook.shimmer:shimmer:${AppVersion.shimmerFacebookVersion}"
}

object TestVersion{
    const val junitVersion                      = "4.13.2"
    const val mockitoVersion                    = "4.3.1"
    const val mockitoKotlinVersion              = "4.0.0"
    const val extJUnitVersion                   = "1.1.3"
    const val espressoCoreVersion               = "3.4.0"
    const val mockitoNhaarmanVersion            = "2.2.0"
    const val kotlinCoroutinesTestVersion       = "1.3.2"
    const val robolectricVersion                = "4.7.3"
    const val robolectricShadowVersion          = "4.1"
    const val hiltVersion                       = "2.40.5"
    const val hamcrestVersion                   = "2.2"
    const val coreKtxVersion                    = "1.4.0"
    const val junitKtxVersion                   = "1.1.3"
    const val fragmentTestVersion               = "1.4.1"
    const val archCoreTestVersion               = "2.1.0"
    const val espressoContribVersion            = "3.4.0"
    const val mockWebServerVersion              = "4.9.3"
}

object TestDependencies{
    const val junit                             = "junit:junit:${TestVersion.junitVersion}"
    const val extJUnit                          = "androidx.test.ext:junit:${TestVersion.extJUnitVersion}"

    const val espressoCore                      = "androidx.test.espresso:espresso-core:${TestVersion.espressoCoreVersion}"
    const val espressoIntents                   = "androidx.test.espresso:espresso-intents:${TestVersion.espressoCoreVersion}"
    const val espressoContrib                   = "androidx.test.espresso:espresso-contrib:${TestVersion.espressoContribVersion}"

    const val mockitoCore                       = "org.mockito:mockito-core:${TestVersion.mockitoVersion}"
    const val mockitoInline                     = "org.mockito:mockito-inline:${TestVersion.mockitoVersion}"
    const val mockitoKotlin                     = "org.mockito.kotlin:mockito-kotlin:${TestVersion.mockitoKotlinVersion}"
    const val mockitoKotlinNhaarman             = "com.nhaarman.mockitokotlin2:mockito-kotlin:${TestVersion.mockitoNhaarmanVersion}"

    const val kotlinCoroutines                  = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${TestVersion.kotlinCoroutinesTestVersion}"
    const val hiltAndroid                       = "com.google.dagger:hilt-android-testing:${TestVersion.hiltVersion}"
    const val hiltCompiler                      = "com.google.dagger:hilt-compiler:${TestVersion.hiltVersion}"

    const val robolectric                       = "org.robolectric:robolectric:${TestVersion.robolectricVersion}"
    const val robolectricShadow                 = "org.robolectric:shadows-supportv4:${TestVersion.robolectricShadowVersion}"

    const val hamcrest                          = "org.hamcrest:hamcrest:${TestVersion.hamcrestVersion}"
    const val coreKtx                           = "androidx.test:core-ktx:${TestVersion.coreKtxVersion}"
    const val junitKtx                          = "androidx.test.ext:junit-ktx:${TestVersion.junitKtxVersion}"
    const val fragment                          = "androidx.fragment:fragment-testing:${TestVersion.fragmentTestVersion}"
    const val archCore                          = "androidx.arch.core:core-testing:${TestVersion.archCoreTestVersion}"
    const val mockWebServer                     = "com.squareup.okhttp3:mockwebserver:${TestVersion.mockWebServerVersion}"
}

object ValidateVersion{
    const val detektVersion                     = "1.18.0"
}

object ValidationDependencies{
    const val detekt                            = "io.gitlab.arturbosch.detekt:detekt-formatting:${ValidateVersion.detektVersion}"
}