package AdvancedHomework2;

import java.util.Arrays;

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

        // Задание №2: Дан массив единиц, произвольной длины. Создать цикл, который заменяет каждый четный элемент на 0;
        // Например, дано: [1,1,1,1,1]
        // Ожидаемый результат: [0,1,0,1,0]
        // Подсказка: прочитай про операнд "%".
        
        int[] array = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0){
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}