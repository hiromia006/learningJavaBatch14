package class7;

public class GenericWithWildCard <T extends Number> {
    private T value;

    public GenericWithWildCard(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
