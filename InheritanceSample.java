public class InheritanceSample
{
	public static void main(String[] args) {
	 Student student1 = new Student();
	 student1.setId(1234);
	 student1.setname("Student_1");
 
	 System.out.println("Student Id: " + student1.getId());
	 	 System.out.println("Student Id: " + student1.getname());
 
	 Book book1 = new Book();
	 book1.setbooknumber(1);
	 book1.setTitle("Mga Ibong Mandaragit");
	 book1.setname("Amado Hernandez");
	 book1.setprice( 480.00f);
 
	 System.out.println("Book number: " + book1.getBookNumber());
	 	 System.out.println("Book Title: " + book1.getTitle());
	 	 System.out.println("Author: " + book1.getAuthor());
	 	 	 	 System.out.println("Book Price: " + book1.getPrice());
	}
}
 class Student{
    private int Student_Id;
    private String Name;
 
    public void setId(int s_id){
        this.Student_Id = s_id;
    }
    public void setname(String s_name){
        this.Name = s_name;
    }
    public int getId(){
        return Student_Id;
    }
    public String getname(){
        return Name;
    }
}
 class Book{
    int book_number;
    String title, author;
    float price;
 
      public void setbooknumber(int  b_number){
        this.book_number = b_number;
    }
    public void setTitle(String s_title){
        this.title = s_title;
    }
    public void setname(String s_author){
        this.author = s_author;
    }
    public void setprice(float p_price){
        this.price = p_price;
    }
    public int getBookNumber(){
        return book_number;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public float getPrice(){
        return price;
    }
 
 
}