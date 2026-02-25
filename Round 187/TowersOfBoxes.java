import java.util.Scanner;

public class TowersOfBoxes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int d = scanner.nextInt();
            System.out.println(calculateMinTowers(n, m, d));
        }
        scanner.close();
    }

    public static int calculateMinTowers(int n, int m, int d) {
        if (m > d) {
            return n;
        } else {
            return (int) Math.ceil((double) n / (d / m + 1));
        }
    }
}