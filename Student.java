public class Student extends Person{
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
