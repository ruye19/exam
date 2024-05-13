package question1;
import java.util.Scanner;

public class NumberSearch {
    public static void main(String[] args) {
        // Get the sequence of numbers from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sequence of numbers, separated by commas: ");
        String numSequence = scanner.nextLine();
        String[] numStrings = numSequence.split(",");
        int[] arr = new int[numStrings.length];
        for (int i = 0; i < numStrings.length; i++) {
            arr[i] = Integer.parseInt(numStrings[i]);
        }

        // Get the number to be searched from the user
        System.out.print("Enter a number to be searched: ");
        int searchNumber = scanner.nextInt();

        // Count the occurrences of the search number in the array
        int occurrences = countOccurrences(arr, searchNumber);

        // Display the result
        if (occurrences > 0) {
            System.out.println("The number " + searchNumber + " appears " + occurrences + " time(s) in the array.");
        } else {
            System.out.println("The number " + searchNumber + " is not present in the array.");
        }
    }

    public static int countOccurrences(int[] arr, int num) {
        int count = 0;
        for (int element : arr) {
            if (element == num) {
                count++;
            }
        }
        return count;
    }
}
