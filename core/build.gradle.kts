plugins {
	`java-library`
	kotlin("jvm")
}

group = "mc.reduino"
version = "1.0.0"

repositories {
	mavenCentral()
}


kotlin {
	jvmToolchain(21)
}


tasks {
	jar {
		archiveBaseName = "reduino-core"
	}
}