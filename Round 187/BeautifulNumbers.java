import java.util.Scanner;

public class BeautifulNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            System.out.println(countBeautifulNumbers(n));
        }
        scanner.close();
    }
    public static int countBeautifulNumbers(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (!isBeautiful(i)) {
                count++;
            }
        }
        return count;
    }
}
