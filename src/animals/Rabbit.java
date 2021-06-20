package animals;

public class Rabbit extends Herbivore implements Run {

    @Override
    public void setLevelOfFullness(int levelOfFullness) {
        super.setLevelOfFullness(7);
    }

    @Override
    public void run() {
        System.out.println("Кролик бегает по лужайке");
    }
}
