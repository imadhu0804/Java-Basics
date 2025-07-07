import java.util.Arrays;
import java.util.Scanner;

public class Missing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // Size of array
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int missing = -1;
        for (int i = 0; i < n - 1; i++) { 
            if (arr[i + 1] != arr[i] + 1) {
                missing = arr[i] + 1;
                break;
            }
        }

        if (missing != -1) {
            System.out.println("Missing number: " + missing);
        } else {
            System.out.println("No missing number found.");
        }

        sc.close();
    }
}