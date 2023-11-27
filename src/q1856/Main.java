package q1856;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        int k = 1;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                for (int j = 1; j <= m; j++) {
                    sb.append(k++ + " ");
                }
            } else {
                k = k + m - 1;
                for (int j = m; j >= 1; j--) {

                    sb.append(k-- + " ");
                }
                k = k + m + 1;
            }
            sb.append("\n");
        }
        System.out.println(sb.toString().trim());
    }
}
