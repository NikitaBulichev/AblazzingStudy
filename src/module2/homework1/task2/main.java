package module2.homework1.task2;

public class main {
    public static void main(String[] args) {

        //Задача №2
        //Создать класс MyList с атрибутами T[] objects, int size. T - generics.
        //Массив T[] будет создаваться при создании экземпляра класса MyList с размерностью 3.
        //Создать метод add. Он будет добавлять элемент в массив object. Если в массиве уже 3 элемента есть, то нужно:
        //1.Создать новый массив T[] с размерностью в два раза больше предыдущей.
        //2.Скопировать со старого массива все значения в новый
        //3.Присвоить экземпляру MyList новый массив.

        MyList<String> myList = new MyList<>();

        myList.addToArray("Один");
        myList.addToArray("Два");
        myList.addToArray("Три");
        myList.addToArray("Четыре");
        myList.addToArray("Пять");
        myList.addToArray("Шесть");

        myList.check();
    }
}
