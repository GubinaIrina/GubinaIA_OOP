package animals;

public class Fish extends Herbivore implements Swim {

    @Override
    public void setLevelOfFullness(int levelOfFullness) {
        super.setLevelOfFullness(2);
    }

    @Override
    public void swim() {
        System.out.println("Рыба плавает в пруду");
    }
}
