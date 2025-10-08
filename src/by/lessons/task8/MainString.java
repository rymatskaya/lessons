package by.lessons.task8;

import java.util.Random;
import java.util.Scanner;

public class MainString {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        /**
         * 1. Напишите метод, который принимает в качестве параметра любую строку, например “I like Java!!!”.
         * 2. Распечатать последний символ строки. Используем метод String.charAt().
         * 3. Проверить, заканчивается ли ваша строка подстрокой “java!”. Используем метод String.endsWith().
         * 4. Проверить, начинается ли ваша строка подстрокой “Добро пож”. Используем метод String.startsWith().
         * 5. Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
         * 6. Найти позицию подстроки “Java” в строке “I like Java!!!”.
         * 7. Заменить все символы “а” на “о”.
         * 8. Преобразуйте строку к верхнему регистру.
         * 9. Преобразуйте строку к нижнему регистру.
         * 10. Вырезать строку Java c помощью метода String.substring().*/
        System.out.println("Введите номер задания от 1 до 10");
        String task = in.nextLine();

        switch (task) {
            case "1" -> {
                /** 1. Напишите метод, который принимает в качестве параметра любую строку, например “I like Java!!!”.*/
                String java = "I like Java!!!";
                System.out.println(java);
            }
            case "2" -> {
                /** 2. Распечатать последний символ строки. Используем метод String.charAt().     */
                String java = "I like Java!!!";
                System.out.println(java.charAt(java.length() - 1));

            }
            case "3" -> {
                /**Проверить, заканчивается ли ваша строка подстрокой “java!”. Используем метод String.endsWith().*/
                String java = "java!";
                String fulljava = "I like java!";

                boolean b1 = fulljava.endsWith(java);
                if (b1) {
                    System.out.println("Строка " + fulljava + " заканчивается в " + java);
                } else {
                    System.out.println("Строка " + fulljava + " не заканчивается в " + java);
                }

            }
            case "4" -> {
                /**4.Проверить, начинается ли ваша строка подстрокой “Добро пож”. Используем метод String.startsWith().*/

                String java = "Добро пож";
                String fulljava = "Добро пожаловать";

                boolean b1 = fulljava.startsWith(java);
                if (b1) {
                    System.out.println("Строка " + fulljava + " начинается с " + java);
                } else {
                    System.out.println("Строка " + fulljava + " не начинается с " + java);
                }
            }
            case "5" -> {
                /**5. Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().*/
                String java = "Java";
                String fulljava = "I like Java!";
                boolean  b1 = fulljava.contains(java);
                if (b1) {
                    System.out.println("Строка " + fulljava + " содержит подстроку " + java);
                } else {
                    System.out.println("Строка " + fulljava + " не содержит подстроку " + java);
                }

            }
            case "6" -> {
                /**6. Найти позицию подстроки “Java” в строке “I like Java!!!”*/
                String java = "Java";
                String fulljava = "I like Java!!!";
                int index = fulljava.indexOf(java);
                System.out.println("Позиция подстроки " + index);
            }
            case "7" -> {
                /**7. Заменить все символы “а” на “о”.*/
                String str = "I like Java!!!";
                String replacedString = str.replace('a', 'о');
                System.out.println("Строка после замены " + replacedString);
            }
            case "8" -> {
                /**8. Преобразуйте строку к верхнему регистру.*/
                String str = "I like Java!!!";
                String upperCase = str.toUpperCase();
                System.out.println("к верхнему регистру: " + upperCase);
            }
            case "9" -> {
                /**9. Преобразуйте строку к нижнему регистру.*/
                String str = "I like Java!!!";
                String lowerCase = str.toLowerCase();
                System.out.println("к нижнему регистру: " + lowerCase);
            }
            case "10" -> {
                /**10. Вырезать строку Java c помощью метода String.substring().*/
                String java = "Java";
                String fulljava = "I like Java!!!";
                int index = fulljava.indexOf(java);
                String sub = fulljava.substring(index, index + java.length());
                System.out.println(sub);
            }

            default -> System.out.println("Нет такого пункта меню. Попробуйте еще раз.");
        }

    }
}
