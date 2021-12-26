plugins {
  id("com.android.application")
  id("com.squareup.wire")
}

android {
  compileSdkVersion(30)
  buildToolsVersion("30.0.2")

  defaultConfig {
    applicationId = "com.square.wire.java.sample.myapplication"
    minSdkVersion(28)
    targetSdkVersion(30)
    versionCode = 1
    versionName = "1.0"
  }

  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
  }
}

wire {
  java {
    android = true
  }
}

dependencies {
  implementation("androidx.appcompat:appcompat:1.4.0")
  implementation("androidx.constraintlayout:constraintlayout:2.1.2")
}

buildscript {
  repositories {
    mavenCentral()
    google()
    jcenter()
  }
  dependencies {
    classpath("com.android.tools.build:gradle:3.6.4")
    classpath("com.squareup.wire:wire-gradle-plugin")
  }
}
