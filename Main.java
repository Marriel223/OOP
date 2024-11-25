public class Main {
	public static void main(String[] args) {

		Circle circle = new Circle(7.0, "Green", true);
		System.out.println(circle.toString());
		System.out.println("Area: " + circle.getArea());
		System.out.println("Perimeter: " + circle.getPerimeter());
        System.out.println();

		Rectangle rectangle = new Rectangle(4.0, 7.0, "Blue", false);
		System.out.println(rectangle.toString());
		System.out.println("Area: " + rectangle.getArea());
		System.out.println("Perimeter: " + rectangle.getPerimeter());
        System.out.println();

		Square square = new Square(5.0, "Red", true);
		System.out.println(square.toString());
		System.out.println("Area: " + square.getArea());
		System.out.println("Perimeter: " + square.getPerimeter());
	}
}
