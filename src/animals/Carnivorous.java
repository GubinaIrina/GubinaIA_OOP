package animals;

import food.Food;
import food.Meat;

public class Carnivorous extends Animal {
    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            setLevelOfFullness(getLevelOfFullness() + food.getSatiety());
            System.out.println("Сотрудник кормит животное мясом \n Животное кушает мясо \n Уровень сытости: "
                    + getLevelOfFullness());
        } else {
            System.out.println("Сотрудник кормит животное травой \n Это животное не ест траву!");
        }
    }
}
