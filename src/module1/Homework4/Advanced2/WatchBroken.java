package module1.Homework4.Advanced2;

public class WatchBroken extends Exception {
    private final String error;

    public WatchBroken(String error) {
        this.error = error;
    }

    public String getError() {
        return error;
    }
}

