package Homework4.Advanced1;

public class Spruce extends Trees implements Smelling {
    @Override
    public void smell() {
        System.out.println("ель: умеет пахнуть");
    }
}
