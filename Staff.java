public class Staff extends Person {
    private String position;

    public Staff(String name, String address, String position) {
        super(name, address);
        this.position = position;
    }

    @Override
    public String toString() {
        return "Staff Name: " + name + "\n" +
               "Staff Address: " + address + "\n" +
               "Staff Position: " + position + "\n\n" +
               super.toString() + " I am a " + position + ".";
    }
}
