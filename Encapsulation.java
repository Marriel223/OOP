public class Encapsulation
{
	public static void main(String[] args) {
		Student student1 = new Student("Cres", "Brgy. 3, Balayan, Batangas", "BSIT", 2);
		System.out.println("Student Name: " + student1.getName());
	    System.out.println("Student Address: " + student1.getAddress());
	    System.out.println("Student Program: " + student1.getProgram());
		System.out.println("Student Year: " + student1.getYear());
 
		Staff staff1 = new Staff("Eli", "Gumamela, Balayan, Batangas", "Batangas State University", 480.00f );
		System.out.println("Staff Name: " + staff1.getName());
	    System.out.println("Address: " + staff1.getAddress());
		System.out.println("School: " + staff1.getSchool());
		System.out.println("Salary: " + staff1.getSalary());
 
 
 
	}
 
}
class Person{
    protected String name, address;
 
    void setname(String n_name){
        this.name = n_name;
    }
    void setaddress(String n_address){
        this.address = n_address;
    }
    public  String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
 
}
class Student extends Person{
    String program;
    int year;
 
    Student(String name, String address, String program, int year){
    this.name = name;
    this.address = address;
    this.program = program;
    this.year = year;
    }
 
    void setprogram(String n_program){
        this.program = n_program;
    }
    void setyear(int n_year){
        this.year = n_year;
    }
    public  String getProgram(){
        return program;
    }
    public int getYear(){
        return year;
    }
 
}
 class Staff extends Person{
    String school;
    float salary;
 
    Staff(String name, String address, String school, float salary ){
        this.name = name;
        this.address = address;
        this.school = school;
        this.salary = salary;
    }
        void setschool(String s_school){
            this.school = s_school;
        }
        void setsalary(float s_salary){
            this.salary = s_salary;
        }
 
        public String getSchool(){
            return school;
        }
        public float getSalary(){
            return salary;
        }
    }