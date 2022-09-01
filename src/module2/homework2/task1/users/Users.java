package module2.homework2.task1.users;

import java.util.List;

public class Users {

    private int count = 0;
    private List<Integer> listOfNumbers;

    public Users(List<Integer> listOfNumbers) {
        this.listOfNumbers = listOfNumbers;
    }

    public Users(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<Integer> getListOfNumbers() {
        return listOfNumbers;
    }

    public void setListOfNumbers(List<Integer> listOfNumbers) {
        this.listOfNumbers = listOfNumbers;
    }
}
