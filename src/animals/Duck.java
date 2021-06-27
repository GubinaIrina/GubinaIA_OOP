package animals;

import cage.CageSize;
import food.*;


public class Duck extends Herbivore implements Swim, Fly, Voice {
    final String voice = "Кря";
    CageSize size;

    public Duck() {
        setName("Дональд");
        setAnimal("утка");
        setSize(CageSize.MEDIUM);
    }

    @Override
    public void eat(Food food) throws WrongFoodException {
        if (food instanceof Plants) {
            setLevelOfFullness(getLevelOfFullness() + food.getSatiety());
            System.out.println("Сотрудник кормит утку \n Утка кушает \n Уровень сытости: " + getLevelOfFullness());
        } else if (food instanceof Vegetables) {
            throw new WrongFoodException("Сотрудник пытается накормить утку овощами \n Утка не ест овощи!");
        } else if (food instanceof FishFood) {
            throw new WrongFoodException("Сотрудник пытается накормить утку рыбим кормом \n Утка не ест рыбий корм!");
        } else {
            throw new WrongFoodException("Сотрудник пытается накормить утку мясом \n Утка не ест мясо!");
        }
    }

    @Override
    public void setLevelOfFullness(int levelOfFullness) {
        super.setLevelOfFullness(5);
    }

    @Override
    public void fly() {
        System.out.println("Утка летает");
    }

    @Override
    public void swim() {
        System.out.println("Утка плавает в пруду");
    }

    @Override
    public void voice() {
        System.out.println("Утка издает звук: " + voice);
    }

    @Override
    public void setSize(CageSize size) {
        this.size = size;
    }

    @Override
    public CageSize getSize() {
        return size;
    }
}
