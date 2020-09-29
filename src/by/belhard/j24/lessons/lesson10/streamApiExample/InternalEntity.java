package by.belhard.j24.lessons.lesson10.streamApiExample;

public class InternalEntity {

    private int value;

    public InternalEntity(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "InternalEntity{" +
                "value=" + value +
                '}';
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
