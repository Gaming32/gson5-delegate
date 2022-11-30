plugins {
    java
    `java-library`
}

group = "io.github.gaming32"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://maven.quiltmc.org/repository/release")
}

dependencies {
    api("com.google.code.gson:gson:2.10")
    api("org.quiltmc:quilt-json5:1.0.2")

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.9.0")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}
