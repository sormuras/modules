# sormuras/modules
Counted 8141 Java modules published at Maven Central

## Summary 2020-12-14T03:11:02.181257Z

```
## Summary

Started scan at 2020-12-14T03:11:02.181257Z
Scanned 67,678 files in 8 seconds.
   first -> modulescanner-report-2018_08_18_00_58_06.csv
    last -> modulescanner-report-2020_12_14_02_57_43.csv

Parsed 4,745,050 lines in total.
  71,340 -> captions skipped
  446,546 -> duplicates skipped
  246,497 -> module related

Collected 8,141 unique modules.
  automatic :cd: -> 5,605
  explicit :dvd: -> 2,536

## Samples
            junit -> junit:junit:4.13.1
org.junit.jupiter -> org.junit.jupiter:junit-jupiter:5.7.0
 org.junitpioneer -> org.junit-pioneer:junit-pioneer:1.1.0
org.objectweb.asm -> org.ow2.asm:asm:9.0
        org.lwjgl -> org.lwjgl:lwjgl:3.2.3
   org.joda.beans -> org.joda:joda-beans:2.8.1
        org.slf4j -> org.slf4j:slf4j-api:2.0.0-alpha1
 de.sormuras.bach -> de.sormuras.bach:de.sormuras.bach:11.9


## History
 - `2018_08={automatic=2281, explicit=287, plain=143500}` 	 1.79%
 - `2018_09={automatic=1753, explicit=254, plain=96024}` 	 2.09%
 - `2018_10={automatic=2409, explicit=255, plain=101481}` 	 2.63%
 - `2018_11={automatic=1066, explicit=112, plain=48559}` 	 2.43%
 - `2018_12={automatic=2117, explicit=287, plain=203563}` 	 1.18%
 - `2019_01={automatic=3827, explicit=272, plain=103501}` 	 3.96%
 - `2019_02={automatic=4604, explicit=554, plain=85957}` 	 6.00%
 - `2019_03={automatic=5502, explicit=644, plain=151127}` 	 4.07%
 - `2019_04={automatic=4229, explicit=507, plain=154126}` 	 3.07%
 - `2019_05={automatic=6227, explicit=417, plain=156563}` 	 4.24%
 - `2019_06={automatic=5993, explicit=420, plain=148139}` 	 4.33%
 - `2019_07={automatic=4908, explicit=758, plain=142638}` 	 3.97%
 - `2019_08={automatic=5927, explicit=342, plain=144313}` 	 4.34%
 - `2019_09={automatic=5982, explicit=593, plain=155377}` 	 4.23%
 - `2019_10={automatic=6894, explicit=443, plain=157528}` 	 4.66%
 - `2019_11={automatic=5866, explicit=729, plain=127782}` 	 5.16%
 - `2019_12={automatic=5967, explicit=581, plain=132344}` 	 4.95%
 - `2020_01={automatic=5665, explicit=513, plain=152168}` 	 4.06%
 - `2020_02={automatic=6950, explicit=586, plain=145436}` 	 5.18%
 - `2020_03={automatic=7874, explicit=613, plain=176241}` 	 4.82%
 - `2020_04={automatic=6189, explicit=701, plain=148391}` 	 4.64%
 - `2020_05={automatic=7493, explicit=636, plain=144059}` 	 5.64%
 - `2020_06={automatic=8359, explicit=988, plain=138831}` 	 6.73%
 - `2020_07={automatic=6909, explicit=455, plain=149024}` 	 4.94%
 - `2020_08={automatic=6663, explicit=488, plain=136914}` 	 5.22%
 - `2020_09={automatic=7687, explicit=812, plain=133637}` 	 6.36%
 - `2020_10={automatic=7725, explicit=841, plain=170419}` 	 5.03%
 - `2020_11={automatic=6850, explicit=741, plain=162941}` 	 4.66%
 - `2020_12={automatic=4154, explicit=247, plain=70081}` 	 6.28%
```

