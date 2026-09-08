@file:Suppress("UnstableApiUsage")

dependencyResolutionManagement {
    repositoriesMode = RepositoriesMode.FAIL_ON_PROJECT_REPOS
    repositories {
        mavenCentral()
        maven { url = uri("https://repo.opencollab.dev/maven-releases") } //cloudburst math
    }
}

rootProject.name = "cumulus"
