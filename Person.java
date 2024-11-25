public class Person {
    protected String name;
    protected String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String toString() {
        return "Hello I am " + name + " and I lived in " + address + ".";
    }
}
