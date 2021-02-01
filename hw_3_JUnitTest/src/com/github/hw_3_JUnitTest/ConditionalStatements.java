package com.github.hw_3_JUnitTest;


import java.util.Scanner;

public class ConditionalStatements {

    static final Scanner in = new Scanner(System.in);

    /**
     * Если а – четное посчитать а*б, иначе а+б
     */
    public static int HW_1_1_1(int a, int b) {
        if ((a % 2) == 0) {
            System.out.println("a * b = " + (a * b));
            return a * b;
        } else {
            System.out.println("a * b =" + (a + b));
            return a + b;
        }
    }

    /**
     * Определить какой четверти принадлежит точка с координатами (х,у)
     */
    public static int HW_1_1_2(int x, int y) {
        if (x == 0 || y == 0) {
            System.out.println("On axis");
            return 0;
        }
        if (x > 0) {
            if (y > 0) {
                System.out.println("В первой");
                return 1;
            } else {
                System.out.println("В четвёртой");
                return 4;
            }
        } else {
            if (y > 0) {
                System.out.println("Во второй");
                return 2;
            } else {
                System.out.println("В третьей");
                return 3;
            }
        }
    }

    /**
     * Найти суммы только положительных из трех чисел
     */
    public static int HW_1_1_3(int x, int y, int z) {
        int sum = 0;
        if (x > 0) {
            sum = sum + x;
        }
        if (y > 0) {
            sum = sum + y;
        }
        if (z > 0) {
            sum = sum + z;
        }
        if (sum == 0) {
            System.out.print("нет чисел с положительным числом");
            return sum;
        } else {
            System.out.print(sum);
            return sum;
        }

    }

    /**
     * Посчитать выражение макс(а*б*с, а+б+с)+3
     */

    public static int HW_1_1_4(int x, int y, int z) {
        int a = x * y * z;
        int b = x + y + z;
        if (x * y * z > x + y + z) {
            System.out.print("multiply" + a);
            return a;
        } else if (x * y * z == x + y + z) {
            System.out.println("Значения равны," + a);
            return a;
        } else {
            System.out.println("сумма" + b);
            return b;
        }
    }

    /**
     * Написать программу определения оценки студента по его рейтингу, на основе
     * следующих правил
     */
    public static String HW_1_1_5(int x) {
        if (x > 100) {
            System.out.println("Введена неверная оценка");
            return "Введена неверная оценка";
        } else if (x > 90) {
            System.out.println("A");
            return "A";
        } else if (x >= 75) {
            System.out.println("B");
            return "B";
        } else if (x >= 60) {
            System.out.println("C");
            return "C";
        } else if (x >= 40) {
            System.out.println("D");
            return "D";
        } else if (x >= 20) {
            System.out.println("E");
            return "E";
        } else if (x >= 0) {
            System.out.println("F");
            return "F";
        } else {
            System.out.println("Введена неверная оценка");
            return "Введена неверная оценка";
        }
    }
}
