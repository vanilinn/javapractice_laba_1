class Shape {
    protected double area;
    protected String color;
    protected boolean filled;
    protected String border;
    protected String borderColor;

    public Shape(double area, String color, boolean filled, String border, String borderColor) {
        this.area = area;
        this.color = color;
        this.filled = filled;
        this.border = border;
        this.borderColor = borderColor;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public String getColor() {
        return color;
    }
}