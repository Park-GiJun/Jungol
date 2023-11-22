package q599;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char upper = str.charAt(i);
            if (Character.isAlphabetic(upper)) {
                sb.append(Character.toUpperCase(upper));
            }
        }
        System.out.print(sb.toString());
    }
}
