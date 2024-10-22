package helps;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Anna", "John", "Mark", "Amanda", "Bob", "Alice");

        // Фильтрация, сортировка и вывод значений
        names.stream()
                .filter(name -> name.startsWith("A"))  // Оставляем только имена, которые начинаются с "A"
                .sorted()  // Сортируем в алфавитном порядке
                .forEach(System.out::println);  // Выводим имена на экран

        List<String> words = Arrays.asList("stream", "java", "code", "example", "lambda");

        // Преобразование списка строк в список их длин
        List<Integer> wordLengths = words.stream()
                .map(String::length)  // Преобразуем каждую строку в её длину
                .toList();  // Собираем результат в новый список

        System.out.println("Длины слов: " + wordLengths);  // [6, 4, 4, 7, 6]

        List<Integer> numbers = Arrays.asList(5, 12, 8, 21, 14, 7, 18);

        // Подсчет количества чисел больше 10
        long count = numbers.stream()
                .filter(num -> num > 10)  // Фильтруем числа, оставляя только те, что больше 10
                .count();  // Подсчитываем количество оставшихся элементов

        System.out.println("Количество чисел больше 10: " + count);  // 4

        List<String> stringNumbers = Arrays.asList("1", "2", "3", "4", "5");

        // Преобразование строк в числа и нахождение суммы
        int sum = stringNumbers.stream()
                .map(Integer::parseInt)  // Преобразуем строки в числа
                .reduce(0, Integer::sum);  // Находим сумму всех чисел

        System.out.println("Сумма чисел: " + sum);  // 15\

        List<String> names2 = Arrays.asList("John", "Anna", "Mark");

        // Объединение имен в одну строку с разделителем ", "
        String joinedNames = String.join(", ", names2);  // Объединяем имена через запятую и пробел

        System.out.println("Объединенные имена: " + joinedNames);  // John, Anna, Mark

    }

}

