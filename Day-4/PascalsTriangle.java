public class PascalsTriangle {
    public static void main(String[] args) {
        int n = 5; 
        printPascalsTriangle(n);
    }

    public static void printPascalsTriangle(int n) {
        for (int line = 0; line < n; line++) {
            int C = 1; 
            for (int i = 0; i <= line; i++) {
                System.out.print(C + " ");
                C = C * (line - i) / (i + 1); 
            }
            System.out.println(); 
        }
    }
}
