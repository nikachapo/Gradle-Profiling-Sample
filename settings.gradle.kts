pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Gradle Optimisation Sample"
include(":app")
include(":feature1")
include(":feature2")
include(":feature3")
include(":feature4")
include(":feature5")
include(":feature6")
include(":feature7")
include(":feature8")
include(":feature9")
include(":feature10")
