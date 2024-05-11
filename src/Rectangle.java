class Rectangle extends Shape {
    protected double width;
    protected double height;

    public Rectangle(double width, double height, double area, String color, boolean filled, String border, String borderColor) {
        super(area, color, filled, border, borderColor);
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }
    public String getBorder() {
        return border;
    }

    public double getWidth() {

        return width;
    }

    public double getHeight() {

        return height;
    }
}