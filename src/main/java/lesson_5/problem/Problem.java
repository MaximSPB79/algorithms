package lesson_5.problem;

import java.util.List;

/**
 * Есть рюкзак, который вмещает x кг чего-то.
 * Есть n вещей. У каждой вещи есть ее вес p и стоимость q. p, q > 0.
 * <p>
 * Требуется максимизировать сумарную стоимость с учетом не превышения сумарного веса.
 * <p>
 * Найти самый дорогой вмещаемый набор.
 */

public class Problem {

    private static List<Thing> things;
    private static int sumWeight;
    private static Bag bag;
    private static List<Thing> listSort;
    private static Thing thing;


    public static void main(String[] args) {
        bag = new Bag(10);
        System.out.println("Вместимость рюкзака " + bag.getCapacity() + " кг.");
        things = SetOfThings.generationThings(4);
        // Sort list = new Sort(things);
        //listSort = list.getSortThing();
        //listSort.forEach(System.out::println);
        System.out.println("-------------------------");
        selectionOfThings(getSumWeight());
    }

    private static int getSumWeight() {
        for (Thing thing : things) {
            sumWeight += thing.getWeight();
        }
        return sumWeight;
    }
// Идея у меня была такая. Отсортировать лист по цене и его сюда подставить вместо things. И тогда мы удаляли бы вещи с
// наименьшей ценой(она всегда стояла бы в последней ячейке). Но как только я это делаю все падает и вылетает
// UnsupportedOperationException. Исправить никак не получается. Игорь, можете мне в комментарии подсказать как это реализовать.
    // Спасибо
    // В таком варианте все работает, только не выполняется условие максимальной цены в наборе

    private static void selectionOfThings(int sumWeight) {
        if (sumWeight <= bag.getCapacity()) {
            System.out.println("Все вещи поместились");
        } else {
            thing = things.remove(things.size() - 1);
            System.out.println("Убираем одну вещь " + thing);
            things.forEach(System.out::println);
            selectionOfThings(sumWeight - thing.getWeight());
        }
    }
}
