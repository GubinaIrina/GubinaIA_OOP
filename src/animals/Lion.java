package animals;

import cage.CageSize;
import food.*;


public class Lion extends Carnivorous implements Run, Voice {
    final String voice = "Ррр";
    CageSize size;

    public Lion() {
        setName("Кана");
        setAnimal("лев");
        setSize(CageSize.BIG);
    }

    @Override
    public void eat(Food food) throws WrongFoodException {
        if (food instanceof Meat) {
            setLevelOfFullness(getLevelOfFullness() + food.getSatiety());
            System.out.println("Сотрудник кормит льва мясом \n Лев кушает \n Уровень сытости: "
                    + getLevelOfFullness());
        } else if (food instanceof Vegetables) {
            throw new WrongFoodException("Сотрудник пытается накормить льва овощами \n Лев не ест овощи!");
        } else if (food instanceof Plants) {
            throw new WrongFoodException("Сотрудник пытается накормить льва травой \n Лев не ест траву!");
        } else if (food instanceof FishFood) {
            throw new WrongFoodException("Сотрудник пытается накормить льва рыбим кормом \n Лев не ест рыбий корм!");
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

    @Override
    public void setSize(CageSize size) {
        this.size = size;
    }

    @Override
    public CageSize getSize() {
        return size;
    }
}
