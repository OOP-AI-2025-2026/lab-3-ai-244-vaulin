package org.example.task2;

public class Box {
    private double width;
    private double height;
    private double length;

    public Box(double width, double height, double length)  {
        checkValidInputData(width, height, length);

        this.width = width;
        this.height = height;
        this.length = length;
    }

    public double calcLateralSurfaceArea() {
        return 2 * this.length * this.height + 2 * this.width * this.height;
    }

    public double calcSurfaceArea() {
        return 2 * this.length * this.width + this.calcLateralSurfaceArea();
    }

    public double calcVolume() {
        return this.width * this.height * this.length;
    }

    private void checkValidInputData(double width, double height, double length) {
        if (width <= 0 || height <= 0 || length <= 0) {
            throw new IllegalArgumentException("Size of Box must be bigger than zero");
        }
    }
}
