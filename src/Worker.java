import animals.*;
import food.*;

public class Worker {
    public void feed(Animal animal, Food food) throws WrongFoodException {
        try {
            animal.eat(food);
        } catch (exception.WrongFoodException e) {
            e.printStackTrace();
        }
    }

    public void getVoice(Voice animal) {
        System.out.println("Сотрудник дает команду голос животному");
        animal.voice();
    }
}
