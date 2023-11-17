plugins {
//    kotlin("jvm") version "1.9.20"
    kotlin("jvm") version "2.0.0-Beta1"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-compiler:1.9.20")
}

kotlin {
    jvmToolchain(8)
}
