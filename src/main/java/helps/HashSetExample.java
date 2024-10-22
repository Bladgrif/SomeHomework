package helps;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        // Создание HashSet для хранения целых чисел
        HashSet<Integer> hashSet = new HashSet<>();

        // Добавление элементов
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);
        hashSet.add(20); // Повторное добавление, игнорируется (HashSet хранит только уникальные элементы)

        // Удаление элемента
        hashSet.remove(10); // Удаляет элемент 10

        // Проверка размера множества
        int size = hashSet.size(); // 2

        // Проверка наличия элемента
        boolean contains30 = hashSet.contains(30); // true

        // Перебор элементов с помощью цикла for-each
        System.out.println("Элементы HashSet:");
        for (Integer number : hashSet) {
            System.out.println(number);
        }
    }
}

