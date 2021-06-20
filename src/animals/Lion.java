package animals;

public class Lion extends Carnivorous implements Run, Voice {
   private String voice = "Ррр";

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
        getVoice();
        System.out.println("Лев издает звук: " + voice);
    }
    public String getVoice() {
        return voice;
    }
}
