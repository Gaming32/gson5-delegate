plugins {
    java
    `java-library`
    `maven-publish`
}

group = "io.github.gaming32"
version = "1.0.0"

repositories {
    mavenCentral()
    maven("https://maven.quiltmc.org/repository/release")
}

java {
    withJavadocJar()
    withSourcesJar()
}

publishing {
    repositories {
        maven {
            name = "gaming32"
            credentials(PasswordCredentials::class)

            val baseUri = "https://maven.jemnetworks.com"
            url = uri(baseUri + if (version.toString().endsWith("-SNAPSHOT")) "/snapshots" else "/releases")
        }
    }

    publications {
        create<MavenPublication>("maven") {
            groupId = project.group.toString()
            artifactId = project.name
            version = project.version.toString()

            from(components["java"])
        }
    }
}

dependencies {
    implementation("com.google.code.gson:gson:2.10")
    implementation("org.quiltmc:quilt-json5:1.0.2")

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.9.0")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

tasks.javadoc {
    if (JavaVersion.current().isJava9Compatible) {
        (options as StandardJavadocDocletOptions).addBooleanOption("html5", true)
    }
}
