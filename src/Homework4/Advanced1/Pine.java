package Homework4.Advanced1;

public class Pine extends Trees implements Smelling {
    @Override
    public void smell() {
        System.out.println("сосна: умеет пахнуть");
    }
}
