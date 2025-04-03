//Java Program for User Input in an Array
import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Declare the array
        int[] numbers = new int[size];

        // Taking input from the user
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Printing the array elements
        System.out.println("Array elements are:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
