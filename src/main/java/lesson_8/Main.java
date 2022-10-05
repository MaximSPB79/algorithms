package lesson_8;

/** Программа генерирует последовательно связанные блоки. Каждый блок имеет свой хэш и связан с предыдущим, так же хешем.
 * Метод blockCheck() проверяет не нарушена ли эта связь и выдает true, если все в порядке.
*/
public class Main {
    public static void main(String[] args) {

        Blockchain.blockGeneration(10);
        System.out.println(Blockchain.blockCheck());

    }
}
