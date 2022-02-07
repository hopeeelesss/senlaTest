package Task5;

public class Subject {
    int capacity;
    int value;

    public Subject(int capacity, int value) {
        this.capacity = capacity;
        this.value = value;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getValue() {
        return value;
    }
}
