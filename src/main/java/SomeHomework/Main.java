package SomeHomework;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.function.Function.*;
import static java.util.stream.Collectors.*;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String s = "one two three four five one two";
        System.out.println("Исходный массив");
        System.out.println(s);
        deleteduplicates(s);
        printUniqWords1(s);
        printUniqWords2(s);
        printUniqWords3(s);

        int[] numbers = {2, 3, 4, 2, 4, 5, 4, 3, 6, 3, 3, 2};
        findAndCountExample(numbers);
        findAndCountExample2(numbers);
        randomNumbers(5);

        String input = "  Привет,    мир!   Как   дела?  ";
        String s2 = "Мама";
        String s3 = "Мамам";
        String s4 = "Мамамй";
        deleteProbels(input);

        System.out.println(Arrays.toString(buble(numbers)));;

        System.out.println(palindrom(s2));
//        System.out.println(palindrom(s3));
//        System.out.println(palindrom(s4));
//        System.out.println(palindrom("madam")); // true
//        System.out.println(palindrom("hello")); // false
//        System.out.println(palindrom("Aba"));   // false
//        System.out.println(palindrom("А роза упала на лапу Азора")); // false

    }

    public static void deleteduplicates(String s) {
        ArrayList<String> list = new ArrayList<>(List.of(s.split(" ")));

        Set<String> set = new HashSet<>(list);
        System.out.println("Удаление дубликатов");
        System.out.println(set);
        System.out.println();
    }

    public static void printUniqWords1(String s) {
        ArrayList<String> list = new ArrayList<>(List.of(s.split(" ")));
        Map<String, Integer> mapCount = new HashMap<>();

        for (String word : list) {
            mapCount.put(word, mapCount.getOrDefault(word, 0) + 1);
        }

//        for (String word : list) {
//            if (mapCount.containsKey(word)) {
//                mapCount.put(word, mapCount.get(word) + 1);
//            } else {
//                mapCount.put(word, 1);
//            }
//        }

        Set<String> f = new HashSet<>();

        for (Map.Entry<String, Integer> entry : mapCount.entrySet()) {
            if (entry.getValue() == 1) {
                f.add(entry.getKey());
            }
        }
        System.out.println("Уникальные слова метод-1");
        System.out.println(f);
        System.out.println();
    }

    public static void printUniqWords2(String s) {
        ArrayList<String> list = new ArrayList<>(List.of(s.split(" ")));
        List<String> result = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            boolean uniq = true;
            for (int j = 0; j < list.size(); j++) {
                if (i != j && list.get(i).equals(list.get(j))) {
                    uniq = false;
                    break;
                }
            }
            if (uniq) {
                result.add(list.get(i));
            }
        }
        System.out.println("Уникальные слова метод-2");
        System.out.println(result);
        System.out.println();
    }

    public static void printUniqWords3(String s) {
        // Разделяем строку на слова и находим неповторяющиеся
        List<String> uniqueWords = Arrays.stream(s.split("\\s+")) // Разделяем по пробелам
                .collect(groupingBy(word -> word, counting())) // Группируем и считаем
                .entrySet().stream() // Работаем с наборами ключ-значение
                .filter(entry -> entry.getValue() == 1) // Фильтруем только те, что встречаются один раз
                .map(Map.Entry::getKey) // Извлекаем сами слова
                .toList(); // Собираем в список

        // Выводим результат
        System.out.println("Неповторяющиеся слова: " + uniqueWords);
    }

    public static void findAndCountExample(int[] numbers) {
        // Критерий: числа больше 2
        Map<Integer, Long> result = Arrays.stream(numbers)  // Превращаем массив в поток
                .boxed()  // Преобразуем int в Integer для использования методов Stream
                .filter(num -> num > 2)  // Фильтруем числа по критерию (больше 2)
                .collect(groupingBy(identity(), counting()));  // Группируем по числам и подсчитываем количество каждого

        // Выводим результаты в консоль
        result.forEach((key, value) -> System.out.println("Число " + key + " встречается " + value + " раз."));

    }

    public static void findAndCountExample2(int[] numbers) {
        // Критерий: числа больше 2
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int number : numbers) {
            if (number > 2) {  // Применяем фильтрацию по критерию
                frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + 1);  // Увеличиваем счетчик для числа
            }
        }

        // Выводим результаты в консоль
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Число " + entry.getKey() + " встречается " + entry.getValue() + " раз.");
        }
    }

    public static void randomNumbers(int n) {
        int[] r = new int[n];

        int q = 0;
        for (int i = 1; i <= n / 2; i++) {
            r[q++] = -i;
            r[q++] = i;
        }
        if (n%2 !=0 ) {
            r[q]=0;
        }
        System.out.println(Arrays.toString(r));
    }

    public static void deleteProbels(String s) {
        int i = s.length();
        System.out.println(s.replaceAll("\\s+", " "));
    }

    public static int[] buble (int [] ints) {
        for (int i = 0; i < ints.length-1; i++) {
            for (int j = 0; j < ints.length-1-i; j++) {
                int r = ints[j];
                if (ints[j]>ints[j+1]) {
                    ints[j] = ints[j+1];
                    ints[j+1] = r;
                }
            }
        }
        return ints;
    }

    public static boolean palindrom (String s) {
        StringBuilder b = new StringBuilder(s);
        return b.reverse().toString().equalsIgnoreCase(s);
    }
}


