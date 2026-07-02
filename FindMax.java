import java.util.Scanner;

public class FindMaximum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the array size
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        // Read the array elements
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Find the maximum value using linear search
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // Display the result
        System.out.println("Maximum value: " + max);

        scanner.close();
    }
}
