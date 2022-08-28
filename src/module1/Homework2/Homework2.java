package module1.Homework2;

public class Homework2 {

    public static void main(String[] args) {

        // Домашка
        // Базовый уровень
        // Задание №1 - Написать цикл, который выводит через пробел 100 чисел с приставкой "a".
        // Ожидаемый результат: 1а 2а 3а .. 100а
        //
        // РЕШЕНИЕ

        for (int i = 1; i < 101; i++) {
            System.out.print(i + "a ");
        }


        // Задание №2
        // Дано:
        int ageChildren = 20;
        // Задача: Написать условную конструкцию, которая в зависимости от возраста ребенка, отправляет его в учебное заведение
        // если ребенку до 6 лет то в сад, если до 11 лет в младшую школу, если до 17 лет в среднюю школу, иначе в университет
        // Отправляет - имеется в виду, печатает на экран: "пошел с сад", "пошел в младшую школу" и т.д.
        // Проверьте работоспособность условий, через изменение значения переменной.
        //
        // РЕШЕНИЕ

        if (ageChildren < 7){

            System.out.println("\n" + "Пошел в сад");

        } else if (ageChildren < 11){

            System.out.println("\n" + "Пошел в младшую школу");

        } else if (ageChildren < 17) {

            System.out.println("\n" + "Пошел в среднюю школу");

        } else System.out.println("\n" + "Пошел в университет");


        // Задание №3
        // Дано:
        boolean chicken = false; // Курица
        boolean vegetables = false; // Овощи
        boolean sour = false;  // Соус
        boolean toast = true; // Гренки
        boolean sausage = false; // Колбаса
        boolean eggs = true;  // Яйца
        // Задача: Повара попросили сделать салат.
        // Если у повара есть все ингредиенты для "Цезаря" (курица, овощи, соус и гренки), то лучше сделать "Цезарь".
        // Если для "Цезаря" ингредиентов не нашлось, то сделать Оливье (овощи, колбаса или курица, яйца).
        // Если и для Оливье не нашлось ингредиентов, то сделать Овощной салат (нужны только овощи).
        // Если ингредиентов нет, то повар объявляет: У меня ничего нет
        // Написать набор условий, приготовления салатов, по приоритету (от Цезаря к овощному). Либо объявить о невозможности сделать салат.
        // Ожидаемый результат: вывод на экран сделанного салата или объявление о том, что ничего нет.
        // Проверьте работоспособность условий, через изменение значения переменных.
        // РЕШЕНИЕ

        if (chicken && vegetables && sour && toast){

            System.out.println("Будем есть Цезарь");

        } else if (vegetables && (chicken || sausage) && eggs) {

            System.out.println("Будет Оливье");

        } else if (vegetables) {

            System.out.println("Будет Овощной");

        } else System.out.println("Лижи ложку");


        // Задание №4
        // Создать два класса, которые описывают какое либо животное (имеют два атрибута).
        // Написать к ним конструктор, сеттеры, геттеры.
        // Создать экземпляры этих двух животных.

        // РЕШЕНИЕ

        Cat mrCat = new Cat("White", 2);

        Dog mrDog = new Dog("Green", 7);
    }
}