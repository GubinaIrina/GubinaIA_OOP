package animals;

public class Crocodile extends Carnivorous implements Swim, Run {

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
