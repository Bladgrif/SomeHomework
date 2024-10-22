package helps;

import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        // Создание и инициализация массива
        int[] numbers = {5, 3, 8, 1, 9, 6};

        // Сортировка массива
        Arrays.sort(numbers); // Сортирует массив по возрастанию

        // Поиск элемента в отсортированном массиве
        int index = Arrays.binarySearch(numbers, 8); // Ищем элемент 8, вернет индекс 4

        // Копирование массива
        int[] copiedArray = Arrays.copyOf(numbers, numbers.length); // Копируем весь массив

        // Заполнение массива определенным значением
        int[] filledArray = new int[5];
        Arrays.fill(filledArray, 7); // Заполняем массив значениями 7

        // Сравнение массивов
        boolean arraysEqual = Arrays.equals(numbers, copiedArray); // Сравниваем исходный массив с копией

        // Преобразование массива в строку для вывода
        String arrayAsString = Arrays.toString(numbers); // Преобразуем массив в строку для удобного вывода

        // Вывод результата
        System.out.println("Сортированный массив: " + arrayAsString); // Сортированный массив: [1, 3, 5, 6, 8, 9]
        System.out.println("Индекс числа 8: " + index);               // Индекс числа 8: 4
        System.out.println("Копия массива: " + Arrays.toString(copiedArray)); // Копия массива: [1, 3, 5, 6, 8, 9]
        System.out.println("Заполненный массив: " + Arrays.toString(filledArray)); // Заполненный массив: [7, 7, 7, 7, 7]
        System.out.println("Массивы равны: " + arraysEqual); // Массивы равны: true
    }
}

