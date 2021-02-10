plugins {
  kotlin("multiplatform").version("1.4.30")
  id("com.apollographql.apollo").version("2.5.3")
  id("maven-publish")
  id("net.mbonnin.one.eight").version("0.1")
}

group = "com.example"
version = "0.1"
repositories {
  mavenCentral()
}
kotlin {
  jvm()
  ios()

  sourceSets {
    val commonMain by getting {
      dependencies {
        implementation("com.apollographql.apollo:apollo-runtime-kotlin:2.5.3")
      }
    }
  }
}