package Assignments;

public class circle implements printable{

    int radius;
    int diameter;
    String color;

    public circle() {
    }

    public circle(int radius, int diameter, String color) {
        this.radius = radius;
        this.diameter = diameter;
        this.color = color;
    }

    @Override
    public void print() {
        System.out.println("Circle class print method"); 
        System.out.println(this.radius+" "+this.diameter+" "+this.color);       
    }
    
}
