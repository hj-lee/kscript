plugins {
    kotlin("jvm") version "1.3.10"
    id("maven")
}

group = "com.github.holgerbrandl.kscript.launcher"

dependencies {
    compile("org.jetbrains.kotlin:kotlin-stdlib")

    compile("com.offbytwo:docopt:0.6.0.20150202")

    compile("com.jcabi:jcabi-aether:0.10.1") {
        exclude("org.hibernate", "hibernate-validator")
        exclude("org.slf4j", "slf4j-api")
        exclude("org.slf4j", "jcl-over-slf4j")
        exclude("org.apache.commons", "commons-lang3")
        exclude("cglib", "cglib")
        exclude("org.kuali.maven.wagons", "maven-s3-wagon")
    }
    compile("org.apache.maven:maven-core:3.0.3")
    compile("org.slf4j:slf4j-nop:1.7.25")

    testCompile("junit:junit:4.12")
    testCompile( "io.kotlintest:kotlintest:2.0.7")
    testCompile(kotlin("script-runtime"))
}

repositories {
    jcenter()
}
