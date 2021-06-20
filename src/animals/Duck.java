package animals;

public class Duck extends Herbivore implements Swim, Fly, Voice {
    private String voice = "Кря";


    @Override
    public void setLevelOfFullness(int levelOfFullness) {
        super.setLevelOfFullness(5);
    }

    @Override
    public void fly() {
        System.out.println("Утка летает");
    }

    @Override
    public void swim() {
        System.out.println("Утка плавает в пруду");
    }

    @Override
    public void voice() {
        getVoice();
        System.out.println("Утка издает звук: " + voice);
    }

    public String getVoice() {
        return voice;
    }
}
