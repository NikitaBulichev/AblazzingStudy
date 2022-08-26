package module2.homework1.task1.animals;

import module2.homework1.task1.skills.Swimable;

public class Dolphin implements Swimable {

    @Override
    public void swim() {
        System.out.println("Дельфин плывет");
    }
}
