package hw.hw_3;

import java.util.*;

public class hw3 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("string");
        strings.add("40");
        strings.add("-5");
        strings.add("my_string");

        System.out.println(strings);
        removeEvenNumber(strings); // [40, my_string]
        // removeIntegers(strings); // [string, my_string]
        System.out.println(strings);
    }

    static void removeEvenNumber(List<String> numbers) {
        // TODO: 31.03.2023 Удалить все четные элементы из списка
        for (int i = numbers.size() - 1; i >= 0; i--) {
            if (i % 2 == 0) {
                numbers.remove(i);
            }
        }
    }

    static void removeIntegers(List<String> strings) {
        // TODO: 31.03.2023 Удалить строки, которые являются целыми числами
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            try {
                Integer.parseInt(next);
                iterator.remove();
            } catch (NumberFormatException e) {
            }
        }

    }
}