name: Construire NIA Jallel

on:
  workflow_dispatch:
  push:
    branches:
      - main

jobs:
  build:
    runs-on: ubuntu-latest
    steps:
      - name: Recuperer le projet
        uses: actions/checkout@v4

      - name: Installer Java
        uses: actions/setup-java@v4
        with:
          distribution: temurin
          java-version: '17'

      - name: Compiler l'APK
        run: gradle :app:assembleDebug

      - name: Publier l'APK
        uses: actions/upload-artifact@v4
        with:
          name: NIA-Jallel-APK
          path: app/build/outputs/apk/debug/app-debug.apk