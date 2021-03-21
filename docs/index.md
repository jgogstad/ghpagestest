---
layout: home
title:  "Home"
section: "home"
technologies:
- first:  ["Scala", "sbt-microsites plugin is completely written in Scala"]
- second: ["SBT", "sbt-microsites plugin uses SBT and other sbt plugins to generate microsites easily"]
- third:  ["Jekyll", "Jekyll allows for the transformation of plain text into static websites and blogs."]
---

### Quick Start

The current development version is **{{site.tucoVersion}}** for **Scala {{site.scalaVersions}}** with

- [**cats**](http://typelevel.org/cats/) {{site.catsVersion}}
- [**cats-effect**](http://typelevel.org/cats/) {{site.catsEffectVersion}}
- [**decline**](https://github.com/bkirwi/decline) {{site.declineVersion}}
- [**monocle**](http://julien-truffaut.github.io/Monocle/) {{site.monocleVersion}}

Add the dependency to your `build.sbt` thus:

```scala
libraryDependencies += "org.tpolecat" %% "tuco-core"  % "{{site.tucoVersion}}" // either this
libraryDependencies += "org.tpolecat" %% "tuco-shell" % "{{site.tucoVersion}}" // or this, which includes the shell API
```
