import java.util.Scanner;

public class PairSum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Prompt for array size
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        // Accept array elements
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + i + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Prompt for target sum
        System.out.print("Enter the target sum: ");
        int target = scanner.nextInt();

        boolean found = false;

        // Brute Force Search using nested loops
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {

                if (numbers[i] + numbers[j] == target) {

                    System.out.println("\n===== PAIR FOUND =====");
                    System.out.println("Index 1 : " + i);
                    System.out.println("Value 1 : " + numbers[i]);
                    System.out.println("Index 2 : " + j);
                    System.out.println("Value 2 : " + numbers[j]);
                    System.out.println("Equation: " + numbers[i] + " + " + numbers[j] + " = " + target);

                    found = true;
                    break;
                }
            }

            if (found) {
                break;
            }
        }

        if (!found) {
            System.out.println("\nNo pair found that adds up to " + target + ".");
        }

        scanner.close();
    }
}
