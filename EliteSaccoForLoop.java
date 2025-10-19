import java.util.Scanner;

public class EliteSaccoForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of SACCO members: ");
        int members = input.nextInt();
        double rate = 0.05; // 5% interest

        for (int i = 1; i <= members; i++) {
            System.out.println("\nMember " + i + ":");
            System.out.print("Enter principal amount (UGX): ");
            double principal = input.nextDouble();

            System.out.print("Enter time period in years: ");
            int years = input.nextInt();

            double investmentValue = principal * Math.pow((1 + rate), years);
            System.out.printf("Final Investment Value after %d years: UGX %.2f\n", years, investmentValue);
        }

        input.close();
    }
}
