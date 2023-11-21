# Game of Life

- In order to produce the artifacts, right click on the Lsjatl.xtext
and press "Generate as Xtext artifact"
- In order to create instances of the *.lsjatl DSL right click on the cps.gameoflife 
and "Launch Runtime Eclipse"
- In the runtime: Create a new Project File -> New -> Project -> General -> Project
- Name it, use deault location 
- Finish, create new directory with cps.gameoflife as a parent
- name directory specs 
- Create new file. File name needs to have extenstion *.lsjatl (e.g. "test1.lsjatl") 
- Project should be converted to xtext project 


## Questions
- Do we need to modify the GameOfLife.java (in order to implement the "die" evolution rule, you should do that,
  but according to the assignment it's not)
- Neighbors: Do we only consider the "normal" neighborhood
- Exclude edge cases for Rules in Grammar or in validation? 
- Why is there the issue with the point / Populated Cells list, if you directly put it as a point?