[![Build Status](https://travis-ci.org/sormuras/modules.svg?branch=master)](https://travis-ci.org/sormuras/modules)

## About Java module names

[@jodastephen](https://github.com/jodastephen) writes about Java module naming:

> Java SE 9 brought a new feature, the Java Platform Module System (JPMS).
> Due to certain constraints in the design, it is important for there to be an agreed naming strategy across open source projects.
> My proposed strategy is detailed here [http://blog.joda.org/2017/04/java-se-9-jpms-module-naming.html](http://blog.joda.org/2017/04/java-se-9-jpms-module-naming.html).
>
> In summary, the strategy is:
>
> * Module names must be valid Java identifiers! E.g. no Java keywords, no dashes, no...
> * Module names must be reverse-DNS, just like package names, e.g. `org.joda.time`.
> * Modules are a group of packages. As such, the module name must be related to the package names.
> * Module names are strongly recommended to be the same as the name of the super-package.
> * Creating a module with a particular name takes ownership of that package name and everything beneath it.
> * As the owner of that namespace, any sub-packages may be grouped into sub-modules as desired so long as no package is in two modules.

This project applies that strategy to compile a _database_ of unique module names derived from artifacts published on Maven Central.

- :cd: is ["an automatic module"](http://branchandbound.net/blog/java/2017/12/automatic-module-name), i.e. it declares a stable module name via an `AUTOMATIC-MODULE-NAME` entry in its `META-INF/MANIFEST.MF` file.
- :dvd: denotes an explicit containing a compiled `module-info.class` module descriptor.


### Unique modules on Maven Central

* [module-maven.properties](module-maven.properties) - Module name to Maven `${group}:${artifact}` ID database
* :cd: [module-maven-automatic.properties](module-maven-automatic.properties) - Module name (derived from Manifest entry) to Maven `${group}:${artifact}` ID database
* :dvd: [module-maven-explicit.properties](module-maven-explicit.properties) - Module name (compile descriptor) to Maven `${group}:${artifact}` ID database
* [module-version.properties](module-version.properties) - Module name to current version database
* [modules.properties](modules.properties) - Module name to CSV source line database
 
The _database_ consists of `.properties` files that are generated by parsing publications made to Maven Central.
@sandermak's [modulescanner](https://github.com/sandermak/modulescanner) scans those publications and store module-related events in CSV files.

## `Modules.java`

This project contains the single-file source-code Java program ([JEP330](https://openjdk.java.net/jeps/330)): [`Modules.java`](src/Modules.java)

With `{path}` pointing to a directory containing all CSV files to parse, you may create the `.properties` files locally.

```text
java src/Modules.java {path}
```

### Reverse-DNS, with the exception of...

Initially, [maven-group-alias.properties](maven-group-alias.properties) is read to cherry-pick some non reverse-DNS aliases for well-known projects.

A Maven group ID with all dashes `-` removed is also considered a match.
For example, `org.f-oo-ba-r.b-az` is transformed to `org.foobar.baz` before checking the start of a module name.  

### Suspicious modules found on Maven Central

Modules listed in the **Suspicious Modules** section ([suspicious/](suspicious)) are suspicious and need manual correction.
If you find your module listed there, or know an author of one, please [create an issue](https://github.com/sormuras/modules/issues/new) for investigation.

## Suspicious Modules

Module names listed in this section didn't make it into the `modules.properties` database.

- Invalid module names: [26456](suspicious/syntax.md)
- Naming is [_off_](http://blog.joda.org/2017/04/java-se-9-jpms-module-naming.html): [34346](suspicious/naming.md)
- Modular impostors: [12299](suspicious/impostors.md)

## Explicit Unique Modules Highlights

Module names listed in this section are unique and well-formed.
Include them in your `module-info.java` module descriptors.

- :dvd: `com.almasb.fxgl.achievement` - `com.github.almasb:fxgl-achievement:11.12`
- :dvd: `com.almasb.fxgl.ai` - `com.github.almasb:fxgl-ai:11.12`
- :dvd: `com.almasb.fxgl.all` - `com.github.almasb:fxgl:11.12`
- :dvd: `com.almasb.fxgl.animation` - `com.github.almasb:fxgl-animation:11.12`
- :dvd: `com.almasb.fxgl.controllerinput` - `com.github.almasb:fxgl-controllerinput:11.12`
- :dvd: `com.almasb.fxgl.core` - `com.github.almasb:fxgl-core:11.12`
- :dvd: `com.almasb.fxgl.cutscene` - `com.github.almasb:fxgl-cutscene:11.12`
- :dvd: `com.almasb.fxgl.effects` - `com.github.almasb:fxgl-effects:11.12`
- :dvd: `com.almasb.fxgl.entity` - `com.github.almasb:fxgl-entity:11.12`
- :dvd: `com.almasb.fxgl.events` - `com.github.almasb:fxgl-events:11.12`
- :dvd: `com.almasb.fxgl.input` - `com.github.almasb:fxgl-input:11.12`
- :dvd: `com.almasb.fxgl.io` - `com.github.almasb:fxgl-io:11.12`
- :dvd: `com.almasb.fxgl.localization` - `com.github.almasb:fxgl-localization:11.12`
- :dvd: `com.almasb.fxgl.logging` - `com.github.almasb:fxgl-logging:11.12`
- :dvd: `com.almasb.fxgl.media` - `com.github.almasb:fxgl-media:11.12`
- :dvd: `com.almasb.fxgl.minigames` - `com.github.almasb:fxgl-minigames:11.12`
- :dvd: `com.almasb.fxgl.net` - `com.github.almasb:fxgl-net:11.12`
- :dvd: `com.almasb.fxgl.notification` - `com.github.almasb:fxgl-notification:11.12`
- :dvd: `com.almasb.fxgl.profiles` - `com.github.almasb:fxgl-profiles:11.12`
- :dvd: `com.almasb.fxgl.scene` - `com.github.almasb:fxgl-scene:11.12`
- :dvd: `com.almasb.fxgl.test` - `com.github.almasb:fxgl-test:11.12`
- :dvd: `com.almasb.fxgl.time` - `com.github.almasb:fxgl-time:11.12`
- :dvd: `com.almasb.fxgl.trade` - `com.github.almasb:fxgl-trade:11.12`
- :dvd: `com.almasb.fxgl.ui` - `com.github.almasb:fxgl-ui:11.12`
- :dvd: `com.almasb.fxgl.zdeploy` - `com.github.almasb:fxgl-zdeploy:11.12`
- :dvd: `com.almasb.fxlocal` - `com.github.almasb:fx-localization:1`
- :dvd: `com.gluonhq.connect` - `com.gluonhq:connect:2.0.1`
- :dvd: `com.gluonhq.maps` - `com.gluonhq:maps:2.0.0-ea+4`
- :dvd: `com.gluonhq.strange` - `com.gluonhq:strange:0.0.12`
- :dvd: `com.gluonhq.strangefx` - `com.gluonhq:strangefx:0.0.8`
- :dvd: `com.gluonhq.substrate` - `com.gluonhq:substrate:0.0.33`
- :dvd: `com.sun.xml.bind` - `com.sun.xml.bind:jaxb-impl:3.0.0`
- :dvd: `com.sun.xml.bind.core` - `com.sun.xml.bind:jaxb-core:3.0.0`
- :dvd: `com.sun.xml.bind.osgi` - `com.sun.xml.bind:jaxb-osgi:3.0.0`
- :dvd: `com.sun.xml.ws` - `com.sun.xml.ws:rt:2.3.2`
- :dvd: `com.sun.xml.ws.eclipselink` - `com.sun.xml.ws:jaxws-eclipselink-plugin:3.0.0`
- :dvd: `com.sun.xml.ws.fi` - `com.sun.xml.ws:rt-fi:3.0.0`
- :dvd: `com.sun.xml.ws.httpspi.servlet` - `com.sun.xml.ws:httpspi-servlet:3.0.0`
- :dvd: `com.sun.xml.ws.jaxws` - `com.sun.xml.ws:jaxws-rt:2.3.2`
- :dvd: `com.sun.xml.ws.policy` - `com.sun.xml.ws:policy:3.0.0`
- :dvd: `com.sun.xml.ws.rt` - `com.sun.xml.ws:rt:3.0.0`
- :dvd: `com.sun.xml.ws.sdo` - `com.sun.xml.ws:sdo-eclipselink-plugin:3.0.0`
- :dvd: `com.sun.xml.ws.servlet` - `com.sun.xml.ws:servlet:3.0.0`
- :dvd: `com.sun.xml.ws.transport.async` - `com.sun.xml.ws:jaxws-async-client-transport:3.0.0`
- :dvd: `com.sun.xml.ws.transport.local` - `com.sun.xml.ws:jaxws-local-transport:3.0.0`
- :dvd: `de.sormuras.bach` :left_right_arrow: `de.sormuras.bach:de.sormuras.bach:11.9`
- :dvd: `eu.hansolo.evt` - `eu.hansolo:evt:1.6`
- :dvd: `eu.hansolo.jdp` - `eu.hansolo:jdp:1.5`
- :dvd: `eu.hansolo.medusa` - `eu.hansolo:Medusa:11.5`
- :dvd: `eu.hansolo.properties` - `eu.hansolo:properties:11.9`
- :dvd: `eu.hansolo.regulators` - `eu.hansolo:regulators:11.7`
- :dvd: `eu.hansolo.tilesfx` - `eu.hansolo:tilesfx:11.45`
- :dvd: `eu.hansolo.tilesfxweather` - `eu.hansolo:tilesfxweather:11.35`
- :dvd: `info.picocli` - `info.picocli:picocli:4.5.2`
- :dvd: `io.github.classgraph` - `io.github.classgraph:classgraph:4.8.94`
- :dvd: `net.bytebuddy` - `net.bytebuddy:byte-buddy:1.10.18`
- :dvd: `net.bytebuddy.agent` - `net.bytebuddy:byte-buddy-agent:1.10.18`
- :dvd: `org.assertj.core` - `org.assertj:assertj-core:3.18.1`
- :dvd: `org.joda.beans` - `org.joda:joda-beans:2.8.1`
- :dvd: `org.joda.collect` - `org.joda:joda-collect:1.0.1`
- :dvd: `org.joda.convert` - `org.joda:joda-convert:2.2.1`
- :dvd: `org.joda.money` - `org.joda:joda-money:1.0.1`
- :dvd: `org.jooq.jool` - `org.jooq:jool:0.9.14`
- :dvd: `org.jooq.joor` - `org.jooq:joor:0.9.13`
- :dvd: `org.jooq.joou` - `org.jooq:joou:0.9.4`
- :dvd: `org.jooq.joox` - `org.jooq:joox:1.6.2`
- :dvd: `org.junit.jupiter` - `org.junit.jupiter:junit-jupiter:5.7.0`
- :dvd: `org.junit.jupiter.api` - `org.junit.jupiter:junit-jupiter-api:5.7.0`
- :dvd: `org.junit.jupiter.engine` - `org.junit.jupiter:junit-jupiter-engine:5.7.0`
- :dvd: `org.junit.jupiter.migrationsupport` - `org.junit.jupiter:junit-jupiter-migrationsupport:5.7.0`
- :dvd: `org.junit.jupiter.params` - `org.junit.jupiter:junit-jupiter-params:5.7.0`
- :dvd: `org.junit.platform.commons` - `org.junit.platform:junit-platform-commons:1.7.0`
- :dvd: `org.junit.platform.console` - `org.junit.platform:junit-platform-console:1.7.0`
- :dvd: `org.junit.platform.engine` - `org.junit.platform:junit-platform-engine:1.7.0`
- :dvd: `org.junit.platform.jfr` - `org.junit.platform:junit-platform-jfr:1.7.0`
- :dvd: `org.junit.platform.launcher` - `org.junit.platform:junit-platform-launcher:1.7.0`
- :dvd: `org.junit.platform.reporting` - `org.junit.platform:junit-platform-reporting:1.7.0`
- :dvd: `org.junit.platform.runner` - `org.junit.platform:junit-platform-runner:1.7.0`
- :dvd: `org.junit.platform.suite.api` - `org.junit.platform:junit-platform-suite-api:1.7.0`
- :dvd: `org.junit.platform.testkit` - `org.junit.platform:junit-platform-testkit:1.7.0`
- :dvd: `org.junitpioneer` - `org.junit-pioneer:junit-pioneer:1.1.0`
- :dvd: `org.lwjgl` - `org.lwjgl:lwjgl:3.2.3`
- :dvd: `org.lwjgl.assimp` - `org.lwjgl:lwjgl-assimp:3.2.3`
- :dvd: `org.lwjgl.bgfx` - `org.lwjgl:lwjgl-bgfx:3.2.3`
- :dvd: `org.lwjgl.cuda` - `org.lwjgl:lwjgl-cuda:3.2.3`
- :dvd: `org.lwjgl.egl` - `org.lwjgl:lwjgl-egl:3.2.3`
- :dvd: `org.lwjgl.glfw` - `org.lwjgl:lwjgl-glfw:3.2.3`
- :dvd: `org.lwjgl.jawt` - `org.lwjgl:lwjgl-jawt:3.2.3`
- :dvd: `org.lwjgl.jemalloc` - `org.lwjgl:lwjgl-jemalloc:3.2.3`
- :dvd: `org.lwjgl.libdivide` - `org.lwjgl:lwjgl-libdivide:3.2.3`
- :dvd: `org.lwjgl.llvm` - `org.lwjgl:lwjgl-llvm:3.2.3`
- :dvd: `org.lwjgl.lmdb` - `org.lwjgl:lwjgl-lmdb:3.2.3`
- :dvd: `org.lwjgl.lz4` - `org.lwjgl:lwjgl-lz4:3.2.3`
- :dvd: `org.lwjgl.meow` - `org.lwjgl:lwjgl-meow:3.2.3`
- :dvd: `org.lwjgl.nanovg` - `org.lwjgl:lwjgl-nanovg:3.2.3`
- :dvd: `org.lwjgl.nfd` - `org.lwjgl:lwjgl-nfd:3.2.3`
- :dvd: `org.lwjgl.nuklear` - `org.lwjgl:lwjgl-nuklear:3.2.3`
- :dvd: `org.lwjgl.odbc` - `org.lwjgl:lwjgl-odbc:3.2.3`
- :dvd: `org.lwjgl.openal` - `org.lwjgl:lwjgl-openal:3.2.3`
- :dvd: `org.lwjgl.opencl` - `org.lwjgl:lwjgl-opencl:3.2.3`
- :dvd: `org.lwjgl.opengl` - `org.lwjgl:lwjgl-opengl:3.2.3`
- :dvd: `org.lwjgl.opengles` - `org.lwjgl:lwjgl-opengles:3.2.3`
- :dvd: `org.lwjgl.openvr` - `org.lwjgl:lwjgl-openvr:3.2.3`
- :dvd: `org.lwjgl.opus` - `org.lwjgl:lwjgl-opus:3.2.3`
- :dvd: `org.lwjgl.ovr` - `org.lwjgl:lwjgl-ovr:3.2.3`
- :dvd: `org.lwjgl.par` - `org.lwjgl:lwjgl-par:3.2.3`
- :dvd: `org.lwjgl.remotery` - `org.lwjgl:lwjgl-remotery:3.2.3`
- :dvd: `org.lwjgl.rpmalloc` - `org.lwjgl:lwjgl-rpmalloc:3.2.3`
- :dvd: `org.lwjgl.shaderc` - `org.lwjgl:lwjgl-shaderc:3.2.3`
- :dvd: `org.lwjgl.sse` - `org.lwjgl:lwjgl-sse:3.2.3`
- :dvd: `org.lwjgl.stb` - `org.lwjgl:lwjgl-stb:3.2.3`
- :dvd: `org.lwjgl.tinyexr` - `org.lwjgl:lwjgl-tinyexr:3.2.3`
- :dvd: `org.lwjgl.tinyfd` - `org.lwjgl:lwjgl-tinyfd:3.2.3`
- :dvd: `org.lwjgl.tootle` - `org.lwjgl:lwjgl-tootle:3.2.3`
- :dvd: `org.lwjgl.vma` - `org.lwjgl:lwjgl-vma:3.2.3`
- :dvd: `org.lwjgl.vulkan` - `org.lwjgl:lwjgl-vulkan:3.2.3`
- :dvd: `org.lwjgl.xxhash` - `org.lwjgl:lwjgl-xxhash:3.2.3`
- :dvd: `org.lwjgl.yoga` - `org.lwjgl:lwjgl-yoga:3.2.3`
- :dvd: `org.lwjgl.zstd` - `org.lwjgl:lwjgl-zstd:3.2.3`
- :dvd: `org.objectweb.asm` - `org.ow2.asm:asm:9.0`
- :dvd: `org.objectweb.asm.all` - `org.ow2.asm:asm-all:6.0_BETA`
- :dvd: `org.objectweb.asm.all.debug` - `org.ow2.asm:asm-debug-all:6.0_BETA`
- :dvd: `org.objectweb.asm.commons` - `org.ow2.asm:asm-commons:9.0`
- :dvd: `org.objectweb.asm.tree` - `org.ow2.asm:asm-tree:9.0`
- :dvd: `org.objectweb.asm.tree.analysis` - `org.ow2.asm:asm-analysis:9.0`
- :dvd: `org.objectweb.asm.util` - `org.ow2.asm:asm-util:9.0`
- :dvd: `org.objectweb.asm.xml` - `org.ow2.asm:asm-xml:6.2.1`
- :dvd: `org.slf4j` - `org.slf4j:slf4j-api:2.0.0-alpha1`
- :dvd: `org.slf4j.jul` - `org.slf4j:slf4j-jdk14:2.0.0-alpha1`
- :dvd: `org.slf4j.nop` - `org.slf4j:slf4j-nop:2.0.0-alpha1`
- :dvd: `org.slf4j.simple` - `org.slf4j:slf4j-simple:2.0.0-alpha1`
