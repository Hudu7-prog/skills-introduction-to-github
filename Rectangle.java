import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) throws Exception {
        try (Scanner input = new Scanner(System.in)) { 

            System.out.print("Enter the length of the rectangle: ");
            double length = input.nextDouble();
            
            System.out.print("Eter the bredth of the rectangle: ");
            double bredth = input.nextDouble();
            
            double area = length * bredth;
            
            System.out.println("The area of the rectangle is: " + area);
            input.close();
        }
        
    }
}
