// Write a program that takes two numbers as input and prints the quotient and remainder of their division.
// Input: x= 13, y=5
// Output: Quotient is: 2, Remainder is: 3
package Basic;
import java.util.Scanner;

public class QuotientAndRemainder {
    public static  void main (String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter an numerator: ");
        int numOne = scanner.nextInt();

        System.out.println("please enter an denominator: ");
        int numTwo = scanner.nextInt();

        System.out.print("Quotient is: ");
        System.out.println(numOne/numTwo);
        System.out.print("Remainder is: ");
        System.out.println(numOne%numTwo);





    }
}
