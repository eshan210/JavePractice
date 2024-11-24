package Basic;
import java.util.Scanner;

public class PrimitiveAndInput {
    public static  void main (String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter your name: ");
        String name = scanner.nextLine(); // Double quotation for string

        System.out.println("please enter an interger: ");
        int numOne = scanner.nextInt();

        System.out.println("Please enter a decimal number: ");
        double numTwo = scanner.nextDouble();

//        String name = "Mubin";
//        char character = 'm';
//        boolean isRaining = true;
//        int numOne = 5;
//        double pi = 3.1416;

        System.out.println(name);
        System.out.println(numOne);
        System.out.println(numTwo);

    }
}
