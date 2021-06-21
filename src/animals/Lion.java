package animals;

import food.*;

public class Lion extends Carnivorous implements Run, Voice {
    final String voice = "Ррр";

    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            setLevelOfFullness(getLevelOfFullness() + food.getSatiety());
            System.out.println("Сотрудник кормит льва мясом \n Лев кушает \n Уровень сытости: "
                    + getLevelOfFullness());
        } else if (food instanceof Vegetables) {
            System.out.println("Сотрудник пытается накормить льва овощами \n Лев не ест овощи!");
        } else if (food instanceof Plants) {
            System.out.println("Сотрудник пытается накормить льва травой \n Лев не ест траву!");
        } else if (food instanceof FishFood) {
            System.out.println("Сотрудник пытается накормить льва рыбим кормом \n Лев не ест рыбий корм!");
        }
    }

    @Override
    public void setLevelOfFullness(int levelOfFullness) {
        super.setLevelOfFullness(3);
    }

    @Override
    public void run() {
        System.out.println("Лев гуляет по вольеру");
    }

    @Override
    public void voice() {
        System.out.println("Лев издает звук: " + voice);
    }
}
