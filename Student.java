class Student extends Person {
    private String classroom;

    public Student(String name, String classroom) {
        super(name);
        this.classroom = classroom;
    }

    public String getClassroom() {
        return classroom;
    }
}
