// Program 4: Check whether age is valid and eligible for voting
import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age < 0) {
            System.out.println("Invalid age");
        } else if (age >= 18) {
            System.out.println("Age is valid and you are eligible for voting");
        } else {
            System.out.println("Age is valid but you are not eligible for voting");
        }

        sc.close();
    }
}
