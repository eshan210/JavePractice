package ConditionalStatements;
import java.util.Scanner;
public class JavaIfElse {
    public static  void main (String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("n=");
        int N = scanner.nextInt();
        if(N%2!=0) {
            System.out.println("Weird");
        }
        if(N%2==0 && N>=2 && N<=5) {
            System.out.println("Not Weird");
        }
        if(N%2==0 && N>=6 && N<=20) {
            System.out.println("Weird");
        }
        if(N%2==0 && N>20) {
            System.out.println("Not Weird");
        }
    }

}

