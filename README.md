# Fracton

The project focuses on developing a modular system for Java applications. Its goal is to divide complex software into smaller, independent modules that can be dynamically loaded, replaced, or extended at runtime.
This approach enhances flexibility, maintainability, and scalability by allowing developers to build applications as a collection of cohesive, reusable components.

## Status

|      | Build Status                                                                                         |
|------|------------------------------------------------------------------------------------------------------|
| main | ![Java CI with Gradle](https://github.com/breuerlukas/fracton/actions/workflows/gradle.yml/badge.svg) |

## Installation

```
repositories {
  maven {
    url = uri("https://maven.pkg.github.com/breuerlukas/fracton")
    credentials {
      username = project.findProperty("gpr.user")?.toString() ?: System.getenv("GITHUB_USERNAME")
      password = project.findProperty("gpr.token")?.toString() ?: System.getenv("GITHUB_TOKEN")
    }
  }
}

dependencies {
  implementation("de.lukasbreuer:fracton:1.0.0-SNAPSHOT")
}
```

## License

[GPL](https://github.com/breuerlukas/fracton/blob/main/LICENSE.md)