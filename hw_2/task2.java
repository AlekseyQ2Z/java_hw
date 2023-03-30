package hw.hw_2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class task2 {
    public static void main(String[] args) {
        // Создать файл file.txt. Если файл уже создан, ничего делать не надо. Записать
        // в файл слово TEXT 100 раз: TEXTTEXTTEXTTEXTTEXTTEXT...

        Path path = Path.of("hw", "hw_2", "file.txt");
        try {
            Files.createFile(path);
            System.out.println("Файл создан");
            Files.writeString(path, createsString(100, "TEXT"));
        } catch (IOException e) {
            System.out.println("Ошибка " + e);
        }
    }

    static String createsString(int count, String text) {
        StringBuilder string1 = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            string1.append(text);
        }
        return string1.toString();
    }

}
