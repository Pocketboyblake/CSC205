package ProjectOne;
import java.awt.*;
import java.lang.Math;

class Point{

    // Variables
    private double x,y;

    public Point(){
        x=y=0;
    }

    public Point(double x,double y){
        this.x = x;
        this.y = y;
    }

    // Distance between two points formula
    public double distance(Point s){
        return Math.sqrt( Math.pow((this.x-s.getX()),2)+Math.pow((this.y-s.getY()),2));
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setPoint(double new_x, double new_y){
        this.x = new_x;
        this.y = new_y;
    }

    public void shiftX(double dist){
        this.x+=dist;
    }

    public void shiftY(double dist){
        this.y+=dist;
    }
    // Used rotation formula from assignment
    public void rotate(double radian){
        this.x = (x*(Math.cos(radian)))-(y*(Math.sin(radian)));
        this.y = (x*(Math.sin(radian)))+(y*(Math.cos(radian)));

    }

    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';

    }
}

/**
 * Driver class used to test Point implementation for Project 1.
 *
 * @author Ray Hedgecock, Blake Driggs
 * @version 1.2
 */

public class Project1 {

    public static void main(String[] args) {


        System.out.println("Project 1 : Point Tester\n");



            Point a = new Point(3.0, 1.0);
            Point b = new Point();
            b.setPoint(6.0, 5.0);

            System.out.println("Point 1: " + a);
            System.out.println("Point 2: " + b);

            System.out.println("\nDistance: " + a.distance(b));

            double rotation = Math.PI / 2.0;
            a.rotate(rotation);
            System.out.println("\nRotated a " + rotation + ": " + a);

            Point b2 = new Point(b.getX(), b.getY());
            b.shiftX(4);
            b.shiftY(-2);
            System.out.println("Shifted b " + b.distance(b2) + " away from original position: " + b);


    }
}
