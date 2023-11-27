package q9105;

import java.util.Scanner;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int[] result;

    static void dice(int n, int depth) {
        if (depth == n) {
            for (int i = 0; i < n; i++) {
                sb.append(result[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 1; i <= 6; i++) {
            result[depth] = i;
            dice(n, depth + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        result = new int[n];
        dice(n, 0);

        System.out.println(sb.toString());
    }
}

