package module2.homework1.task1.animals;

import module2.homework1.task1.skills.Flyable;

public class Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Птица летит");
    }
}
