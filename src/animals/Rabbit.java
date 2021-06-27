package animals;

import cage.CageSize;
import food.*;


public class Rabbit extends Herbivore implements Run {
    CageSize size;

    public Rabbit() {
        setName("Маршал");
        setAnimal("кролик");
        setSize(CageSize.SMALL);
    }

    @Override
    public void eat(Food food) throws WrongFoodException {
        if (food instanceof Vegetables) {
            setLevelOfFullness(getLevelOfFullness() + food.getSatiety());
            System.out.println("Сотрудник кормит кролика овощами \n Кролик кушает \n Уровень сытости: "
                    + getLevelOfFullness());
        } else if (food instanceof Plants) {
            setLevelOfFullness(getLevelOfFullness() + food.getSatiety());
            System.out.println("Сотрудник кормит кролика травой \n Кролик кушает \n Уровень сытости: "
                    + getLevelOfFullness());
        } else if (food instanceof FishFood) {
            throw new WrongFoodException("Сотрудник пытается накормить кролика рыбим кормом " +
                    "\n Кролик не ест рыбий корм!");
        } else {
            throw new WrongFoodException("Сотрудник пытается накормить кролика мясом \n Кролик не ест мясо!");
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

    @Override
    public void setSize(CageSize size) {
        this.size = size;
    }

    @Override
    public CageSize getSize() {
        return size;
    }
}
