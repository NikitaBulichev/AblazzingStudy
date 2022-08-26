package Homework1;

import jdk.jshell.execution.Util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Homework {

    public static void main(String[] args) {

/**
 * Домашка №1
 */

                //Базовый уровень
                //Задача №1
                //Дано (переменные ниже менять нельзя)
                String hi = "                Hello ";
                String world = " WoRld!";
                char newLine = '\n';
                //Создать из трех переменных единую строку,
                //Привести к правильному виду (Ниже) используя String.trim()
                //затроить (Можно вызвать тольку одну команду System.out.println())
                //
                //Результат вывода на экран:
                //Hello world!
                //Hello world!
                //Hello world!

                // РЕШЕНИЕ

                String newString = hi + world;

                newString = newString.trim();

                newString = newString + newLine;

                String repeatNewtext = newString.repeat(3);

                System.out.println(repeatNewtext);



                //Задача №2
                //Создать переменные с ростом (!в метрах), весом в кило.
                //Произвести расчет индекса массы тела (вес) / (рост * рост) используя переменные, вывести на экран
                //Пример результата вывода на экран:
                //21.0345645

                // РЕШЕНИЕ

                double hight = 1.75;

                int weight = 70;

                double index = weight / (hight * hight);

                System.out.println(index);


                //Задача №3
                //Создать из массива букв a,b,c,d,e, строку,вывести на экран , поменять в массиве 4 букву по счету на h,
                //и снова создать строку, вывести на экран
                //Ожидаемый результат:
                //abcde
                //abche

                // РЕШЕНИЕ

                char [] letters = new char [] {'a','b','c','d','e'};

                String stringFromChar1 = String.valueOf(letters);

                letters[3] = 'h';

                String stringFromChar2 = String.valueOf(letters);

                System.out.println(stringFromChar1 + '\n' + stringFromChar2);


        //Продвинутый уровень
                //Задача №1
                //Произвести преобразование текста "234" в число типа int и прибавить к этому числу длину строки "some_text"

                //РЕШЕНИЕ

                String text = "234";

                String someText = "some_text";

                int convert = Integer.parseInt(text);

                int result = convert + someText.length();

                System.out.println(result);

                //Задача №2
                //Посчитать (a+b)^2 = ?, при a=3, b=5

                //РЕШЕНИЕ

                int a = 3;

                int b = 5;

                int math = (a + b) * (a + b);

                System.out.println(math);

                //Задача №3
                //Создать два массив чисел:
                // 1,2,5,7,10
                // 2,3,2,17,15
                // Создать массив чисел, в котором будут: все числа из этих двух массивов,
                // и результат умножения чисел с одинаковым порядковым номером
                //
                //Ожидаемый результат:
                //1,2,5,7,10,2,3,2,17,15,2,6,10,119,150
                //(первый массив - 1,2,5,7,10), (второй массив - 2,3,2,17,15),
                //(результат перемножения - (1*2), (2*3), (5*2), (7*17), (10*15)

                // РЕШЕНИЕ

                int [] first = new int[] {1, 2, 5, 7, 10};

                int [] second = new int[] {2, 3, 2, 17, 15};

                int [] resultMath = new int[first.length];

                int [] third = IntStream.concat(Arrays.stream(first),Arrays.stream(second)).toArray();


                for (int i = 0; i < first.length; i ++) {

                    resultMath[i] = first[i] * second [i];
                }

                System.out.println (Arrays.toString(third).replaceAll("\\s", "")
                        .replaceAll("\\[|\\]|", "") + Arrays.toString(resultMath)
                        .replaceAll("\\s", "")
                        .replaceAll("\\[|\\]|", ""));

                // РЕШЕНИЕ ЧЕРЕЗ ЦИКЛ

                int [] resultMath1 = new int[15];

                for (int i = 0; i< first.length; i++){

                    resultMath1[i] = first[i];

                    resultMath1[i+5] = second[i];

                    resultMath1[i+10] = first [i] * second[i];

                }

                System.out.println(Arrays.toString(resultMath1));


                //Задача №4

                //В слове "Hello world!" заменить l на r, сделать все буквы заглавными, выбрать первые 8 символов, вывести на экран

                //РЕШЕНИЕ

                String hellowWorld = "Hello world!";

                // System.out.println(hellowWorld.replaceAll("rld!", "").replaceAll("l","r").toUpperCase());

                System.out.println(hellowWorld.substring(0, 8).replaceAll("l","r").toUpperCase());


                //Экспертный уровень
                //Задача №1
                //Создать метод маскирования персональных данных, который:
                //Телефон (до/после маскирования): 79991113344 / 7999***3344
                //Email (до/после маскирования): test@yandex.ru / tes*@******.ru, my_mail@gmail.com / my_mai*@*****.com
                //Фио (до/после маскирования): Иванов Иван Иванович / И****в Иван И.
                //
                //Входящие параметры: String text
                //Возвращаемый результат: String
                //
                //Примеры возможного текста:
                //Входящий стринг <client>(Какие то данные)<data>79991113344;test@yandex.ru;Иванов Иван Иванович</data></client>
                //Вернет - "<client>(Какие то данные)<data>7999***3344;tes*@******.ru;И****в Иван И.</data></client>"
                //<client>(Какие то данные)<data></data></client> - вернет тоже (никаких ошибок)
                //Входящий - <client>(Какие то данные)<data>Иванов Иван Иванович;79991113344</data></client>
                //Вернет - "<client>(Какие то данные)<data>И****в Иван И.;7999***3344</data></client>"

                //Используемые технологии: String.find, String.replaceAll, String.split, String.join, String.contains, String.substring
                //Регулярные выражения, класс StringBuilder



    }
}
