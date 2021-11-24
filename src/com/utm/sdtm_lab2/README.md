# sdtm - Software Design Techniques and Mechanisms

Author: FAF-193 Miron Cristian-Catalin

Laboratory work #2: Structural design patterns

### Theory
In software engineering, structural design patterns are design patterns that ease the design
by identifying a simple way to realize relationships among entities.

### Implementation
#### Adapter:
I implemented a VaccinatedAnimal, and a VaccinatedAnimalAdapter class, which "adapts" the Animal
class to a new standard that requires Animals to be vaccinated.

``` 
public class VaccinatedAnimalAdapter extends Animal {
    private VaccinatedAnimal vaccinatedAnimal;

    public VaccinatedAnimalAdapter(VaccinatedAnimal vaccinatedAnimal) {
        this.vaccinatedAnimal = vaccinatedAnimal;
    }

    public boolean isVaccinated() {
        return vaccinatedAnimal.isVaccinated();
    }
}
```
#### Composite:
Our Zoo has a lot of slots for the animals, and sometimes the animals are related to each other,
and by storing them as families - groups of animals, it can help us get more information about 
origin, blood types, detect if certain health issues are hereditary or not and so on.

```
public class ZooKeeper {
    public class AnimalFamily extends Animal {

    protected List<Animal> familyMembers = new ArrayList<>();

    public void add(Animal component) {
        familyMembers.add(component);
    }

    public void add(Animal... components) {
        familyMembers.addAll(Arrays.asList(components));
    }

    public List<Animal> getFamilyMembers() {
        return familyMembers;
    }

    public void remove(Animal child) {
        familyMembers.remove(child);
    }

    public void remove(Animal... components) {
        familyMembers.removeAll(Arrays.asList(components));
    }

    public void clear() {
        familyMembers.clear();
    }
}
```

#### Facade:
In our case - this design pattern allows us to encapsulate some pipeline style code into a
simple method call named bringInAnimal:

```
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
```

#### Conclusion:
<p>
    In this laboratory work, I learnt structural design patterns, which can be used to make
    the code expansible and maintainable. As soon as the base of the application is created,
    for the sake of keeping the SOLID principles, we should not change the code, but instead,
    use these patterns in order to expand the code base, add new functionalities, adapt it 
    to other libraries and information vendors etc.
</p>

<p>
   I took the previous laboratory work, and added some new expandability features, such as
   adaptation, composition and hard code encapsulation.
</p>

