import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int h;
    static int w;
    static int[][] visited;
    static int[][] cheese;
    static int count = 1; // Initialize count to 1
    static void dfs(int ih, int iw) {
        if (ih < 0 || iw < 0 || ih >= h || iw >= w || visited[ih][iw] != 0) {
            return;
        }

        visited[ih][iw] = count;

        if (cheese[ih][iw] == 1) {
            if (ih > 0 && cheese[ih - 1][iw] == 0 || iw > 0 && cheese[ih][iw - 1] == 0
                    || ih < h - 1 && cheese[ih + 1][iw] == 0 || iw < w - 1 && cheese[ih][iw + 1] == 0) {
                visited[ih][iw]++;
            }
        }

        dfs(ih - 1, iw);
        dfs(ih + 1, iw);
        dfs(ih, iw - 1);
        dfs(ih, iw + 1);
    }

    static void afterCheese(int ih, int iw) {
        if (ih >= 0 && iw >= 0 && ih < h && iw < w && visited[ih][iw] == count) {
            cheese[ih][iw] = 0;
        }
    }

    static void printCheese() {
        System.out.println();
        System.out.println("---------------------------");
        System.out.println("치즈 출력");
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                System.out.print(cheese[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("---------------------------");
    }

    static void printVisited() {
        System.out.println("---------------------------");
        System.out.println("방문 출력");
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                System.out.print(visited[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("---------------------------");
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        h = Integer.parseInt(st.nextToken());
        w = Integer.parseInt(st.nextToken());
        visited = new int[h][w];
        cheese = new int[h][w];

        // Initiate cheese
        for (int i = 0; i < h; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < w; j++) {
                cheese[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        printCheese();
        printVisited();
        dfs(0, 0);
        printVisited();
        count++;
        System.out.println("first count : " + count);
        System.out.println();
        printVisited();
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                afterCheese(i, j);
            }
        }
        printCheese();
    }
}
