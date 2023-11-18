
import java.util.ArrayList;
import java.util.List;

class person implements Nameable {
    String name = "unknown";
    int age;
    int id;
    boolean parent_permission = true;

    public person(int id, String name, boolean parent_permission, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.parent_permission = parent_permission;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    private boolean of_age(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public boolean canUseServices() {
        if (age >= 18 || parent_permission) ;
        {
            return true;
        }
    }

    public String getCorrectName() {
        return name;
    }

    private List<Rental> rentals;

    public person(String name, int age, boolean parent_permission) {
        this.name = name;
        this.rentals = new ArrayList<>();
    }
    public List<Rental> getRentals() {
        return rentals;
    }

    public void addRental(Rental rental) {
    }

    @Override
    public String correct_name() {
        return null;
    }
}