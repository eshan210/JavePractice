package Exceptions;

public class DivedeByZero {

    public static void main(String[] args) {
        int[]numbers = new int[] { 1, 2, 3, 4 };
        double average = findAverage(numbers);
        int answer = findItem(numbers, 3);

        System.out.println(answer);
    }

    public static double findAverage(int[] numbers) {

        if (numbers.length == 0) {
            throw new ArithmeticException("Cannot divide by zero");

        }
        double total = 0;
        for(int element: numbers){
            total += element;
        }
        return total / numbers.length;
    }

    public static int findItem(int[] numbers, int index) {
        return numbers[index];
    }

}
