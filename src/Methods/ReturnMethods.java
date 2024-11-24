package Methods;
import java.util.Scanner;

public class ReturnMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Number One: ");
        int x = scanner.nextInt();

        System.out.println("Number Two: ");
        int y = scanner.nextInt();

        int fullname = multiply(x,y);

        System.out.println(fullname);


    }

    public static int multiply(int x, int y) {
        return x*y;
    }
}
