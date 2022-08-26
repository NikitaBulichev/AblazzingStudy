package module2.homework1.task1.animals;

import module2.homework1.task1.skills.Bitable;

public class Tiger implements Bitable {
    @Override
    public void bite() {
        System.out.println("Тигр кусает");
    }
}
