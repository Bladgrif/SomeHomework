package helps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExample {
    public static void main(String[] args) {
        // Создаем ArrayList и добавляем элементы
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Сортировка списка
        Collections.sort(fruits);
        System.out.println("Сортированный список: " + fruits); // [Apple, Banana, Orange]

        // Поиск элемента
        int index = Collections.binarySearch(fruits, "Orange");
        System.out.println("Индекс элемента Orange: " + index); // 2

        // Перемешивание элементов списка
        Collections.shuffle(fruits);
        System.out.println("Перемешанный список: " + fruits);

        // Обратная сортировка
        Collections.reverse(fruits);
        System.out.println("Обратный порядок: " + fruits);
    }
}

