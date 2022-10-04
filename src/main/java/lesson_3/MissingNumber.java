package lesson_3;

import java.util.Arrays;

/**
 * 1. Дан массив из n элементов, начиная с 1. Каждый следующий элемент равен (предыдущий + 1). Но в массиве
 * гарантированно 1 число пропущено. Необходимо вывести на экран пропущенное число. Постарайтесь придумать
 * более оптимальный (асимптотически) алгоритм. Примеры:
 * 1. [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16] => 11
 * 2. [1, 2, 4, 5, 6] => 3
 * 3. [2, 3, 4, 5, 6, 7, 8] => 1
 * 4. [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14] => 15
 * 5. [] => 1
 */
public class MissingNumber {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16};

        System.out.println(searchNumber(arr));

    }

    private static int searchNumber(int[] arr) {
        int realSizeArray = arr.length + 1;
        int sum = Arrays.stream(arr).sum();
        int magicSum = (realSizeArray * (realSizeArray + 1)) / 2;
        return magicSum - sum;
    }
}
