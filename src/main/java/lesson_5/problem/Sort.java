package lesson_5.problem;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Sort {

    List<Thing> things;
    List<Thing> sortThing = new ArrayList<>();

    public Sort(List<Thing> things) {
        this.things = things;
    }

    public List<Thing> getSortThing() {
        Comparator<Thing> thingComparator = Comparator.comparingDouble(Thing::getPrice).reversed();
        return sortThing = things
                .stream()
                .sorted(thingComparator)
                .toList();
    }
}
