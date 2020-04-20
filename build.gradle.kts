plugins {
    kotlin("jvm") version "1.3.70"
}

allprojects {
	group = "com.windea"
	version = "1.0.0"

	apply {
		plugin("org.jetbrains.kotlin.jvm")
	}

	repositories {
		maven("https://maven.aliyun.com/nexus/content/groups/public")
		mavenCentral()
		jcenter()
	}

	dependencies {
		implementation(kotlin("stdlib"))
		implementation(kotlin("test-junit"))
	}

	tasks {
		val prefix = when(project.name){
			"kareeze-stories" -> ".kareeze"
			"kitsune" -> ".kitsune"
			else -> ""
		}
		compileKotlin {
			incremental = true
			javaPackagePrefix = "com.windea.mod.stellaris$prefix"
			kotlinOptions {
				jvmTarget = "11"
			}
		}
		compileTestKotlin {
			incremental = true
			javaPackagePrefix = "com.windea.mod.stellaris$prefix"
			kotlinOptions {
				jvmTarget = "11"
			}
		}
	}
}
