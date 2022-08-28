package module1.Homework4.Advanced1;

public class Pine extends Trees implements Smelling {

    public Pine(boolean hasCones) {
        super(hasCones);
    }

    @Override
    public void smell() {
        System.out.println("сосна: умеет пахнуть");
    }
}
