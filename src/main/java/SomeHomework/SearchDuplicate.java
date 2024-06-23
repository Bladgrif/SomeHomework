package SomeHomework;

import java.util.*;

public class SearchDuplicate {
    public static void main(String[] args) {
        String str = "one two three four one two five";
        String[] arr = str.toLowerCase().split(" ");

        Set<String> seenWords = new HashSet<>();
        Set<String> uniqueWords = new HashSet<>();

        for (String word : arr) {
            if (!seenWords.contains(word)) {
                seenWords.add(word);
                uniqueWords.add(word);
            } else {
                uniqueWords.remove(word);
            }
        }

        System.out.println("Уникальные слова в строке:");
        for (String word : uniqueWords) {
            System.out.println(word);
        }
    }
}
