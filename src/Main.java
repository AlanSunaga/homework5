//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Задача 1
        //С помощью цикла for выведите в консоль все целые числа от 1 до 10.

        System.out.println("Задача 1");
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
        System.out.println();

        //Задача 2
        //С помощью цикла for выведите в консоль все целые числа от 10 до 1.

        System.out.println("Задача 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println();

        //Задача 3
        //Выведите в консоль все четные числа от 0 до 17.

        System.out.println("Задача 3");
        for (int i = 0; i < 17; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }

        }
        System.out.println();

        //Задача 4
        //Выведите в консоль все числа от 10 до −10 от бо́льшего числа к меньшему.

        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        System.out.println();

        //Задача 5
        //Напишите программу, которая выводит в консоль все високосные года, начиная с 1904 года до 2096.
        // В консоль результат должен выводиться в формате: «… год является високосным».

        System.out.println("Задача 5");
        for (int i = 1904; i <= 2096; i++) {
            if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
                System.out.println(i + " год является високосным.");
            }
        }
        System.out.println();

        //Задача 6
        //Напишите программу, которая выводит в консоль последовательность чисел:
        //
        //7 14 21 28 35 42 49 56 63 70 77 84 91 98

        System.out.println("Задача 6");
        for (int i = 7; i <= 98; i += 7) {
            System.out.println(i);
        }
        System.out.println();

        //Задача 7
        //Напишите программу, которая выводит в консоль последовательность чисел:
        //
        //1 2 4 8 16 32 64 128 256 512

        System.out.println("Задача 7");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.println(i);
        }
        System.out.println();

        //Задача 8
        //Посчитайте с помощью цикла for сумму годовых накоплений, если каждый месяц вы будете откладывать по 29 000 рублей «в банку».
        //
        //Выведите сумму накоплений за каждый месяц в консоль в формате: «Месяц …, сумма накоплений равна … рублей».

        System.out.println("Задача 8");
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total += 29000;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println();

        //Задача 9
        //Перепишите решение задачи выше при условии, что деньги вы откладывать будете не «в банку», а в банк под проценты — 12% годовых.
        // Выведите сумму накоплений за каждый месяц в консоль в формате: «Месяц …, сумма накоплений равна … рублей».

        System.out.println("Задача 9");
        int salary = 29000;
        double totalM = 0;
        double percent = 12;
        double annual = (percent / 100) / 12;
        for (int i = 1; i <= 12; i++) {
            totalM += salary;
            totalM *= 1 + annual;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + (int) totalM + " рублей");
        }
        System.out.println();

        //Задача 10
        //Напишите программу, которая выводит в консоль таблицу умножения на 2:
        //
        //2*1=2
        //
        //2*2=4
        //
        //2*3=6
        //
        //2*4=8
        //
        //2*5=10
        //
        //2*6=12
        //
        //2*7=14
        //
        //2*8=16
        //
        //2*9=18
        //
        //2*10=20

        System.out.println("Задача 10");
        int num = 2;
        int result;
        for (int i = 1; i <= 10; i++) {
            result = num * i;
            System.out.println(num + "*" + i + "=" + result);
        }
    }
}