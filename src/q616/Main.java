package q616;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

class Point {
    ArrayList<Integer> listX = new ArrayList<>();
    ArrayList<Integer> listY = new ArrayList<>();

    public void addPoint(int x, int y) {
        listX.add(x);
        listY.add(y);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Point point = new Point();
        StringTokenizer st = new StringTokenizer(sc.nextLine(), " ");

        while (st.hasMoreTokens()) {
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            point.addPoint(x, y);
        }

        int xO = 0;
        int yO = 0;

        for (int num : point.listX) {
            xO += num;
        }
        for (int num : point.listY) {
            yO += num;
        }
        System.out.printf("(%.1f, %.1f)", (double) xO / 3, (double) yO / 3);
    }
}
