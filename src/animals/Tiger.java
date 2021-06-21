package animals;

import food.*;

public class Tiger extends Carnivorous implements Run, Voice {
    private String voice = "Ррр";

    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            setLevelOfFullness(getLevelOfFullness() + food.getSatiety());
            System.out.println("Сотрудник кормит тигра мясом \n Тигр кушает \n Уровень сытости: "
                    + getLevelOfFullness());
        } else if (food instanceof Vegetables) {
            System.out.println("Сотрудник пытается накормить тигра овощами \n Тигр не ест овощи!");
        } else if (food instanceof Plants) {
            System.out.println("Сотрудник пытается накормить тигра травой \n Тигр не ест траву!");
        } else if (food instanceof FishFood) {
            System.out.println("Сотрудник пытается накормить тигра рыбим кормом \n Тигр не ест рыбий корм!");
        }
    }

    @Override
    public void setLevelOfFullness(int levelOfFullness) {
        super.setLevelOfFullness(4);
    }

    @Override
    public void run() {
        System.out.println("Тигр гуляет по вольеру");
    }

    @Override
    public void voice() {
        getVoice();
        System.out.println("Тигр издает звук: " + voice);
    }

    public String getVoice() {
        return voice;
    }
}
