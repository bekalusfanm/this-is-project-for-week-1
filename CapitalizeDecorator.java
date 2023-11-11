class CapitalizeDecorator extends Decorator {
    public CapitalizeDecorator(Nameable nameable) {
        super(nameable);
    }

    public String correct_name() {
        String name = nameable.correct_name();
        return name.toUpperCase();
    }
}
