package helps;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Создание HashMap для хранения строковых ключей и значений
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Добавление пар ключ-значение
        hashMap.put("Apple", 100);
        hashMap.put("Banana", 80);
        hashMap.put("Orange", 150);

        // Получение значения по ключу
        int applePrice = hashMap.get("Apple"); // 100

        // Удаление пары по ключу
        hashMap.remove("Banana");

        // Проверка наличия ключа или значения
        boolean hasOrange = hashMap.containsKey("Orange"); // true
        boolean hasPrice150 = hashMap.containsValue(150); // true

        // Перебор элементов (пар ключ-значение)
        System.out.println("Элементы HashMap:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("Ключ: " + entry.getKey() + ", Значение: " + entry.getValue());
        }

        // Получение всех ключей или значений
        System.out.println("Ключи: " + hashMap.keySet()); // [Apple, Orange]
        System.out.println("Значения: " + hashMap.values()); // [100, 150]
    }
}
