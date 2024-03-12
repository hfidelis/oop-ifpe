package problem_B_C;

public class Door {
    private double height;
    private String color;

    public Door() {}

    public Door(double height, String color) {
        this.height = height;
        this.color = color;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
