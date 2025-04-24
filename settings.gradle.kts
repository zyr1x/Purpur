import xyz.jpenilla.toothpick.setupToothpickProject
import java.util.Locale

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
    repositories {
        mavenLocal()
        gradlePluginPortal()
        mavenCentral()
        maven("https://repo.jpenilla.xyz/snapshots")
    }
}

plugins {
    id("xyz.jpenilla.toothpick.settings") version "1.1.1-SNAPSHOT"
}

val forkName = "Purpur"
rootProject.name = forkName.toLowerCase(Locale.ROOT)
setupToothpickProject(rootProject, forkName)
