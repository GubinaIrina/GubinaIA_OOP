package food;

public class WrongFoodException extends Throwable {
    public WrongFoodException(String s) {
        super(s);
    }
}