
class CapitalizeDecorator extends Decorator {
    public CapitalizeDecorator(person nameable) {
        super(nameable);
    }

    public String correct_name() {
        String name = nameable.correct_name();
        return name.toUpperCase();
    }
}
