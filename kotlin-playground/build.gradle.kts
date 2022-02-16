plugins {
    kotlin("jvm") version "1.4.31"
}

group = "ac.weekly"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation(kotlin("script-runtime"))
}
