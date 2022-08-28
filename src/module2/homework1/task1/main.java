package module2.homework1.task1;
import module2.homework1.task1.animals.*;
import module2.homework1.task1.skills.Bitable;
import module2.homework1.task1.skills.Flyable;
import module2.homework1.task1.skills.Swimable;

public class main {
    public static void main(String[] args) {
        //Задача №1
        //Создать интерфейсы flyable (метод void fly()), swimable (метод void swim), bitable (метод void bite)
        //Создать класс Zoo, который может содержать в себе 3-х вида животных
        //1. Животное плавающее
        //2. Животное летающее
        //3. Животное кусающее
        //В классе Zoo будут методы получения и замены этих животных. Получить мы должны конкретные классы,
        //а не интерфейсы.
        //Зоопарк имеет методы - void feedFlyable(),void feedSwimable(),void feedBitable(). Логика внутри метода:
        //Печать на экран "летающее животное ест", вызов у животного метода fly() и тд.
        //Создать 6 классов животных - 2 класса плавающих, 2 класса летающих, 2 класса кусающих.
        //Создать по одному экземпляру на каждый класс.
        //Создать 2 экземпляра зоопарка и распределить животных по зоопаркам.
        //Никаких проверок if instanceof быть не должно, и внутри Zoo будут лежать Generics, а не интерфейсы.

        Bird bird = new Bird();
        Dolphin dolphin = new Dolphin();
        Duck duck = new Duck();
        Fish fish = new Fish();
        Lion lion = new Lion();
        Tiger tiger = new Tiger();

        Zoo<Bitable, Swimable, Flyable> zoo1 = new Zoo<>(tiger, dolphin, bird);
        Zoo<Bitable, Swimable, Flyable> zoo2 = new Zoo<>(lion, fish, duck);

        zoo1.feedBitable();
        zoo2.feedFlyable();

    }
}
