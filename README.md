<img width="200" src="https://github.com/DragonFixes/C4ME/raw/ver/1.17/src/main/resources/assets/c2me/icon.png" alt="C2ME icon" align="right">
<div align="left">
<h1>C4ME</h1>

[![Discord](https://img.shields.io/discord/756715786747248641?logo=discord&logoColor=white)](https://dsc.gg/streamline)
[![GitHub release](https://img.shields.io/github/v/release/DragonFixes/C4ME?include_prereleases)](https://github.com/DragonFixes/C4ME/releases)
[![GitHub all releases](https://img.shields.io/github/downloads/DragonFixes/C4ME/total)](https://github.om/DragonFixes/C4ME/releases)
[![GitHub issues](https://img.shields.io/github/issues/DragonFixes/C4ME)](https://github.com/DragonFixes/C4ME/issues)
[![GitHub pull requests](https://img.shields.io/github/issues-pr/DragonFixes/C4ME)](https://github.com/DragonFixes/C4ME/pulls)
[![GitHub license](https://img.shields.io/github/license/DragonFixes/C4ME)](https://github.com/DragonFixes/C4ME/blob/ver/1.17/LICENSE)
<h3>A Forge mod designed to improve the chunk performance of Minecraft. Fork of C2ME.</h3>
</div>

> [!WARNING]
> 
> ### Warning
> 
> ***Notice:*** *C4ME is currently under heavy development. Things might break, so back up your worlds!*

> [!IMPORTANT]
> 
> ### Requirements
> - Forge.
>  - C4ME is a Forge mod, so you need to have Forge installed to use it.
> - Java 17+.
> - Forgified Fabric API.
> - Synatra Connector.

## So what is C4ME?
C^4M-Engine, or C4ME for short, is a Forge mod designed to improve the performance of chunk generation, I/O, and loading. This is done by taking advantage of multiple CPU cores in parallel. For the best performance it is recommended to use C4ME with Radium (fork of Lithium) and [Starlight](https://github.com/Spottedleaf/Starlight).

## What does C4ME stand for?
Corrected Connectored Concurrent Chunk Management Engine - it's about making the game better threaded and more scalable in regard to world gen and chunk I/O performance.

## So what is C4ME not?
**C4ME is currently in alpha stage and pretty experimental.**  
Although it is usable in most cases and tested during build time, it doesn't mean that it is fully stable for a production server.  
So backup your worlds and practice good game modding skills.

## Branch development status
| Branch            | Active? | Prioritized? |
|-------------------|---------|--------------|
| `ver/1.20.1`      | [x]     | [x]          |


## Downloads
You can find semi-stable releases here: https://github.com/DragonFixes/C4ME/releases

## Support
Issue Tracker: [link](https://github.com/DragonFixes/C4ME/issues)  
Discord Server: [link](https://dsc.gg/streamline)

## Building and setting up
JDK 17+ is required to build and use C2ME  
Run the following commands in the root directory:

```shell
git submodule update --init --recursive
./gradlew clean build
```

Output will be in `build/libs/`.

## License
License information can be found [here](/LICENSE).