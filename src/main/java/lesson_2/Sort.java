package lesson_2;

import java.util.Comparator;
import java.util.List;

public class Sort {

    public static void main(String[] args) {

        List<Notebook> notebooks = new LaptopGeneration(10000).getNotebookList();

        Comparator<Notebook> notebookComparator = Comparator.comparingDouble(Notebook::getPrice)
                .thenComparing(Notebook::getRum)
                .thenComparing(Comparator.<Notebook>comparingInt(n -> n.getBrand().ordinal()).reversed())
                .reversed();

        List<Notebook> sortNotebooks = notebooks
                .stream()
                .sorted(notebookComparator)
                .toList();

        sortNotebooks.forEach(System.out::println);
    }
}
