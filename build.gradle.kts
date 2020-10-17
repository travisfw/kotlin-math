plugins {
  idea
  id("org.jetbrains.kotlin.jvm") version "1.4.10"
  `java-library`
  `maven-publish`
}

repositories {
  jcenter()
}

dependencies {
  implementation( name = "kotlin-stdlib",
      group = "org.jetbrains.kotlin", version = "1.4.10" )

  testImplementation(name = "kotlin-test-junit", group = "org.jetbrains.kotlin" )
  testImplementation(name = "junit", group = "junit", version = "4.12")
}

/*sourceSets {
  main.kotlin.srcDirs.add( "src/main/kotlin")
}*/

publishing {
  publications {
    create<MavenPublication>("maven") {
      artifactId = "dim-math"
      groupId = "com.travisfw"
      version = "0.0.1"

      from(components["kotlin"])

      pom {
        name.set("dim-math")
        description.set("Math in multiple dimensions.")
        url.set("https://github.com/travisfw/kotlin-math")
        licenses {
          license {
            name.set("Apache")
//            url.set("https://www.gnu.org/licenses/gpl-3.0.txt")
          }
        }
        developers {
          developer {
            id.set("romainguy")
            name.set("Romain Guy")
            email.set("romainguy@curious-creature.com")
          }
          developer {
            id.set("travisfw")
            name.set("Travis Well")
//            email.set("")
          }
        }
        scm {
//          connection.set("scm:git:git://example.com/my-library.git")
//          developerConnection.set("scm:git:ssh://example.com/my-library.git")
          url.set("https://github.com/travisfw/kotlin-math.git")
        }
      }

    }
  }
}
