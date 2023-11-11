interface Nameable {
    String correct_name();
}

// Person class implementing Nameable
class Person implements Nameable {
    private String Name = "unknown";

    public Person(String name) {
        this.Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String correct_name() {
        return Name;
    }
}


