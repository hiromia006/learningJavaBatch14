package class7;

public class GenericWithWildCard <N extends Number> {
    private N value;

    public GenericWithWildCard(N value) {
        this.value = value;
    }

    public N getValue() {
        return value;
    }
}
