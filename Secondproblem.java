import java.util.Scanner;

public class Secondproblem {

    // a) Method to calculate minimum
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    // a) Method to calculate maximum
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // c) Method that returns both min and max at the same time
    public static int[] findMinAndMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int num : arr) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        return new int[]{min, max};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // b-i & b-ii: Read array from command line using Scanner
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Using separate methods
        int min = findMin(arr);
        int max = findMax(arr);

        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);

        // Using combined method
        int[] result = findMinAndMax(arr);
        System.out.println("Min (combined method): " + result[0]);
        System.out.println("Max (combined method): " + result[1]);

        sc.close();
    }
}