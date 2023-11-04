

public class Person {
    String ID;
    String Name="unknown";
    int age;
    boolean parent_permission=true;

    public Person(String name, int age, boolean parent_permission) {

        this.Name = name;
        this.age = age;
        this.parent_permission = parent_permission;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private boolean checkage() {
        if (age >= 18)
            return true;
        else {
            return false;
        }
    }

    public boolean serviceuses() {
        if (checkage() || parent_permission)
            return true;
        else
            return false;
    }
}
