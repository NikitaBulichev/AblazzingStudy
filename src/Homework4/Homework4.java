package Homework4;

import Homework4.Advanced1.*;
import Homework4.Advanced2.*;
import Homework4.Base.*;

public class Homework4 {
    public static void main(String[] args) {

        //Базовый уровень
        //Задача №1
        //1. Создать два класса, которые умеют летать: самолет и утка. Атрибут утки: isInjured (ранен),
        // атрибут самолета: countPassengers.
        //2. Создать интерфейс, который объединяет эти два класса.
        //3. Имплементировать его в двух классах
        //4. Реализовать метод летать:
        // Для утки:
        // Метод летать будет выкидывать ошибку FlyException (создать такой класс), если утка подстрелена,
        // иначе печатать на экран "утка летит"
        // Для самолета:
        // Метод летать будет выкидывать ошибку FlyException, если количество пассажиров меньше нуля.
        // Иначе печать "самолет летит"
        //5. Создать 1 утку не раненую, 1 утку раненую, 1 самолет с 10 пассажирами, 1 самолет с -1 пассажиром.
        //6. Положить их всех в массив
        //7. Перебрать массив и вызвать у каждого элемента метод летать
        // Перехватить исключения: вывести на экран message ошибки
        // Ожидание:
        // утка летит
        // Ошибка: утка ранена
        // самолет летит
        // Ошибка: пассажиров в самолете меньше 0

        // РЕШЕНИЕ

        Flying[] flyings = {new Duck(false), new Duck(true), new Airplane(10), new Airplane(-1)};

        for (Flying fly: flyings) {
            try {
                fly.fly();
            } catch (FlyException e) {
                System.out.println("Ошибка " + e.getMessage());
            }
        }
        //Продвинутый уровень
        //Задача №1
        //1. Создать следующую структуру из классов и интерфейсов:
        // дерево -> ель (имеет шишки, умеет пахнуть)
        // дерево -> сосна (имеет шишки, умеет пахнуть)
        // растение -> роза (умеет цвести, умеет пахнуть)
        // растение -> папоротник (умеет цвести)
        // Создать у каждого класса по объекту, распределить по массивам интерфейсов
        // И у каждого массива вызвать характерный метод
        //Ожидание:
        // сосна : умеет пахнуть
        // ель : умееть пахнуть
        // роза: умееть пахнуть
        // роза: умеет цвести
        // папоротник: умеет цвести

        // РЕШЕНИЕ

        Blooming[] bloomings = {new Rose(), new Fern()};
        Smelling[] smellings = {new Rose(), new Pine(true), new Spruce(true)};

        for (Blooming blooming: bloomings) {

            blooming.bloom();
        }

        for (Smelling smelling: smellings ) {

            smelling.smell();
        }


        //Задача №2
        //2. Создать следующую структуру из классов и интерфейсов
        // магазин (обладает работниками)
        // работник (обладает часами - (часы одни))
        // часы (умеют тикать, если сломаны выкидывают ошибку WatchBrokenError)
        // Бренд (обладает массивом магазинов)
        // Создать бренд, положить в него два магазина, в каждом магазине будет по работнику,
        // у каждого работника по часам. У одного работника часы сломаны, у второго нет.
        // После создания бренда, вытащить из него все часы и вызвать у всех часов метод тикать,
        // обработать ошибку сломанных часов.
        // Ожидание вывода на экран:
        // Часы тикают
        // Ошибка: Часы сломались.

        //РЕШЕНИЕ

        Worker worker1 = new Worker (new Watch(true));
        Worker worker2 = new Worker (new Watch(false));
        Shop shop1 = new Shop (new Worker[]{worker1});
        Shop shop2 = new Shop (new Worker[]{worker2});
        Brand brand = new Brand (new Shop[]{shop1, shop2});
        for (Shop shop : brand.getBrandsShop()) {
            for (Worker worker : shop.getShopsWorker()) {
                try {
                    worker.getWorkerHasWatch().tick();
                } catch (WatchBroken e) {
                    System.out.println("Ошибка: " + e.getError());
                }
            }
        }

    }
}
