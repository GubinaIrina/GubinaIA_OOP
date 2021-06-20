package animals;

import food.Food;
import food.Grass;

public class Herbivore extends Animal {
    @Override
    public void eat(Food food) {
        if (food instanceof Grass) {
            setLevelOfFullness(getLevelOfFullness() + food.getSatiety());
            System.out.println("Сотрудник кормит животное травой \n Животное кушает траву \n Уровень сытости: "
                    + getLevelOfFullness());
        } else {
            System.out.println("Сотрудник кормит животное мясом \n Это животное не ест мясо!");
        }
    }
}
