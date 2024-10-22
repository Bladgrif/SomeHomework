package SomeHomework;

import java.io.IOException;

public class Task {
//    Ещё одна задачка свежая: написать функцию которая на вход принимает int n и
//    возвращает массив длиной n состоящий из уникальных чисел и сумма чисел в массиве равна 0.
//
//    Также нужно решить задачу, написать методы для валидации условий и предложить тест кейсы для проверки.
//
//    P.S. Никаких деталей о реализации нет, мы никак не определяем каким образом нужно делать массив.
    public static int [] getUniqueDistinctNumbersList(int n) {
        int sum = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            if (i!=n-1) {
                arr[i] = i + 1;
                sum += arr[i];
            } else  {
                arr[i] = -sum;
            }
        }
        return arr;
    }

    public static void Example() throws IOException {
        throw new IOException();
    }

}
