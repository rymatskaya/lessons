package by.lessons.task3_4;

import java.util.Scanner;

public class Main {
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите номер задания");
        String task = in.nextLine();

        switch (task) {
            case "1" -> {
                //1 Дано уравнение: (10+12)*x=88;. Найти значение x.
                int x;
                x = 88 / (10 + 12);
                System.out.print("Результат: ");
                System.out.println("x=" + x);

                System.out.println("**************************************");
            }
            case "2" -> {
            /* 4 Введите x,y,z.
            К числу x прибавьте y, число y умножьте на z.
            Используйте операции присваивания.*/

                System.out.println("Введите x");
                double x1 = in.nextDouble();
                System.out.println("Введите y");
                double y = in.nextDouble();
                System.out.println("Введите z");
                double z = in.nextDouble();
                //double res = x + y * z;
                x1 += y;
                y *= z;
                System.out.print("Результат:");
                System.out.println("x + y * z = " + y);
                System.out.println("**************************************");
            }
            case "3" -> {
                /** 6. Даны значения: x=5; y=2; c=x*y;
                 * 6.2 Расставьте операции инкремента декремента так,
                 * чтобы после выполнения операции (c=x*y) с=10; x=6; y=1*/
                int x3 = 5;
                int y3 = 2;
                int c = x3 * y3;
                x3++;
                y3--;
                System.out.println("Результат: ");
                System.out.println("c = " + c);
                System.out.println("x = " + x3);
                System.out.println("y = " + y3);
                System.out.println("**************************************");
            }
            case "4" -> {
               /*Ввести числа a и b с консоли. Если a>b,
                то вывести разность (a-b) передав ее в новую переменную.
                Иначе если a=b  вывести сумму этих чисел.
                Иначе, вывести разность b-a.
                Результат вычисления передать в новую переменную.*/
                System.out.println("Введите a");
                double a=in.nextDouble();
                System.out.println("Введите b");
                double b=in.nextDouble();
                double res;

                if ( a > b) {
                    res = a - b;
                }
                else if ( a == b) {
                    res = a + b;
                }
                else {
                    res = b - a;
                }
                System.out.println("Результат: " + res);
                System.out.println("**************************************");
            }
            case "5" -> {
               /*Ввести числа a и b с консоли.
                Если a>b и b не равно 0-вывести результат деления a на b.
                Иначе если a не равно 0, вывести b/a, Иначе вывести сумму чисел a и b.*/
                System.out.println("Введите a");
                double a=in.nextDouble();
                System.out.println("Введите b");
                double b=in.nextDouble();
                double res;

                if ( a > b && b != 0) {
                    res = a / b;
                }
                else if ( a != 0) {
                    res = b / a;
                }
                else {
                    res = b + a;
                }
                System.out.println("Результат: " + res);
                System.out.println("**************************************");
            }
            case "6" -> {
               /*На вход дано число. Определить, делиться ли оно на три. Вывести соответствующий текст.*/
                System.out.println("Введите число ");
                int ch=in.nextInt();
                if ( ch % 3 == 0) {
                    System.out.println(" Число делится на 3. ");
                }
                else {
                    System.out.println(" Число не делится на 3. ");
                }
            }
            default -> System.out.println("Нет такого пункта меню. Попробуйте еще раз.");
        }
    }
}
