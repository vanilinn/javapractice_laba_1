public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape(10.0, "Red", true, "Solid", "Blue");
        Rectangle rectangle = new Rectangle(4.0, 6.0, 24.0, "Blue", false, "Dashed", "Green");
        Square square = new Square(5.0, 25.0, "Red", true, "Solid", true, "Red", true, 5.0, 6.0);
        System.out.println("Shape: ");
        System.out.println("Area: " + shape.getBorderColor());
        System.out.println("Color: " + shape.getColor());
        System.out.println("Filled: " + shape.filled);
        System.out.println("border: " + shape.border);
        System.out.println("\n");
        System.out.println("Rectangle:");
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Color: " + rectangle.getColor());
        System.out.println("Filled: " + rectangle.filled);
        System.out.println("Border: " + rectangle.getBorder());
        System.out.println("Height: " + rectangle.getHeight());
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("BorderColor: " + rectangle.getBorderColor());
        System.out.println("\n");
        System.out.println("Square:");
        System.out.println("Area: " + square.getArea());
        System.out.println("Color: " + square.getColor());
        System.out.println("Filled: " + square.filled);
        System.out.println("Border: " + square.getBorder());
        System.out.println("Is Green: " + square.isGreen());
        System.out.println("Is Red: " + square.isRed());

    }
}