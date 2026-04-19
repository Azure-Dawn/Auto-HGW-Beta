# AutoHGW — LabyMod Addon

**Author:** AzureDawn25270  
**Compatibility:** Minecraft 1.8.9 – 1.21.11 (via LabyMod Neo)  

> Make yourself more likeable by automaticlly writing a HGW in the chat after each round.

---

## What it does

Pressing a configurable hotkey automatically sends exactly `HGW` into the chat.  
No prefix, no slash, no extra text — just `HGW`.

---

## Hotkey Setup

1. Open **ESC → Options → Controls → Key Binds**
2. Scroll to the **AutoHGW** category
3. Click the **Auto HGW** field and press your desired key
4. By default the key is **unbound** — you must assign one

The keybind supports:
- Any keyboard key
- Conflict detection (highlighted if the same key is used elsewhere)
- Persistent saving (survives game restarts)

---

## Build Instructions

### Requirements
- Java 21+
- Internet connection (Gradle downloads LabyMod dependencies automatically)

### Steps

```bash
git clone <your-repo-url>
cd autohgw
./gradlew build
```

The compiled addon JAR will be at:
```
build/libs/autohgw-<version>-release.jar
```

### Install
Copy the `-release.jar` into your LabyMod addons folder:
```
%appdata%/.minecraft/labymod-neo/addons/   (Windows)
~/.minecraft/labymod-neo/addons/           (Linux/macOS)
```

---

## Project Structure

```
autohgw/
├── build.gradle.kts              ← root build + addon metadata
├── settings.gradle.kts           ← Gradle settings, plugin repos
├── gradle.properties             ← JVM args, MC versions list
└── core/
    ├── build.gradle.kts          ← annotation processor setup
    └── src/main/
        ├── java/net/labymod/addons/autohgw/
        │   ├── AutoHGW.java                    ← Main addon class (@AddonMain)
        │   ├── AutoHGWConfiguration.java       ← Config (enabled toggle only)
        │   ├── input/
        │   │   └── AutoHGWKeyBinding.java      ← Keybind registration
        │   └── listener/
        │       └── HGWKeyListener.java         ← Tick listener, sends "HGW"
        └── resources/
            ├── addon.json                      ← Addon metadata
            └── assets/autohgw/
                ├── .assetsroot                 ← LabyMod asset root marker
                └── i18n/en_us.json             ← English translations
```
