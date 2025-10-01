package by.lessons.task5_6;

import java.util.Scanner;
import java.util.Random;

public class Main {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите номер задания от 1 до 11");
        String task = in.nextLine();

        switch (task) {
            case "1" -> {
                //1 . Необходимо, чтобы программа отображала следующую последовательность чисел:
                //7 14 21 28 35 42 49 56 63 70 77 84 91 98
                int i = 7;
                while (i <= 98) {
                    System.out.print(i + " ");
                    i = i + 7;
                }
                System.out.println(" c for :");
                for (i = 7; i <= 98; i = i + 7) {
                    System.out.print(i + " ");
                }

            }
            case "2" -> {
            /* 2. Необходимо вывести следующую последовательность цифр:
                1 2 4 8 16 32 64 128 256 512*/
                int i = 1;
                while (i <= 512) {
                    System.out.print(i + " ");
                    i = i * 2;
                }
                System.out.println();
                for (i = 1; i <= 512; i = i * 2) {
                    System.out.print(i + " ");
                }

            }
            case "3" -> {
                /**3. Написать программу, которая посчитает сумму первых 10 чисел*/
                int i = 1;
                int s = 0;
                while (i <= 10) {
                    s = s + i;
                    i++;
                }
                System.out.println("Сумма первых 10 чисел while " + s);
                s = 0;
                for (i = 1; i <= 10; i++) {
                    s = s + i;
                }

                System.out.println("Сумма первых 10 чисел for " + s);
            }
            case "4" -> {
                /*4. Вывести числа от 100 до 1 через запятую. В конце не должно быть запятой*/

                for (int i = 100; i > 1; i--) {
                    System.out.print(i + ", ");
                }
                System.out.println("1 ");

                int i = 100;
                while (i >= 1) {
                    System.out.print(i);
                    if (i != 1) {
                        System.out.print(", ");
                    }
                    i--;
                }
            }
            case "5" -> {
                /*5. Вывести числа от 1 до 100.*/
                int i = 1;
                while (i <= 100) {
                    System.out.print(i + "\t");
                    i++;
                }

            }
            case "6" -> {
                /*6. Вывести только нечётные числа от 1 до 100.*/
                int i = 1;
                while (i <= 100) {
                    System.out.print(i + "\t");
                    i = i + 2;
                }
            }
            case "7" -> {
                /*7 Вывести каждый десяток от 1 до 100.*/
                int i = 10;
                while (i <= 100) {
                    System.out.print(i + "\t");
                    i = i + 10;
                }
            }
            case "8" -> {
                /*8. Создать массив из чисел. Вывести макс и мин число.*/
                Random rand = new Random();
                int[] a = new int[20];

                // Заполняем массив случайными числами (например, от 0 до 99)
                System.out.println("Массив: ");
                for (int i = 0; i < 20; i++) {
                    a[i] = rand.nextInt(100); // Генерирует случайное целое число от 0 до 99
                    System.out.print(a[i] + " "); // Выводим элемент массива
                }
                int amin = a[0];
                int amax = a[0];
                for (int l : a
                ) {
                    if (amin > l) {
                        amin = l;
                    }
                    if (amax < l) {
                        amax = l;
                    }
                }
                /**for (int i = 1; i < 20; i++) {
                 if (amin > a[i]) {
                 amin = a[i];
                 }
                 if (amax < a[i]) {
                 amax = a[i];
                 }
                 }*/
                System.out.println();
                System.out.println("Минимальный элемент: " + amin);
                System.out.println("Максимальный элемент: " + amax);
            }
            case "9" -> {
                /*9. Создать массив чисел от 1 до 100. Вывести полученный массив.*/
                int[] a = new int[100];

                System.out.println("Массив: ");
                for (int i = 0; i < 100; i++) {
                    a[i] = i + 1;
                    System.out.print(a[i] + " "); // Выводим элемент массива
                }

                System.out.println();
            }
            case "10" -> {
                /*10. Сортировать массив чисел. Сортирвка пузырьком*/
                Random rand = new Random();
                int[] a = new int[20];

                // Заполняем массив случайными числами (например, от 0 до 99)
                System.out.println("Массив: ");
                for (int i = 0; i < 20; i++) {
                    a[i] = rand.nextInt(100); // Генерирует случайное целое число от 0 до 99
                    System.out.print(a[i] + " "); // Выводим элемент массива
                }
                for (int j = a.length - 1; j > 0; j--) {
                    for (var i = 0; i < j; i++) {
                        if (a[i] > a[i + 1]) {
                            var temp = a[i];
                            a[i] = a[i + 1];
                            a[i + 1] = temp;
                        }
                    }
                }
                System.out.println("\nОтсортированный массив: ");
                for (int i = 0; i < 20; i++) {
                    System.out.print(a[i] + " "); // Выводим элемент массива
                }

                System.out.println();
            }
            case "11" -> {
                /*11. Ввести число с консоли, которое не заканчивается на 0.
                Вывести среднее значение всех цифр в числе. Использовать оператор %.(цикл while)*/
                int x;
                do {
                    System.out.println("Введите ПОЛОЖИТЕЛЬНОЕ число x, не кратное 10: ");
                    x = in.nextInt();
                } while (x < 0 || x % 10 == 0)  ;
                int sum = 0;
                int k = 0;
                double res = 0.0;
                while (x % 10 > 0)
                {
                   sum = sum + x % 10;
                   x = (int) x / 10;
                   k++;
                }
                System.out.println("Сумма чисел: "+ sum);
                System.out.println("Количество чисел: "+ k);
                res = (double)sum/k;
                System.out.println("Среднее арифметическое чисел: "+ res);
            }
            default -> System.out.println("Нет такого пункта меню. Попробуйте еще раз.");
        }

    }
}
