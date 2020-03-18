plugins {
    kotlin("jvm") version "1.3.70"
}

group = "com.windea"
version = "1.0.0"

repositories {
    maven("https://maven.aliyun.com/nexus/content/groups/public")
    mavenCentral()
    jcenter()
}

tasks {
    compileKotlin {
        incremental = true
        javaPackagePrefix = "com.windea.mod.stellaris"
        kotlinOptions {
            jvmTarget = "11"
        }
    }
    compileTestKotlin {
        incremental = true
        javaPackagePrefix = "com.windea.mod.stellaris"
        kotlinOptions {
            jvmTarget = "11"
        }
    }
}
