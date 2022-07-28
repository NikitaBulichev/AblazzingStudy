package AdvancedHomework2;

public class Stock {

  public static int vodka = 0; // Водки на складе

    public int getVodka() {
        return vodka;
    }

    public void setVodka(int vodka) {
        this.vodka = vodka;
    }

    public Stock(int vodka) {
        this.vodka = vodka;
    }
    public static void cargoOut(){  // Рабочий забрал водку
        vodka--;
    }

    public static void cargoIn(){ // Положить 100 водки на склад
        vodka += 100;
    }
}
