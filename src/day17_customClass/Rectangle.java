package day17_customClass;

public class Rectangle {

    public int length;
    public int width;

    public void setInfo(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public double area(double length, double width){
        double area=length*width;
        return area;
    }

    public double perimeter(double length, double width){
        double perimeter=(length+width)*2;
        return perimeter;
    }

    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ",area="+'}';
    }
}
