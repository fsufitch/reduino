plugins {
    `java-library`
    kotlin("jvm")
}

group = "mc.reduino.fabric"
version = parent!!.version

dependencies {
    implementation(project(":core"))
    implementation(kotlin("stdlib-jdk8"))
}

repositories {
    mavenCentral()
}

kotlin {
    jvmToolchain(21)
}

tasks {
    jar {
        archiveBaseName = "reduino-fabric"
    }
}