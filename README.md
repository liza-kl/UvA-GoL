# Game of Life DSL 

## Setup 
- Clone the repository with the runtime submodule
```
git clone --recurse-submodules https://github.com/liza-kl/UvA-GoL
```
- Open project in Eclipse

## Generation of needed Artifacts 
- Right-Click on [Lsjatl.xtext](https://github.com/liza-kl/UvA-GoL/blob/main/GoLLanguage/cps.gameoflife/src/cps/gameoflife/Lsjatl.xtext) and Run As -> Generate Artifacts
- Right-Click on [GenerateLsjatl.mwe2](https://github.com/liza-kl/UvA-GoL/blob/main/GoLLanguage/cps.gameoflife/src/cps/gameoflife/GenerateLsjatl.mwe2) and Run As -> Run Workflow
- Now click on the root of the project and Right Click -> Run as "Java Application". This should open a new window with the runtime.

## Runtime
- Import the UvA-GoL-runetime as an eclipse project or if the submodule import did not work, import it as a [git project](https://github.com/Atroa-sh/UvA-GoL-runetime)
- It should generate a RulesOfLife.java file for the only valid specification in the thing.
- Copy the RulesOfLife.java into the [GoLruntime/short.life/src/GameOfLife](https://github.com/liza-kl/UvA-GoL/tree/main/GoLruntime/short.life/src/GameOfLife) directory
- Right Click on the root of the project. Run as Java Application. A GUI should appear with the Game of Life.

  
> [!IMPORTANT]  
> [GameOfLife.java](https://github.com/liza-kl/UvA-GoL/blob/main/GoLruntime/short.life/src/GameOfLife/GameOfLife.java) was modified during the assignment. The original one will not work.
>


## "Features" of our language
- [Couple of validators](https://github.com/liza-kl/UvA-GoL/blob/main/GoLLanguage/cps.gameoflife/src/cps/gameoflife/validation/LsjatlValidator.xtend)
- You can add custom markes, but also make use of predefined patterns
- [Generator](https://github.com/liza-kl/UvA-GoL/tree/main/GoLLanguage/cps.gameoflife/src/cps/gameoflife/generator) is split up in custom helper classes 
## What's missing in the solution 
- No overlap mentioned if a custom populated cell matches a Glider
- Duplicated Conditions are not giving a warning
- Duplicated Rules don't give a warning
- Patterns can only be set on a particular spot
- ... 
