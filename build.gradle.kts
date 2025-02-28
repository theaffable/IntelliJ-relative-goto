plugins {
    id("java")
    alias(libs.plugins.kotlin)
    alias(libs.plugins.intelliJPlatform)
}

group = "theaffable"
version = "0.0.1"

repositories {
    mavenCentral()

    intellijPlatform {
        defaultRepositories()
    }
}

kotlin {
    jvmToolchain(17)
}

dependencies {
    intellijPlatform {
        create("IC", "2023.3.8")

        instrumentationTools()
        pluginVerifier()
        zipSigner()
    }
}

intellijPlatform {
    pluginConfiguration {
        version = "2024.2+"

        ideaVersion {
            sinceBuild = "233"
            untilBuild = "242.*"
        }
    }

    signing {
        certificateChain = providers.environmentVariable("CERTIFICATE_CHAIN")
        privateKey = providers.environmentVariable("PRIVATE_KEY")
        password = providers.environmentVariable("PRIVATE_KEY_PASSWORD")
    }

    publishing {
        token = providers.environmentVariable("PUBLISH_TOKEN")
    }
}

// // Configure Gradle IntelliJ Plugin
// // Read more: https://plugins.jetbrains.com/docs/intellij/tools-gradle-intellij-plugin.html
// intellij {
//     version.set("2023.2.6")
//     type.set("IC") // Target IDE Platform
//
//     plugins.set(listOf(/* Plugin Dependencies */))
// }

tasks {
    wrapper {
        gradleVersion = providers.gradleProperty("gradleVersion").get()
    }
}
