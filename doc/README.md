# Lists of Maven Coordinates

This directory hosts lists of Maven `Group:Artifact` coordinates.
They are taken as an input of the [scan](.bach/build/build/Scanner.java) process to generate overviews showing modularization of each `Group:Artifact` pair.

## WatchList

[WatchList.txt](WatchList.txt) contains a community-curated list of Maven `Group:Artifact` lines.

Overview: [WatchList.txt.md](WatchList.txt.md)

## Top1000-2019

[Top1000-2019.txt](Top1000-2019.txt) contains 1,000 Maven `Group:Artifact` lines sorted by download popularity as of December 2019.
This list also includes non-JAR entries (`pom`, `bom`, ...) that need to be removed in the future.

Overview: [Top1000-2019.txt.md](Top1000-2019.txt.md)
