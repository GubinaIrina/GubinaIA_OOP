package animals;

import food.FishFood;
import food.Food;
import food.Plants;
import food.Vegetables;

public class Rabbit extends Herbivore implements Run {

    @Override
    public void eat(Food food) {
        if (food instanceof Vegetables) {
            setLevelOfFullness(getLevelOfFullness() + food.getSatiety());
            System.out.println("Сотрудник кормит кролика овощами \n Кролик кушает \n Уровень сытости: "
                    + getLevelOfFullness());
        } else if (food instanceof Plants) {
            setLevelOfFullness(getLevelOfFullness() + food.getSatiety());
            System.out.println("Сотрудник кормит кролика травой \n Кролик кушает \n Уровень сытости: "
                    + getLevelOfFullness());
        } else if (food instanceof FishFood) {
            System.out.println("Сотрудник пытается накормить кролика рыбим кормом \n Кролик не ест рыбий корм!");
        } else {
            System.out.println("Сотрудник пытается накормить кролика мясом \n Кролик не ест мясо!");
        }
    }

    @Override
    public void setLevelOfFullness(int levelOfFullness) {
        super.setLevelOfFullness(7);
    }

    @Override
    public void run() {
        System.out.println("Кролик бегает по лужайке");
    }
}
