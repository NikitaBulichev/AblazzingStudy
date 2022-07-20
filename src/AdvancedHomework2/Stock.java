package AdvancedHomework2;

public class Stock {

   static int vodka = 100; // Водки на складе

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
}
