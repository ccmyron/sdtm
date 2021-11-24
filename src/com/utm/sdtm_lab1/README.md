# sdtm - Software Design Techniques and Mechanisms

Author: FAF-193 Miron Cristian-Catalin

Laboratory work #1: Creational design patterns

### Theory
In software engineering, creational design patterns are design patterns 
that deal with object creation mechanisms, trying to create objects in a manner
suitable to the situation. The basic form of object creation could result
in design problems or in added complexity to the design. 
Creational design patterns solve this problem by somehow controlling 
this object creation. 

### Implementation
#### Singleton:
I implemented a ZooManager class, and we need only one instance of this class,
thus it can be set as a singleton. In order to do that, I created an instance inside
the class, created a private constructor, and wrote the getInstance() method as shown below:

``` 
public static ZooManager getInstance() {
        if (instance == null) {
            instance = new ZooManager();
        }

        return instance;
    } 
```
#### Builder:
In order to implement the builder method and for it to have sense, I created an Animal class,
and two classes that implement the Animal class. But they don't inherit all of the parameters,
that's why I created an AnimalBuilder interface, and two Builders that implement this interface.
I created a director class, called ZooKeeper, which can "bring" in new animals. Here's a code snippet:

```
public class ZooKeeper {
    private final AnimalBuilder animalBuilder;

    public ZooKeeper(AnimalBuilder animalBuilder) {
        this.animalBuilder = animalBuilder;
    }

    public Animal getAnimal() {
        return animalBuilder.getAnimal();
    }

    public void bringInMonke() {
        animalBuilder.noteName();
        animalBuilder.noteHeight();
        animalBuilder.noteWeight();
        animalBuilder.noteGender();
    }

    public void bringInBirb() {
        animalBuilder.noteName();
        animalBuilder.noteHeight();
        animalBuilder.noteWeight();
        animalBuilder.noteGender();
        animalBuilder.noteWingSpan();
    }
}
```

#### Factory:
And in order to get the last creational pattern, I implemented an AnimalBuilder factory.
Which generates different types of builders, just for the sake of it.

#### Conclusion:
In this laboratory work, I found out about the creational design patterns, which can be used to 
make the code look more readable, and also to get rid of the ugly looking code. By using the singleton pattern,
I created an object with only one instance. By using the builder pattern, I can extend the creation of the objects
that will/will not share all the parameters offered by the base class. And finally, I used the factory method as an
extension to the builder method, so that the necessary builder is being created.
