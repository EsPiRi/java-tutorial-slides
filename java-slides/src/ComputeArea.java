import java.util.Scanner;

public class ComputeArea {
    public static void main(String[] args) {
        double radius;
        double area;
        Scanner input = new Scanner(System.in);


        System.out.println("Enter a radius: ");
        radius = input.nextDouble();
        area = radius * radius * 3.14159;

        System.out.println("Radius: " + radius + " Area: " + area);
    }
}
