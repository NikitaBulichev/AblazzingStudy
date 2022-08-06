package Homework4.Base;

public class Airplane implements Flying {

    int countPassengers = 0;

    public Airplane(int countPassengers) {
        this.countPassengers = countPassengers;
    }

    @Override
    public void fly() throws FlyException {
        if (countPassengers <= 0 ) {
            throw new FlyException("пассажиров в самолете меньше 0");
        }
        System.out.println("Самолет летит");
    }
}
