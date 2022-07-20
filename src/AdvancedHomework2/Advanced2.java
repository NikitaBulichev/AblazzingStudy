package AdvancedHomework2;

public class Advanced2 {

    public static void main(String[] args) {


        // Задание №1: Написать цикл, который будет прибавлять число к result до тех пор,
        // пока не получиться больше 1_000_000.
        // Дано:
        double increment = 0.01123;
        double result = 0;
        // Вывести на экран, количество итераций, которое потребовалось, чтобы дойти до миллиона.
        // Если число отрицательное, то сразу заканчиваем цикл, ничего не выводя.
        // Внимание: число может измениться, и не должно приводить к изменению вашего кода.
        // РЕШЕНИЕ

        int count = 0;
        if (result < 0) {
        } else {
            while (result < 1000000) {
                count++;
                result = result + increment;
            }
            System.out.println(count);
        }
    }
}