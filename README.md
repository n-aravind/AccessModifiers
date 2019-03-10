# AccessModifiers

* Create a new project in IntelliJ
* Create a package from src and named it goods. In the goods package do
  * Declare a class in the goods package and name it Widget and give it four member variables, one of each access modifier (i.e. public, protected, ...)
  * Declare another class in the goods package and name it Gizmo and new up a Widget in Gizmo's constructor. Which members of Widget can Gizmo accesss?
* Create a package from src and named it stuff. In the stuff package do
  * Declare a class in the stuff package and name it Doodad and new up a Widget in Doodad's constructor. Which members of Widget can you accesss?
  * Declare another class in the stuff package and name it Thingamajig that extends a Widget. Do NOT new up a Widget because Thingamajig is a Widget because it extends Widget. Access Widget's fields in Thingamajig's constructor. Which members of Widget can you accesss?
  
  | Modifiers | public | private | protected | empty |
  |-----------|--------|---------|-----------|-------|
  | Class     | Y      | Y       | Y         | Y     |
  | Package   | Y      | N       | Y         | Y     |
  | Subclass  | Y      | N       | Y         | N     |
  | World     | Y      | N       | N         | N     |