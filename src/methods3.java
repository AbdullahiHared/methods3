
import java.util.Scanner;
public class methods3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int unsortedArray[] = new int[6];
        for (int i = 0; i < unsortedArray.length; i++) {
            unsortedArray[i] = sc.nextInt();
        }

        // Call the sortArray method to sort the array
        sortArray(unsortedArray);

        // Print the sorted array
        for (int num : unsortedArray) {
            System.out.print(num + " ");
        }
    }

    static void sortArray(int[] arr) {
        int arrayLength = arr.length;

        for (int i = 0; i < arrayLength - 1; i++) {
            for (int j = 0; j < arrayLength - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}