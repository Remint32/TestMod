### Downloading Modded Mindustry

First, download the Mindustry mod-compatible version [here](https://github.com/Anuken/Mindustry/wiki).


### Setup

Clone this repository first. Assets are in `src/main/resources`. Edit sprites and block names there.
`mod-info.json` is also in that folder. Its contents should be self-explanatory.

Make sure any content you make is prefixed with the mod name, e.g. if your mod is named `blah`, a new block called `Sign` would be called `blah:sign`.
Also note that all textures are prefixed with the mod name. If you have a texture in the resource directory called `sign`, it would be fetched by calling `Core.atlas.find("blah:sign")`.


### Building a Jar

`gradlew build` / `./gradlew build`

Output jar should be in `build/libs`.


### Importing

Open Mindustry, `Mods -> Import Mod -> Select the jar file from the previous step`.


### Bug Reporting

Don't. I won't fix them.


### Android Support

This has been proven to work on Android, but it requires a separate compilation step, as well as a lot of messing around. Until this sytem is proven to work (or the other way around), I won't be putting any effort into an Android build.

