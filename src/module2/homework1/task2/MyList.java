package module2.homework1.task2;

public class MyList < T extends Object> {
    T[] objects = (T[]) new Object[3];
    int size = 0;

    public void addToArray(T obj) {
        if (size < objects.length) {
            objects[size] = obj;
            size++;
        } else {
            increase();
            this.addToArray(obj);
        }
    }

    private void increase() {
        T[] obj = (T[]) new Object[objects.length * 2];
        for (int count = 0; count < objects.length; count++) {
            obj[count] = objects[count];
        }
        objects = obj;
    }

    public void check() {
        for (T obj : objects) {
            System.out.println(obj);
        }
    }
}
