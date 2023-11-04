

public class  Student  extends Person{
    String classroom;

    public Student(String name, int age, boolean parent_permission, String classroom) {
        super(name, age, parent_permission);
        this.classroom = classroom;
    }

}
