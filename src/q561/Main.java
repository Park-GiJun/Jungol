package q561;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> big = new ArrayList<>();
        ArrayList<Integer> small = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int inp = sc.nextInt();
            if (inp > 10000) {
                inp =100;
                big.add(inp);
            } else if (inp >= 100) {
                big.add(inp);
            } else {
                small.add(inp);
            }
        }
        sc.close();
        Collections.sort(big);
        Collections.sort(small, Collections.reverseOrder());
        if (small.isEmpty()) {
            small.add(100);
        }
        if (big.isEmpty()) {
            big.add(100);
        }

        System.out.println(small.get(0) + " " + big.get(0));
    }
}
