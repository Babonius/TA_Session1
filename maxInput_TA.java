import java.util.Scanner;

public class maxInput_TA{
    public static int findMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be empty or null");
        }

        int max = arr[0];

        // Iterate through the array to find the maximum
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n]; // make the array based on n which is the input of the user in line 23
        System.out.println("Enter the elements of the array according to your previous input:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Maximum value in the array: " + findMax(numbers));
    }
}
