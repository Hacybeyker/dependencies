object AppVersion {
    const val compileSdkVersion = 34
    const val minSdkVersion = 24
    const val targetSdkVersion = 34
    const val testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

    const val coreKtxVersion = "1.13.1"
    const val appCompatVersion = "1.7.0"
    const val materialVersion = "1.12.0"
    const val constraintLayoutVersion = "2.1.4"
    const val viewPager2Version = "1.1.0"

    const val hiltVersion = "2.51.1"
    const val fragmentKtxVersion = "1.8.1"

    const val retrofitVersion = "2.11.0"
    const val gsonVersion = "2.11.1"
    const val loggingInterceptorVersion = "4.12.0"
    const val okHttpJsonMockVersion = "3.0"

    const val lifecycleVersion = "2.8.3"
    const val coroutinesVersion = "1.8.1"

    const val roomVersion = "2.6.1"
    const val preferencesVersion = "1.2.0"

    const val chuckerVersion = "4.0.0"

    const val glideVersion = "4.16.0"

    const val gmsMapsVersion = "18.1.0"
    const val hmsMapsVersion = "6.11.0.304"

    const val lottieVersion = "6.4.1"

    const val shimmerFacebookVersion = "0.5.0"
}

object AppDependencies {
    const val coreKtx = "androidx.core:core-ktx:${AppVersion.coreKtxVersion}"

    const val appCompat = "androidx.appcompat:appcompat:${AppVersion.appCompatVersion}"
    const val material = "com.google.android.material:material:${AppVersion.materialVersion}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${AppVersion.constraintLayoutVersion}"
    const val viewPager2 = "androidx.viewpager2:viewpager2:${AppVersion.viewPager2Version}"

    const val hilt = "com.google.dagger:hilt-android:${AppVersion.hiltVersion}"
    const val hiltCompiler = "com.google.dagger:hilt-compiler:${AppVersion.hiltVersion}"
    const val fragmentKtx = "androidx.fragment:fragment-ktx:${AppVersion.fragmentKtxVersion}"

    const val retrofit = "com.squareup.retrofit2:retrofit:${AppVersion.retrofitVersion}"
    const val converterGson = "com.squareup.retrofit2:converter-gson:${AppVersion.retrofitVersion}"
    const val gson = "com.google.code.gson:gson:${AppVersion.gsonVersion}"
    const val loggingInterceptor = "com.squareup.okhttp3:logging-interceptor:${AppVersion.loggingInterceptorVersion}"
    const val okHttpJsonMock = "com.github.mirrajabi:okhttp-json-mock:${AppVersion.okHttpJsonMockVersion}"

    const val lifecycleViewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${AppVersion.lifecycleVersion}"
    const val lifecycleLiveData = "androidx.lifecycle:lifecycle-livedata-ktx:${AppVersion.lifecycleVersion}"
    const val lifecycleRuntime = "androidx.lifecycle:lifecycle-runtime-ktx:${AppVersion.lifecycleVersion}"

    const val coroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${AppVersion.coroutinesVersion}"
    const val coroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${AppVersion.coroutinesVersion}"

    const val roomRuntime = "androidx.room:room-runtime:${AppVersion.roomVersion}"
    const val roomCompiler = "androidx.room:room-compiler:${AppVersion.roomVersion}"
    const val roomKtx = "androidx.room:room-ktx:${AppVersion.roomVersion}"

    const val preferences = "androidx.preference:preference-ktx:${AppVersion.preferencesVersion}"

    const val glide = "com.github.bumptech.glide:glide:${AppVersion.glideVersion}"
    const val glideCompiler = "com.github.bumptech.glide:compiler:${AppVersion.glideVersion}"

    const val gmsMaps = "com.google.android.gms:play-services-maps:${AppVersion.gmsMapsVersion}"
    const val hmsMaps = "com.huawei.hms:maps:${AppVersion.hmsMapsVersion}"

    const val lottie = "com.airbnb.android:lottie:${AppVersion.lottieVersion}"

    const val chucker = "com.github.chuckerteam.chucker:library:${AppVersion.chuckerVersion}"
    const val chuckerNoOp = "com.github.chuckerteam.chucker:library-no-op:${AppVersion.chuckerVersion}"

    const val shimmerFacebook = "com.facebook.shimmer:shimmer:${AppVersion.shimmerFacebookVersion}"
}

object TestVersion {
    const val junitVersion = "5.10.3"
    const val mockitoInlineVersion = "5.2.0"
    const val mockitoKotlinVersion = "5.4.0"
    const val extJUnitVersion = "1.2.1"
    const val espressoCoreVersion = "3.6.1"
    const val kotlinCoroutinesTestVersion = "1.8.1"
    const val robolectricVersion = "4.13"
    const val hiltVersion = "2.51.1"
    const val coreKtxVersion = "1.6.1"
    const val junitKtxVersion = "1.2.1"
    const val fragmentTestVersion = "1.8.1"
    const val archCoreTestVersion = "2.2.0"
    const val espressoContribVersion = "3.4.0"
    const val mockWebServerVersion = "4.12.0"
}

object TestDependencies {
    const val junit = "org.junit.jupiter:junit-jupiter-api:${TestVersion.junitVersion}"
    const val extJUnit = "androidx.test.ext:junit:${TestVersion.extJUnitVersion}"
    const val espressoCore = "androidx.test.espresso:espresso-core:${TestVersion.espressoCoreVersion}"
    const val mockitoInline = "org.mockito:mockito-inline:${TestVersion.mockitoInlineVersion}"
    const val mockitoKotlin = "org.mockito.kotlin:mockito-kotlin:${TestVersion.mockitoKotlinVersion}"
    const val kotlinCoroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${TestVersion.kotlinCoroutinesTestVersion}"
    const val hiltAndroid = "com.google.dagger:hilt-android-testing:${TestVersion.hiltVersion}"
    const val hiltCompiler = "com.google.dagger:hilt-compiler:${TestVersion.hiltVersion}"
    const val robolectric = "org.robolectric:robolectric:${TestVersion.robolectricVersion}"
    const val coreKtx = "androidx.test:core-ktx:${TestVersion.coreKtxVersion}"
    const val junitKtx = "androidx.test.ext:junit-ktx:${TestVersion.junitKtxVersion}"
    const val fragment = "androidx.fragment:fragment-testing:${TestVersion.fragmentTestVersion}"
    const val archCore = "androidx.arch.core:core-testing:${TestVersion.archCoreTestVersion}"
    const val mockWebServer = "com.squareup.okhttp3:mockwebserver:${TestVersion.mockWebServerVersion}"
}

object ValidateVersion {
    const val detektVersion = "1.23.6"
}

object ValidationDependencies {
    const val detekt = "io.gitlab.arturbosch.detekt:detekt-formatting:${ValidateVersion.detektVersion}"
}
