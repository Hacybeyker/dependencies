object AppVersion {

    const val kotlinVersion                     = "1.9.0"

    const val compileSdkVersion                 = 35
    const val minSdkVersion                     = 24
    const val targetSdkVersion                  = 35

    const val testInstrumentationRunner         = "androidx.test.runner.AndroidJUnitRunner"

    const val coreKtxVersion                    = "1.10.1"
    const val appCompatVersion                  = "1.6.1"
    const val materialVersion                   = "1.9.0"
    const val constraintLayoutVersion           = "2.1.4"
    const val viewPager2Version                 = "1.0.0"
    const val cardViewVersion                   = "1.0.0"
    const val paletteVersion                    = "1.0.0"
    const val preferenceVersion                 = "1.2.1"
    const val legacySupportV4Version            = "1.0.0"
    const val navigationVersion                 = "2.7.1"

    const val daggerVersion                     = "2.47"
    const val hiltVersion                       = "2.47"
    const val fragmentKtxVersion                = "1.6.1"

    const val koinVersion                       = "3.4.3"
    const val koinScopeVersion                  = "2.2.3"

    const val retrofitVersion                   = "2.9.0"
    const val converterGsonVersion              = "2.9.0"
    const val gsonVersion                       = "2.10.1"
    const val loggingInterceptorVersion         = "4.11.0"
    const val okHttpJsonMockVersion             = "3.0"

    const val rxJavaVersion                     = "3.1.6"
    const val rxAndroidVersion                  = "3.0.2"
    const val adapterRxJavaVersion              = "2.9.0"

    const val lifecycleVersion                  = "2.6.1"
    const val coroutinesVersion                 = "1.7.3"

    const val roomVersion                       = "2.5.2"
    const val preferencesVersion                = "1.2.0"

    const val chuckerVersion                    = "4.0.0"

    const val glideVersion                      = "4.16.0"
    const val coilVersion                       = "1.2.2"
    const val roundedImageViewVersion           = "2.3.0"
    const val kenburnsViewVersion               = "1.0.7"
    const val touchImageViewVersion             = "3.1.0"
    const val zxingAndroidVersion               = "4.2.0"
    const val zxingCoreVersion                  = "3.4.0"
    const val slidableActivityVersion           = "2.1.0"
    const val tapTargetViewVersion              = "1.13.3"
    const val lottieVersion                     = "6.1.0"
    const val shimmerFacebookVersion            = "0.5.0"

    const val gmsMapsVersion                    = "18.1.0"
    const val hmsMapsVersion                    = "6.11.0.304"
}

object AppDependencies {
    const val kotlinStdlib                      = "org.jetbrains.kotlin:kotlin-stdlib:${AppVersion.kotlinVersion}"
    const val coreKtx                           = "androidx.core:core-ktx:${AppVersion.coreKtxVersion}"

    const val appCompat                         = "androidx.appcompat:appcompat:${AppVersion.appCompatVersion}"
    const val material                          = "com.google.android.material:material:${AppVersion.materialVersion}"
    const val constraintLayout                  = "androidx.constraintlayout:constraintlayout:${AppVersion.constraintLayoutVersion}"
    const val viewPager2                        = "androidx.viewpager2:viewpager2:${AppVersion.viewPager2Version}"
    const val cardView                          = "androidx.cardview:cardview:${AppVersion.cardViewVersion}"
    const val palette                           = "androidx.palette:palette-ktx:${AppVersion.paletteVersion}"
    const val preference                        = "androidx.preference:preference:${AppVersion.preferenceVersion}"
    const val legacySupportV4                   = "androidx.legacy:legacy-support-v4:${AppVersion.legacySupportV4Version}"
    const val navigationFragment                = "androidx.navigation:navigation-fragment-ktx:${AppVersion.navigationVersion}"
    const val navigationUI                      = "androidx.navigation:navigation-ui-ktx:${AppVersion.navigationVersion}"

    const val dagger                            = "com.google.dagger:dagger:${AppVersion.daggerVersion}"
    const val daggerCompiler                    = "com.google.dagger:dagger-compiler:${AppVersion.daggerVersion}"

    const val hilt                              = "com.google.dagger:hilt-android:${AppVersion.hiltVersion}"
    const val hiltCompiler                      = "com.google.dagger:hilt-compiler:${AppVersion.hiltVersion}"
    const val fragmentKtx                       = "androidx.fragment:fragment-ktx:${AppVersion.fragmentKtxVersion}"

    const val koinCore                          = "io.insert-koin:koin-core:${AppVersion.koinVersion}"
    const val koinAndroidxScope                 = "io.insert-koin:koin-androidx-scope:${AppVersion.koinScopeVersion}"
    const val koinAndroidxViewModel             = "io.insert-koin:koin-androidx-viewmodel:${AppVersion.koinScopeVersion}"

