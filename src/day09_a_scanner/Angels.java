package day09_a_scanner;

import java.util.Scanner;

public class Angels {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        boolean isTriangle;
        boolean isCircle;
        System.out.println("Enter 3 angles (in decimals): ");
        double angle1 = key.nextDouble();
        double angle2 = key.nextDouble();
        double angle3 = key.nextDouble();
        isTriangle = (angle1 + angle2 + angle3) == 180;
        isCircle = (angle1 + angle2 + angle3) == 360;
        System.out.println("It is a triangle: " + isTriangle);
        System.out.println("It is a circle: " + isCircle);
    }
}