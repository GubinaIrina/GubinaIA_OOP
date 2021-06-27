package cage;

import animals.*;

import java.util.HashMap;
import java.util.Map;

public class Cage<T extends Animal> {
    private CageSize cageSize;
    private String name;
    private Map<String, T> cageMap = new HashMap<>();

    public Cage(String name, CageSize size) {
        this.name = name;
        this.cageSize = size;
    }

    public String getName() {
        return this.name;
    }

    public void addAnimal(T animal) {
        if (animal.getSize().equals(cageSize) & animal instanceof Herbivore) {
            cageMap.put(animal.getName(), animal);
            System.out.println("В " + getName() + " вольер для травоядных посадили:  " + animal.getAnimal() + " "
                    + animal.getName());
        } else if (animal.getSize().equals(cageSize) & animal instanceof Carnivorous) {
            cageMap.put(animal.getName(), animal);
            System.out.println("В " + getName() + " вольер для хищников посадили:  " + animal.getAnimal() + " "
                    + animal.getName());
        } else {
            System.out.println("Этот вольер не подходит для " + animal.getAnimal());
        }
    }

    public void removeAnimal(T animal) {
        cageMap.remove(animal.getName());
        System.out.println("Из вольера " + getName() + " убрали: " + animal.getAnimal() + " " + animal.getName());
    }

    public void showAnimalsInCage() {
        for (Map.Entry entry : cageMap.entrySet()) {
            System.out.println("Животные в вольере: " + getName());
            System.out.println(entry.getKey());
        }
    }
}
