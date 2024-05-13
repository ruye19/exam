package question4;
import java.util.Scanner;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        int[] array = new int[n];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        
        System.out.println("Original array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        
        bubbleSort(array);
        
        System.out.println("\nSorted array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        
        scanner.close();
    }
}