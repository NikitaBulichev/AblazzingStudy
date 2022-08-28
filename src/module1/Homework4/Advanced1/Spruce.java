package module1.Homework4.Advanced1;

public class Spruce extends Trees implements Smelling {
    public Spruce(boolean hasCones) {
        super(hasCones);
    }

    @Override
    public void smell() {
        System.out.println("ель: умеет пахнуть");
    }
}
