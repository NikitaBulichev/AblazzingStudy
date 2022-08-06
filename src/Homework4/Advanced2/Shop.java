package Homework4.Advanced2;

public class Shop {
    private final Worker[] ShopsWorker;

    public Shop(Worker[] shopsWorker) {
        ShopsWorker = shopsWorker;
    }

    public Worker[] getShopsWorker() {
        return ShopsWorker;
    }
}
