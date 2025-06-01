import java.util.Scanner;

public class RetirementEligibility {
    public static void main(String[] args) throws Exception {
        Scanner Scanner = new Scanner(System.in);

        System.out.println("Enter the age of the civil servant: ");
        int age = Scanner.nextInt();

        if (age >= 60) {
            System.out.println("The civil servant is due for retirement. ");
        } else {
            System.out.println("The civil servant is not due for retirement. ");
        }
        Scanner.close();
    }
}