# gson5-delegate

This is a simple library to bridge `gson` and `quilt-json5`.

## Maven

```xml
<repositories>
  <repository>
    <id>quiltmc</id>
    <name>QuiltMC</name>
    <url>https://maven.quiltmc.org/repository/release</url>
  </repository>
  <repository>
    <id>gaming32-releases</id>
    <name>Gaming32</name>
    <url>https://maven.jemnetworks.com/releases</url>
  </repository>
</repositories>

<dependencies>
  <dependency>
    <groupId>org.quiltmc</groupId>
    <artifactId>quilt-json5</artifactId>
    <version>1.0.2</version>
  </dependency>
  <dependency>
      <groupId>com.google.code.gson</groupId>
      <artifactId>gson</artifactId>
      <version>2.10</version>
  </dependency>
  <dependency>
    <groupId>io.github.gaming32</groupId>
    <artifactId>gson5-delegate</artifactId>
    <version>1.0.0</version>
  </dependency>
</dependencies>
```

## Gradle Groovy

```groovy
repositories {
    maven {
        url "https://maven.quiltmc.org/repository/release"
    }
    maven {
        url "https://maven.jemnetworks.com/releases"
    }
}

dependencies {
    implementation "org.quiltmc:quilt-json5:1.0.2"
    implementation "com.google.code.gson:gson:2.10"
    implementation "io.github.gaming32:gson5-delegate:1.0.0"
}
```

## Gradle Kotlin

```kotlin
repositories {
    maven("https://maven.quiltmc.org/repository/release")
    maven("https://maven.jemnetworks.com/releases")
}

dependencies {
    implementation("org.quiltmc:quilt-json5:1.0.2")
    implementation("com.google.code.gson:gson:2.10")
    implementation("io.github.gaming32:gson5-delegate:1.0.0")
}
```
