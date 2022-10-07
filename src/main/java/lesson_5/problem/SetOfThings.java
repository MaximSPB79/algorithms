package lesson_5.problem;

import java.util.ArrayList;
import java.util.List;

public class SetOfThings {

    public static int numberOfThings;
    private static List<Thing> things = new ArrayList<>();

    public List<Thing> getThings() {
        return things;
    }

    public void setThings(List<Thing> things) {
        this.things = things;
    }

    public int getNumberOfThings() {
        return numberOfThings;
    }

    public void setNumberOfThings(int numberOfThings) {
        this.numberOfThings = numberOfThings;
    }

    public static List<Thing> generationThings(int numberOfThings) {
        for (int i = 0; i < numberOfThings; i++) {
            things.add(new Thing(i, (int) (Math.random() * 6 + 1), (int) (Math.random() * 20 + 1)));
        }
        return things;
    }
}
