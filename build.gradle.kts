plugins {
    java
}

group = "de.azuredawn"
version = "1.0.0"

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(17))
}

repositories {
    mavenCentral()

    maven {
        name = "labymod"
        url = uri("https://dist.labymod.net/api/v1/maven/release/")
    }
}

dependencies {
    // LabyMod 4 API
    compileOnly("net.labymod.api:addon:4.0.0")

    // Annotation Processor (WICHTIG für Addons!)
    annotationProcessor("net.labymod.api:addon:4.0.0")
}
