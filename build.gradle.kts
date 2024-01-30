plugins {
    id("java")
    id("com.github.johnrengelman.shadow") version "8.1.1"
}

group = "com.riddle"
version = "1.0.0-release"

repositories {
    mavenCentral()
}

dependencies {
    implementation(group = "com.formdev", name = "flatlaf", version = "3.3")
}
