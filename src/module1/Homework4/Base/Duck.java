package module1.Homework4.Base;

public class Duck implements Flying {

    private final boolean isInjured;

    public Duck(boolean isInjured) {
        this.isInjured = isInjured;
    }

    @Override
    public void fly() throws FlyException {
        if (isInjured){
            throw new FlyException("Утка ранена");
        }
        System.out.println("Утка летит");
    }
}
