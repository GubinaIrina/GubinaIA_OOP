package animals;

import food.Food;


public abstract class Animal {
    private int levelOfFullness;

    public abstract void eat(Food food);

    public int getLevelOfFullness() {
        return levelOfFullness;
    }

    public void setLevelOfFullness(int levelOfFullness) {
        this.levelOfFullness = levelOfFullness;
    }
}
