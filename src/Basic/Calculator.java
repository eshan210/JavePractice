package Basic;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("please enter a number: ");
            int numberOne = scanner.nextInt();
            System.out.print("please enter a second number: ");
            int numberTwo = scanner.nextInt();

            System.out.println(numberOne+numberTwo);
    }
}
