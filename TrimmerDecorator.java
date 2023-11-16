class TrimmerDecorator extends Decorator {
    public TrimmerDecorator(Nameable nameable) {
        super(nameable);
    }

    public String correct_name() {
        String name = nameable.correct_name();

        if (name.length() > 10) {
            return name.substring(0, 10);
        } else {
            return name;
        }
    }
}
