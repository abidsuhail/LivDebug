# LivDebug 🪵

A lightweight Kotlin logging utility for Android that provides **controlled logging with explicit initialization** and optional production support.

LivDebug is intentionally minimal:
- No automatic logging
- No hidden globals
- No logs unless you explicitly enable them

If it’s not initialized, it does **nothing**.

---

## Why LivDebug?

Android logs tend to:
- Leak into production by accident
- Get scattered and inconsistent
- Become hard to disable globally

LivDebug enforces one hard rule:

> **No initialization = no logs**

This keeps logging explicit, predictable, and easy to control.

---

## Features

- ✅ Explicit initialization required  
- ✅ Optional logging in production  
- ✅ Kotlin extension functions on `Any`  
- ✅ Automatic class-name log tags  
- ✅ Zero runtime impact when disabled  

---

## Installation

LivDebug is a simple Kotlin object.

Copy `LivDebug.kt` into your project under:

