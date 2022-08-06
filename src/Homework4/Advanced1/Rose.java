package Homework4.Advanced1;

public class Rose implements Smelling, Blooming {
    @Override
    public void bloom() {
        System.out.println("роза: умеет цвести");
    }

    @Override
    public void smell() {
        System.out.println("роза: умеет пахнуть");
    }
}
