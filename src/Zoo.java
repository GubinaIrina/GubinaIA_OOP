import animals.*;
import food.*;

public class Zoo {
    public static void main(String[] args) {
        Worker worker = new Worker();

        Animal duck = new Duck();
        Animal fish = new Fish();
        Animal crocodile = new Crocodile();
        Animal lion = new Lion();
        Animal tiger = new Tiger();
        Animal rabbit = new Rabbit();

        Food carrot = new Vegetables();
        Food meat = new RawMeat();
        Food fishFood = new FishFood();
        Food plants = new Plants();

        worker.feed(rabbit, carrot);
        worker.feed(lion, meat);
        worker.feed(tiger, carrot);
        worker.feed(fish, fishFood);
        worker.feed(duck, fishFood);
        worker.feed(duck, plants);
        worker.feed(crocodile, meat);

        Voice tigerVoice = new Tiger();
        Voice lionVoice = new Lion();
        Voice duckVoice = new Duck();
        worker.getVoice(duckVoice);
        worker.getVoice(lionVoice);
        worker.getVoice(tigerVoice);

        Swim duck1 = new Duck();
        Swim fish1 = new Fish();
        Swim crocodile1 = new Crocodile();
        Swim[] swims = new Swim[3];
        swims[0] = duck1;
        swims[1] = fish1;
        swims[2] = crocodile1;

        for (int i = 0; i < swims.length; i++) {
            swims[i].swim();
        }
    }
}
