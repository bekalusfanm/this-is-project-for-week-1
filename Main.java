
public class Main {
    public static void main(String[] args) {
        person person = new person(01, "bekalu", true,34);
        System.out.println(person.correct_name());

        CapitalizeDecorator capitalizedPerson = new CapitalizeDecorator(person);
        System.out.println(capitalizedPerson.correct_name());

        TrimmerDecorator capitalizedTrimmedPerson = new TrimmerDecorator(capitalizedPerson);
        System.out.println(capitalizedTrimmedPerson.correct_name());
    }
}