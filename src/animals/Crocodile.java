package animals;

import cage.CageSize;
import food.*;

import java.util.Objects;

public class Crocodile extends Carnivorous implements Swim, Run {
    CageSize size;

    public Crocodile() {
        setName("Тор");
        setAnimal("крокодил");
        setSize(CageSize.MEDIUM);
    }

    @Override
    public void eat(Food food) throws WrongFoodException {
        if (food instanceof Meat) {
            setLevelOfFullness(getLevelOfFullness() + food.getSatiety());
            System.out.println("Сотрудник кормит крокодила мясом \n Крокодил кушает \n Уровень сытости: "
                    + getLevelOfFullness());
        } else if (food instanceof Vegetables) {
            throw new WrongFoodException("Сотрудник пытается накормить крокодила овощами \n Крокодил не ест овощи!");
        } else if (food instanceof Plants) {
            throw new WrongFoodException("Сотрудник пытается накормить крокодила травой \n Крокодил не ест траву!");
        } else if (food instanceof FishFood) {
            throw new WrongFoodException("Сотрудник пытается накормить крокодила рыбим кормом " +
                    "\n Крокодил не ест рыбий корм!");
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

    @Override
    public void setSize(CageSize size) {
        this.size = size;
    }

    @Override
    public CageSize getSize() {
        return size;
    }
}
