package hw.hw_2;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

        // Дано четное число N (>0) и символы c1 и c2.
        // Написать метод, который вернет строку длины N, которая состоит из
        // чередующихся символов c1 и c2, начиная с c1.

        // Пример. (n = 6, c1='a', c2='b') -> "ababab"
        // (n = 8, c1='x', c2='y') -> "xyxyxyxy"

        // static String buildString(int n, char c1, char c2) {
        // // TODO: 28.03.2023 Домашнее задание!
        // return null;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Введите первый символ: ");
        char symbol1 = scanner.nextLine().charAt(0);
        System.out.print("Введите второй символ: ");
        char symbol2 = scanner.nextLine().charAt(0);
        System.out.println(buildString(number, symbol1, symbol2));
        scanner.close();
    }

    static String buildString(int n, char c1, char c2) {
        StringBuilder string1 = new StringBuilder("");
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                string1.append(c1);
            }
            if (i % 2 != 0) {
                string1.append(c2);
            }
        }
        return string1.toString();
    }
}