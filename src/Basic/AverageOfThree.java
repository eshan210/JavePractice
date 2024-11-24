// Write a program that takes three numbers as input and prints their average.
// Input: x=15, y=5, z=10
// Output: 10
package Basic;
import java.util.Scanner;
public class AverageOfThree {
    public static  void main (String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("x=");
        int x = scanner.nextInt();

        System.out.print("y=");
        int y = scanner.nextInt();

        System.out.print("z=");
        int z = scanner.nextInt();

        double average = ((double) (x + y + z) /3);
        System.out.println(average);




    }
}
