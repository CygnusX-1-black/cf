// wrong answer

import java.util.Scanner;

public class EatingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = scanner.nextInt();
            }
            System.out.println(countWinners(n, a));
        }
        scanner.close();
    }

    public static int countWinners(int n, int[] a) {
        int maxDishes = 0;
        for (int i = 0; i < n; i++) {
            maxDishes = Math.max(maxDishes, a[i]);
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == maxDishes) {
                count++;
            }
        }
        if (count > 1) {
            return count;
        } else {
            int maxIndex = -1;
            for (int i = 0; i < n; i++) {
                if (a[i] == maxDishes) {
                    maxIndex = i;
                }
            }
            for (int i = 0; i < n; i++) {
                if (i != maxIndex && a[i] == maxDishes - 1) {
                    return 2;
                }
            }
            return 1;
        }
    }
}