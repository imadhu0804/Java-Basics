import java.util.Scanner;

public class HourGlassStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            for (int space = 0; space < n - i; space++) {
                System.out.print(" ");
            }
            for (int star = 0; star < 2 * i - 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 2; i <= n; i++) {
            for (int space = 0; space < n - i; space++) {
                System.out.print(" ");
            }
            for (int star = 0; star < 2 * i - 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
