package helps;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Создание ArrayList для хранения строк
        ArrayList<String> arrayList = new ArrayList<>();

        // Добавление элементов
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");

        // Вставка элемента по индексу
        arrayList.add(1, "Grapes");

        // Получение элемента по индексу
        String firstElement = arrayList.get(0); // "Apple"

        // Удаление элемента по индексу
        arrayList.remove(2); // Удаляет "Banana"

        // Проверка размера списка
        int size = arrayList.size(); // 3

        // Проверка, содержит ли список определенный элемент
        boolean containsOrange = arrayList.contains("Orange"); // true

        // Перебор элементов с помощью цикла for-each
        System.out.println("Элементы ArrayList:");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }
    }
}
