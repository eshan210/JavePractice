package Methods;
import java.util.Scanner;

public class MethodType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter your name:");
        String name = scanner.nextLine();

        System.out.println("please enter your address:");
        String residence = scanner.nextLine();

        printInfo(name, residence);

    }

    public static void printInfo(String name, String residence) {

        System.out.println(" Hello, everyone!");
        System.out.println(" I am "+ name);
        System.out.println(" I live in "+ residence);
    }

}
