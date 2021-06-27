import animals.*;
import cage.Cage;
import cage.CageSize;
import food.*;


public class Zoo {
    public static void main(String[] args) throws WrongFoodException {
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
        worker.feed(fish, fishFood);
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

        Cage<Animal> smallCage = new Cage<>("Маленький", CageSize.SMALL);
        Cage<Animal> mediumCage = new Cage<>("Средний", CageSize.MEDIUM);
        Cage<Animal> bigCage = new Cage<>("Большой", CageSize.BIG);
        mediumCage.addAnimal(duck);
        mediumCage.addAnimal(crocodile);
        bigCage.addAnimal(lion);
        bigCage.addAnimal(rabbit);
        smallCage.addAnimal(rabbit);
        bigCage.addAnimal(tiger);

        mediumCage.removeAnimal(crocodile);

        bigCage.showAnimalsInCage();

        worker.feed(tiger, carrot);
    }
}
