plugins {
    kotlin("jvm") version libs.versions.kotlin
}

allprojects {
    repositories {
        mavenCentral()
    }
}

subprojects {
    apply(plugin = "org.jetbrains.kotlin.jvm")
}
