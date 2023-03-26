package hw.hw_1;

public class task1 {
    public static void main(String[] args) {
        System.out.println(isSumBetween10And20(5, 15)); // true
        System.out.println(isSumBetween10And20(7, 15)); // false
        System.out.println(isSumBetween10And20(2, 6)); // false

        System.out.println(isPositive(5)); // true
        System.out.println(isPositive(-3)); // false

        printString("abcd", 5); // abcdabcdabcdabcdabcd

        System.out.println(isLeapYear(1990)); // false
        System.out.println(isLeapYear(2000)); // true
        System.out.println(isLeapYear(2024)); // true

        printArray(createArray(10, 11)); // 11 11 11 11 11 11 11 11 11 11

        int[] array1 = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        printArray(changesNumbers(array1)); // 0, 0, 1, 1, 0, 1, 0, 0, 1, 1

        int[] array2 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        printArray(multipliesNumbersLessSix(array2)); // 2, 10, 6, 4, 11, 8, 10, 4, 8, 8, 9, 2

        int[][] array3 = new int[4][4]; // [[0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0]]
        printTwoDimendionalArray(fillsDiagonal(array3)); // [[1, 0, 0, 0], [0, 1, 0, 0], [0, 0, 1, 0], [0, 0, 0, 1]]

        int[][] array4 = new int[4][4];
        printTwoDimendionalArray(fillsDiagonal1(array4)); // [[0, 0, 0, 1], [0, 0, 1, 0], [0, 1, 0, 0], [1, 0, 0, 0]]
    }

    private static boolean isSumBetween10And20(int a, int b) {
        /**
         * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
         * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть
         * true, в противном случае – false.
         */
        if (a + b <= 20 && a + b >= 10) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean isPositive(int x) {
        // проверить, что х положительное
        if (x > 0) {
            return true;
        } else {
            return false;
        }
    }

    private static void printString(String source, int repeat) {
        // напечатать строку source repeat раз
        for (int i = 0; i < repeat; i++) {
            System.out.print(source);
        }
        System.out.println("");
    }

    private static boolean isLeapYear(int year) {
        // проверить, является ли год високосным. если да - return true
        // год является високосным, если он делится на 4, но не делится на 100, но
        // делится на 400
        if (year % 4 != 0 || year % 100 == 0 && year % 400 != 0) {
            return false;
        } else {
            return true;
        }
    }

    private static int[] createArray(int len, int initialValue) {
        // должен вернуть массив длины len, каждое значение которого равно initialValue
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }

    private static int[] changesNumbers(int[] array) {
        // 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
        // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия
        // заменить 0 на 1, 1 на 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else if (array[i] == 1) {
                array[i] = 0;
            }
        }
        return array;
    }

    private static int[] multipliesNumbersLessSix(int[] array) {
        // 2. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему
        // циклом, и числа меньшие 6 умножить на 2;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
        }
        return array;
    }

    private static int[][] fillsDiagonal(int[][] array) {
        // 3. Создать квадратный двумерный целочисленный массив (количество строк и
        // столбцов одинаковое),
        // и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно
        // только одну из диагоналей, если обе сложно).
        // Определить элементы одной из диагоналей можно по следующему принципу: индексы
        // таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
        // Также заполнить элементы побочной диагонали
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (i == j) {
                    array[i][j] = 1;
                }
            }
        }
        return array;
    }

    private static int[][] fillsDiagonal1(int[][] array) {
        // 3. Создать квадратный двумерный целочисленный массив (количество строк и
        // столбцов одинаковое),
        // и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно
        // только одну из диагоналей, если обе сложно).
        // Определить элементы одной из диагоналей можно по следующему принципу: индексы
        // таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
        // Также заполнить элементы побочной диагонали
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (i + j == array.length - 1) {
                    array[i][j] = 1;
                }
            }
        }
        return array;
    }

    private static void printTwoDimendionalArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println("");
        }
    }

}
