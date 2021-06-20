package animals;

public class Tiger extends Carnivorous implements Run, Voice {
    private String voice = "Ррр";

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
