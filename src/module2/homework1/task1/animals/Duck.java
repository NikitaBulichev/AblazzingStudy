package module2.homework1.task1.animals;

import module2.homework1.task1.skills.Flyable;

public class Duck implements Flyable {
    @Override
    public void fly() {
        System.out.println("Утка летит");
    }
}
