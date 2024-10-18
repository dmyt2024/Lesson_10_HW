package app;

import java.util.Arrays;
import java.util.Scanner;

public class Home_W_Less_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//     1)
        System.out.print("Введіть ціле число: ");
        int number = scanner.nextInt();
        System.out.print("Квадрат числа " + number + " дорівнює " +
                squareOfNumber(number) + ".\n");

//        2)
        double radius = 3.5;
        double height = 10;
        System.out.print("Обʼєм циліндра з радіусом " + radius + " і висотою " + height
                + " дорівнює " + cylinderArea(radius, height) + ".\n");

//        3)
        int[] array = {4, 0, 3, 4, 5};
        System.out.print("Масив чисел: " + Arrays.toString(array) + "\n");
        System.out.print("Сума всіх елементів масиву дорівнює " + sumArray(array) + ".\n");

//        4)
        System.out.print("Введіть рядок: ");
        scanner.nextLine();
        String str = scanner.nextLine();
        System.out.print("Рядок в зворотньому порядку: " + reversString(str) + "\n");

//        5)
        System.out.print(" Введіть а: ");
        int a = scanner.nextInt();
        System.out.print(" Введіть b: ");
        int b = scanner.nextInt();
        System.out.print("Результат a^b  дорівнює " + numPowToNum(a, b) + ".\n");

//        6)
        System.out.print("Введіть кількість повторів рядка: ");
        int n = scanner.nextInt();
        System.out.print("Введіть текстовий рядок: ");
        scanner.nextLine();
        String str1 = scanner.nextLine();
        System.out.println(repeatString(str1, n));
    }

    //    1)
    public static int squareOfNumber(int number) {
        int result = number * number;
        return result;
    }

    //    2)
    public static double cylinderArea(double radius, double height) {
        double pi = 3.14159;
        double result = pi * radius * 2 * height;
        return result;
    }

    //    3)
    public static int sumArray(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        return result;
    }

    //    4)
    public static String reversString(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length - 1 - i];
            chars[chars.length - 1 - i] = temp;
        }
        return new String(chars);
    }

    //    5)
    public static int numPowToNum(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        return result;
    }

    //    6)
    public static String repeatString(String str1, int n) {

        for (int m = 1; m < n; m++) {
            System.out.println(str1);
        }

        return str1;
    }
}
