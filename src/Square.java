class Square extends Rectangle {
    protected boolean isRight;
    protected boolean isSquared;

    public Square(double side, double area, String color, boolean filled, String border, boolean isRight, String borderColor, boolean isSquared, double width, double height) {
        super(width, height, area, color, filled, border, borderColor);
        this.isRight = isRight;
        this.isSquared = isSquared;
    }

    public boolean isGreen() {
        return this.color.equals("Green");
    }

    public boolean isRed() {
        return this.color.equals("Red");
    }
}