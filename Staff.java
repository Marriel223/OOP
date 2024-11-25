public class Staff extends Person{
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
