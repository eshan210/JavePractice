package Basic;
import java.util.Scanner;
public class Basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            //Complete this line

            int spaces = 15 - s1.length();
            String leftCol = s1 +String.valueOf(' ').repeat(spaces);
            String rightCol = String.format("%03d", x);
            System.out.println(leftCol + rightCol);

        }
    System.out.println("================================");
    }
}
