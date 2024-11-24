package ConditionalStatements;
import java.util.Scanner;
public class SumOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Radius: ");

        int x = scanner.nextInt();

        if(x>0){
            System.out.println("positive");
        } else if(x == 0) {
            System.out.println("zero");
        } else {
            System.out.println("Negative");
        }

    }
}
