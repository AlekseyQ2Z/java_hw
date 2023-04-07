package hw.hw_4;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class hw4 {
    public static void main(String[] args) {
        // Реализовать приложение, которое:
        // Принимает от пользователя и запоминает строки
        // Если пользователь ввел print, то выводим все предыдущие строки в обратном
        // порядке
        // Если введено revert, то удаляем последнюю введеную строку
        // Если введено exit, то завершаем программу

        // java
        // c++
        // python
        // c#
        // print
        // < [c#, python, c++, java]
        // revert
        // print
        // < [python, c++, java]
        // exit
        Deque<String> deque = new ArrayDeque<>();
        String temp = "";
        Scanner scanner = new Scanner(System.in);
        while (!temp.equals("exit")) {
            System.out.print("Введите текст: ");
            temp = scanner.nextLine();
            if (temp.equals("revert")) {
                deque.removeFirst();
            } else if (temp.equals("print")) {
                System.out.println(deque);
            } else {
                deque.addFirst(temp);
            }
        }
        scanner.close();
    }
}
