plugins {
    kotlin("plugin.serialization") version libs.versions.kotlin
}

dependencies {
    implementation(libs.contentNegotiation)
    implementation(libs.kotlinxSerialization)
    implementation(libs.ktorSerialization)
    implementation(libs.ktorServer)
    implementation(libs.nettyServer)
    implementation(libs.slf4j)
    implementation(libs.statusPages)
}