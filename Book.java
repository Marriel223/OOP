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
