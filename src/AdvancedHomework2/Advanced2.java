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
        // РЕШЕНИЕ

        int[] array = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0){
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));

        // Задание №3:
        // Дано:
        boolean hasFuel = true;
        boolean hasElectricsProblem = false;
        boolean hasMotorProblem = false;
        boolean hasTransmissionProblem = false;
        boolean hasWheelsProblem = false;
        int bill = 0;
        int sale =0;
        boolean sale10 = (hasElectricsProblem && hasMotorProblem)
                || (hasElectricsProblem && hasTransmissionProblem)
                || (hasElectricsProblem && hasWheelsProblem)
                || (hasMotorProblem && hasTransmissionProblem)
                || (hasMotorProblem && hasWheelsProblem)
                || (hasTransmissionProblem && hasWheelsProblem);
        boolean sale20 = hasTransmissionProblem && (hasMotorProblem || hasElectricsProblem);
        // В автосервис приехала сломанная машина. Механики находят неисправность следующим способом:
        // Если у машины нет бензина и ничего не сломано, то отдают машину владельцу и берут 1000 рублей за консультацию.
        // Если у машины проблема с двигателем, то чинят и берут 10 000.
        // Если у машины проблема с электрикой, то чинят и берут 5000.
        // Если у машины проблема с коробкой передач, то чинят и берут 4000.
        // Если у машины проблема с колесами, то чинят и берут 2000.
        // Если две детали сломаны, то на общий счет идет скидка 10%.
        // Если сломана коробка передач, и электрика или двигатель, то на общий счет скидка 20%.
        // Если нет бензина и что-то сломано, то за консультацию денег не берут.
        // Ситуации, что бензин есть и ничего не сломано - быть не может.
        // Ожидаемый результат: выведен на экран счет клиенту.
        // РЕШЕНИЕ


        if (hasMotorProblem) {
            bill = bill + 10000;
        }
        if (hasElectricsProblem) {
            bill = bill + 5000;
        }
        if (hasTransmissionProblem){
            bill = bill + 4000;
        }
        if (hasWheelsProblem){
            bill =bill + 2000;
        }
        if (sale10) {
            sale = 10;
        }
        if (sale20) {
            sale = 20;
        }
        if (!hasFuel && ( !hasElectricsProblem && !hasMotorProblem && !hasTransmissionProblem && !hasWheelsProblem)) {
            bill = 1000;
        } else if (!hasFuel && ( hasElectricsProblem || hasMotorProblem || hasTransmissionProblem || hasWheelsProblem)) {
            bill = 0;
            System.out.println("Бесплатно");
        }
            bill = bill - (bill / 100 * sale);

        if (bill > 0) {
            System.out.println(bill);
        }
    }
}