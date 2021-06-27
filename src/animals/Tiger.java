package animals;

import cage.CageSize;
import food.*;


public class Tiger extends Carnivorous implements Run, Voice {
    final String voice = "Ррр";
    CageSize size;

    public Tiger() {
        setName("Шива");
        setAnimal("тигр");
        setSize(CageSize.BIG);
    }

    @Override
    public void eat(Food food) throws WrongFoodException {
        if (food instanceof Meat) {
            setLevelOfFullness(getLevelOfFullness() + food.getSatiety());
            System.out.println("Сотрудник кормит тигра мясом \n Тигр кушает \n Уровень сытости: "
                    + getLevelOfFullness());
        } else if (food instanceof Vegetables) {
            throw new WrongFoodException("Сотрудник пытается накормить тигра овощами \n Тигр не ест овощи!");
        } else if (food instanceof Plants) {
            throw new WrongFoodException("Сотрудник пытается накормить тигра травой \n Тигр не ест траву!");
        } else if (food instanceof FishFood) {
            throw new WrongFoodException("Сотрудник пытается накормить тигра рыбим кормом \n Тигр не ест рыбий корм!");
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
        System.out.println("Тигр издает звук: " + voice);
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
