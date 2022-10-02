package lesson_2;

import java.util.ArrayList;
import java.util.List;

import static lesson_2.Notebook.Brand.*;

public class LaptopGeneration {

    private final List<Double> prices = List.of(100.0, 200.0, 300.0, 400.0, 500.0, 600.0, 700.0);
    private final List<Integer> rums = List.of(4, 8, 16, 20, 24);
    private final List<Enum> brands = List.of(Lenuvo, Asos, MacNote, Eser, Xamiou);
    private List<Notebook> notebookList = new ArrayList<>();
    private int amount;

    public LaptopGeneration(int amount) {
        this.amount = amount;
    }

    public List<Notebook> getNotebookList() {
        for (int i = 0; i < amount; i++) {
            notebookList.add(new Notebook(prices.get((int) (Math.random() * prices.size())),
                    rums.get((int) (Math.random() * rums.size())),
                    brands.get((int) (Math.random() * brands.size()))));
        }
        return notebookList;
    }
}
