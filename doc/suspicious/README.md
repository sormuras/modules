# Suspicious Artifacts

Maven artifacts and Java modules listed in this directory didn't make it into the `modules.properties` database.

## Illegal Automatic-Module-Name Manifest Entries

▶ [illegal-automatic-module-names.txt](illegal-automatic-module-names.txt)

A Maven artifact is considered to be suspicious if its JAR file contains an illegal `Automatic-Module-Name` manifest entry.

Illegal? An empty name, a name that contains `-` characters, a name starting numbers, a name that contains Java keywords, etc., is illegal.
Consult chapter [Module Declarations](https://docs.oracle.com/javase/specs/jls/se9/html/jls-7.html#jls-7.7) of the Java Language Specification for details.
TLDR; the name must be usable in `requires NAME;` directives of other modules.

Examples of illegal names include:

- `org.apache.jena.jena-fuseki-core`: ❌ no `-` allowed
- `org.talend.sdk.component.runtime..standalone` ❌ no `..` allowed
- `org.neo4j.tooling.import` ❌ `import` is a Java keyword
- `org.drools.wb.enum.editor.api`: ❌ `enum` is a Java keyword
- `org.kie.wb.common.default.editor.api` ❌ `default` is a Java keyword

## Impostor Modules

▶ [impostor-modules.md](impostor-modules.md)

An impostor module is a Maven artifact that contains the `module-info.class` file from a different Maven artifact.
Some well known modules that were packaged as Maven artifacts by their authors, have been repackaged into dozens of other Maven artifacts by the maintainers of those other artifacts.
This makes it look like there are dozens of modules with the same name in Maven Central -- all but one are impostor modules.

For example, over 100 artifacts on Maven Central claim to be the module `org.apache.logging.log4j`, but only one of those artifacts (`org.apache.logging.log4j:log4j`) is the "real" module.
If your POM depends on the one true artifact and _any_ of the over 100 other artifacts, then you will experience problems when your module tries to say `requires org.apache.logging.log4j;`.
