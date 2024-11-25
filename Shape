abstract class Shape {
    protected String color;
    protected Boolean filled; 
 
    // Constructor
    public Shape(String color, Boolean filled) {
        this.color = color;
        this.filled = filled;
    }
 
    // Setters
    public void setColor(String color) {
        this.color = color;
    }
 
    public void setFilled(Boolean filled) {
        this.filled = filled;
    }
 public String getColor() {
        return color;
    }
 
    public Boolean isFilled() {
        return filled;
    }
 
    
    abstract Double getArea();
 
    abstract Double getPerimeter();
 
    @Override
    public String toString() {
        return "Shape color = " + color + ", filled = " + (filled ? "filled" : "not filled") + ".";
    }
}
 
