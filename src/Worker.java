import animals.*;
import food.*;

public class Worker {
    public void feed(Animal animal, Food food) {
        animal.eat(food);
    }

    public void getVoice(Voice animal) {
        System.out.println("Сотрудник дает команду голос животному");
        animal.voice();
    }
}
