package SomeHomework;


import java.util.Arrays;

public class sortStrings {

    public static void main(String[] args) throws Exception {

        String[] inputList = { "Янв", "Феб", "Мар", "Апр", "Май", "Июн", "Июл",
                "Авг", "Сен", "Окт", "Ноя", "Дек" };

        // Показать имеющийся несортированный список.
        System.out.println("-------Входной список-------");
        showList(inputList);

        // Вызов сортировки этого списка.
        Arrays.sort(inputList);

        // Показать отсортированный список.
        System.out.println("\n-------Сортированный список-------");
        showList(inputList);

        // Вызов сортировки списка с учетом регистра.
        System.out.println("\n-------Сортированный список с учетом регистра-------");
        Arrays.sort(inputList, String.CASE_INSENSITIVE_ORDER);

        // Выводим отсортированный список.
        showList(inputList);
    }

    public static void showList(String[] array) {
        for (String str : array) {
            System.out.print(str + " ");
        }
        System.out.println();
    }

}
