package animals;

import cage.CageSize;
import exception.WrongFoodException;
import food.Food;

import java.util.Objects;


public abstract class Animal {
    private int levelOfFullness;
    private String name;
    private String animal;


    private CageSize size;

    public abstract void eat(Food food) throws WrongFoodException, food.WrongFoodException;

    public int getLevelOfFullness() {
        return levelOfFullness;
    }

    public void setLevelOfFullness(int levelOfFullness) {
        this.levelOfFullness = levelOfFullness;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(CageSize size) {
        this.size = size;
    }

    public CageSize getSize(){
        return size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }
}
