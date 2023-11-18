
class Student extends person {
    private String classroom;
    public Student(boolean parent_permission, int age, String name, int id) {
        super(age, name, parent_permission, id);

        this.classroom = classroom;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
    }
}