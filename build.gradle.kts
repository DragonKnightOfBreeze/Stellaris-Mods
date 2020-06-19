//plugins {
//    kotlin("jvm") version "1.3.72"
//}

allprojects {
	group = "com.windea"
	version = "1.0.0"

	buildscript{
		repositories {
			maven("https://maven.aliyun.com/nexus/content/groups/public")
			mavenCentral()
			jcenter()
		}
	}

	repositories {
		maven("https://maven.aliyun.com/nexus/content/groups/public")
		mavenCentral()
		jcenter()
	}

	//apply {
	//	plugin("org.jetbrains.kotlin.jvm")
	//}
	//
	//dependencies {
	//	implementation(kotlin("stdlib"))
	//	implementation(kotlin("test-junit"))
	//}
}
