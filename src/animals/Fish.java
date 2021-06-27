package animals;

import cage.CageSize;
import food.*;


public class Fish extends Herbivore implements Swim {
    CageSize size;

    public Fish() {
        setName("Дори");
        setAnimal("рыбка");
        setSize(CageSize.MEDIUM);
    }

    @Override
    public void eat(Food food) throws WrongFoodException {
        if (food instanceof FishFood) {
            setLevelOfFullness(getLevelOfFullness() + food.getSatiety());
            System.out.println("Сотрудник кормит рыбок \n Рыбки кушают \n Уровень сытости: " + getLevelOfFullness());
        } else if (food instanceof Vegetables) {
            throw new WrongFoodException("Сотрудник пытается накормить рыбок овощами \n Рыбки не едят овощи!");
        } else if (food instanceof Plants) {
            throw new WrongFoodException("Сотрудник пытается накормить рыбок растениями \n Рыбки не едят растения!");
        } else {
            throw new WrongFoodException("Сотрудник пытается накормить рыбок мясом \n Эти рыбки не едят мясо!");
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

    @Override
    public void setSize(CageSize size) {
        this.size = size;
    }

    @Override
    public CageSize getSize() {
        return size;
    }
}