    const val retrofit                          = "com.squareup.retrofit2:retrofit:${AppVersion.retrofitVersion}"
    const val converterGson                     = "com.squareup.retrofit2:converter-gson:${AppVersion.converterGsonVersion}"
    const val gson                              = "com.google.code.gson:gson:${AppVersion.gsonVersion}"
    const val loggingInterceptor                = "com.squareup.okhttp3:logging-interceptor:${AppVersion.loggingInterceptorVersion}"
    const val okHttpJsonMock                    = "com.github.mirrajabi:okhttp-json-mock:${AppVersion.okHttpJsonMockVersion}"

    const val rxJava                            = "io.reactivex.rxjava3:rxjava:${AppVersion.rxJavaVersion}"
    const val rxAndroid                         = "io.reactivex.rxjava3:rxandroid:${AppVersion.rxAndroidVersion}"
    const val adapterRxJava                     = "com.squareup.retrofit2:adapter-rxjava3:${AppVersion.adapterRxJavaVersion}"

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
    const val coil                              = "io.coil-kt:coil:${AppVersion.coilVersion}"
    const val roundedImageView                  = "com.makeramen:roundedimageview:${AppVersion.roundedImageViewVersion}"
    const val kenburnsView                      = "com.flaviofaria:kenburnsview:${AppVersion.kenburnsViewVersion}"
    const val touchImageView                    = "com.github.MikeOrtiz:TouchImageView:${AppVersion.touchImageViewVersion}"
    const val zxingAndroid                      = "com.journeyapps:zxing-android-embedded:${AppVersion.zxingAndroidVersion}"
    const val zxingCore                         = "com.google.zxing:core:${AppVersion.zxingCoreVersion}"
    const val slidableActivity                  = "com.r0adkll:slidableactivity:${AppVersion.slidableActivityVersion}"
    const val tapTargetView                     = "com.getkeepsafe.taptargetview:taptargetview:${AppVersion.tapTargetViewVersion}"
    const val lottie                            = "com.airbnb.android:lottie:${AppVersion.lottieVersion}"
    const val shimmerFacebook                   = "com.facebook.shimmer:shimmer:${AppVersion.shimmerFacebookVersion}"

    const val gmsMaps                           = "com.google.android.gms:play-services-maps:${AppVersion.gmsMapsVersion}"
    const val hmsMaps                           = "com.huawei.hms:maps:${AppVersion.hmsMapsVersion}"

    const val chucker                           = "com.github.chuckerteam.chucker:library:${AppVersion.chuckerVersion}"
    const val chuckerNoOp                       = "com.github.chuckerteam.chucker:library-no-op:${AppVersion.chuckerVersion}"
}

object TestVersion{
    const val junitVersion                      = "4.13.2"
    const val mockitoVersion                    = "5.5.0"
    const val mockitoInlineVersion              = "5.2.0"
    const val mockitoKotlinVersion              = "5.1.0"
    const val extJUnitVersion                   = "1.1.5"
    const val espressoCoreVersion               = "3.5.1"
    const val kotlinCoroutinesTestVersion       = "1.7.3"
    const val robolectricVersion                = "4.10.3"
    const val robolectricShadowVersion          = "4.8.2"
    const val hiltVersion                       = "2.47"
    const val hamcrestVersion                   = "2.2"
    const val coreKtxVersion                    = "1.10.1"
    const val junitKtxVersion                   = "1.1.5"
    const val fragmentTestVersion               = "1.6.1"
    const val archCoreTestVersion               = "2.2.0"
    const val espressoContribVersion            = "3.4.0"
    const val mockWebServerVersion              = "4.11.0"
}

object TestDependencies{
    const val junit                             = "junit:junit:${TestVersion.junitVersion}"
    const val extJUnit                          = "androidx.test.ext:junit:${TestVersion.extJUnitVersion}"

    const val espressoCore                      = "androidx.test.espresso:espresso-core:${TestVersion.espressoCoreVersion}"
    const val espressoIntents                   = "androidx.test.espresso:espresso-intents:${TestVersion.espressoCoreVersion}"
    const val espressoContrib                   = "androidx.test.espresso:espresso-contrib:${TestVersion.espressoContribVersion}"

    const val mockitoCore                       = "org.mockito:mockito-core:${TestVersion.mockitoVersion}"
    const val mockitoInline                     = "org.mockito:mockito-inline:${TestVersion.mockitoInlineVersion}"
    const val mockitoKotlin                     = "org.mockito.kotlin:mockito-kotlin:${TestVersion.mockitoKotlinVersion}"

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
    const val detektVersion                     = "1.23.1"
}

object ValidationDependencies{
    const val detekt                            = "io.gitlab.arturbosch.detekt:detekt-formatting:${ValidateVersion.detektVersion}"
}