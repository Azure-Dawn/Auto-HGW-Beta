plugins { java }

group = "de.gvvv"
version = "1.0.0"

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(17))
}

repositories {
    mavenCentral()
    maven("https://dist.labymod.net/api/v1/maven/release/")
}

dependencies {
    compileOnly("net.labymod.api:addon:4.0.0")
}
