
public class Teacher extends Person {
    String specialization;

    public Teacher(String name, int age, boolean parent_permission, String specialization) {
        super(name, age, parent_permission);
        this.specialization = specialization;
    }

    @Override
    public boolean serviceuses() {
        return true;
    }
}
