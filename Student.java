public class Student extends Person {
    private String program;
    private int year;

    public Student(String name, String address, String program, int year) {
        super(name, address);
        this.program = program;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Student Name: " + name + "\n" +
               "Student Address: " + address + "\n" +
               "Student Program: " + program + "\n" +
               "Student Year: " + year + "\n\n" +
               super.toString() + " I am " + year + " year of " + program + ".";
    }
}
