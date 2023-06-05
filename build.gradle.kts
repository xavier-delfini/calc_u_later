plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven {
        setUrl("https://plugins.gradle.org/m2/")
    }
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation ("org.openjfx:javafx-controls:16")
    implementation ("org.openjfx:javafx-fxml:16")
    implementation ("org.openjfx:javafx-graphics:16")
    implementation ("org.openjfx:javafx-base:16")
    implementation ("org.openjfx:javafx-media:16")
    implementation ("org.openjfx:javafx-web:16")
    implementation ("org.openjfx:javafx-swing:16")
    implementation ("org.openjfx:javafx-swt:16")
    implementation ("org.openjfx:javafx-graphics:16")
}

tasks.test {
    useJUnitPlatform()
}