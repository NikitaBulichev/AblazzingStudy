package module1.Homework4.Advanced2;

public class Watch {
    private final boolean isBroken;

    public Watch(boolean isBroken) {
        this.isBroken = isBroken;
    }
    public void tick () throws WatchBroken {
        if (isBroken) {
            throw new WatchBroken("Часы сломались");
        }
        System.out.println("Часы тикают");
    }
}
