// Java Program to Declare, Initialize, and Print an Array
import java.util.Arrays;

public class arrayEx {
    public static void main(String[] args) {
        // Declare and initialize an array
        int[] numbers = {10, 20, 30, 40, 50};

        // Print array elements using a loop
        System.out.println("Array elements:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        // Print the array using Arrays.toString() method
        System.out.println("\nArray using toString(): " + Arrays.toString(numbers));
    }
}
