package AdvancedHomework2;

public class Worker {

    private String name;
    private int count = 0;  // Заслуги конкретного рабочего по порче водки

    private static int countAll = 0; // Заслуги отдела по порче водки

    public Worker(String name) {
        this.name = name;
    }

    public Worker(int count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    private void setCount(int count) {
        this.count = count;
    }

    public static int getCountAll() {
        return countAll;
    }

    private static void setCountAll(int countAll) {
        Worker.countAll = countAll;
    }
    public void takeCargo(){  // Берет водку со склада и работает работу
        Stock.cargoOut();
        count++;
        countAll++;
        System.out.println("Ура я испортил водку!!");
    }
}
