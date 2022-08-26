package module2.homework1.task1;

import module2.homework1.task1.skills.Bitable;
import module2.homework1.task1.skills.Flyable;
import module2.homework1.task1.skills.Swimable;

public class Zoo < T extends Bitable, K extends Swimable, V extends Flyable >{

    T bitable;
    K swimable;
    V flyable;

    public Zoo (){
    }

    public Zoo(T bitable, K swimable, V flyable) {
        this.bitable = bitable;
        this.swimable = swimable;
        this.flyable = flyable;
    }

    public T getBitable() {
        return bitable;
    }

    public void setBitable(T bitable) {
        this.bitable = bitable;
    }

    public K getSwimable() {
        return swimable;
    }

    public void setSwimable(K swimable) {
        this.swimable = swimable;
    }

    public V getFlyable() {
        return flyable;
    }

    public void setFlyable(V flyable) {
        this.flyable = flyable;
    }

    public void feedBitable (){
        System.out.println("Кусающее животное ест");
        bitable.bite();
    }

    public void feedSwimale (){
        System.out.println("Плавающее животное ест");
        swimable.swim();
    }

    public void feedFlyable(){
        System.out.println("Летающее животное ест");
        flyable.fly();
    }
}
