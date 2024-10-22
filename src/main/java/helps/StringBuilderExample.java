package helps;

public class StringBuilderExample {
    public static void main(String[] args) {
        // Создание пустого StringBuilder
        StringBuilder sb = new StringBuilder();

        // Создание StringBuilder с начальной строкой
        StringBuilder sbWithText = new StringBuilder("Hello");

        // Добавление текста в конец
        sb.append("Java");
        sb.append(" Programming");


        // Вставка текста по индексу
        sb.insert(5, " Awesome"); // Вставляем слово "Awesome" после слова "Hello"

        // Замена части строки
        sb.replace(5, 12, " World"); // Заменяем "Awesome" на "World"

        // Удаление части строки
        sb.delete(5, 11); // Удаляем " World"

        // Преобразование в строку
        String result = sb.toString();

        // Перевернуть строку
        sb.reverse(); // Переворачивает весь текст в StringBuilder

        // Получение длины и емкости
        int length = sb.length(); // Возвращает текущую длину строки
        int capacity = sb.capacity(); // Возвращает текущую емкость StringBuilder

        // Вывод результата
        System.out.println("Результат: " + result); // Результат: HelloJava Programming
        System.out.println("Перевернутый: " + sb);  // gnimmargorP avaJolleH
    }
}
