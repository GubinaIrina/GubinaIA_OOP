package animals;

import food.FishFood;
import food.Food;
import food.Plants;
import food.Vegetables;

public class Fish extends Herbivore implements Swim {

    @Override
    public void eat(Food food) {
        if (food instanceof FishFood) {
            setLevelOfFullness(getLevelOfFullness() + food.getSatiety());
            System.out.println("Сотрудник кормит рыбок \n Рыбки кушают \n Уровень сытости: " + getLevelOfFullness());
        } else if (food instanceof Vegetables){
            System.out.println("Сотрудник пытается накормить рыбок овощами \n Рыбки не едят овощи!");
        } else if (food instanceof Plants){
            System.out.println("Сотрудник пытается накормить рыбок растениями \n Рыбки не едят растения!");
        } else {
            System.out.println("Сотрудник пытается накормить рыбок мясом \n Эти рыбки не едят мясо!");
        }
    }

    @Override
    public void setLevelOfFullness(int levelOfFullness) {
        super.setLevelOfFullness(2);
    }

    @Override
    public void swim() {
        System.out.println("Рыба плавает в пруду");
    }
}
