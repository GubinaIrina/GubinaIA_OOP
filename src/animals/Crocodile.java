package animals;

import food.*;

public class Crocodile extends Carnivorous implements Swim, Run {

    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            setLevelOfFullness(getLevelOfFullness() + food.getSatiety());
            System.out.println("Сотрудник кормит крокодила мясом \n Крокодил кушает \n Уровень сытости: "
                    + getLevelOfFullness());
        } else if (food instanceof Vegetables) {
            System.out.println("Сотрудник пытается накормить крокодила овощами \n Крокодил не ест овощи!");
        } else if (food instanceof Plants) {
            System.out.println("Сотрудник пытается накормить крокодила травой \n Крокодил не ест траву!");
        } else if (food instanceof FishFood) {
            System.out.println("Сотрудник пытается накормить крокодила рыбим кормом \n Крокодил не ест рыбий корм!");
        }
    }

    @Override
    public void setLevelOfFullness(int levelOfFullness) {
        super.setLevelOfFullness(6);
    }

    @Override
    public void run() {
        System.out.println("Крокодил ходит по берегу пруда");
    }

    @Override
    public void swim() {
        System.out.println("Крокодил плавает в пруду");
    }
}
