import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar

plugins {
    id("org.jetbrains.kotlin.jvm")
    id("com.github.johnrengelman.shadow")
}

group = "com.github.holgerbrandl"

repositories {
    mavenCentral()
}

val shadowJar by tasks.getting(ShadowJar::class) {
    // set empty string to classifier and version to get predictable jar file name: build/libs/kscript-annotations.jar
    archiveName = "kscript-annotations.jar"
}

// Disable standard jar task to avoid building non-shadow jars
val jar by tasks.getting {
    enabled = false
}
// Build shadowJar when
val assemble by tasks.getting {
    dependsOn(shadowJar)
}
