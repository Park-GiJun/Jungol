package q1291;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		boolean check = true;
		StringBuilder sb = new StringBuilder();

		while (check) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());

			if (s < 2 || e < 2 || s > 9 || e > 9) {
				bw.write("INPUT ERROR!\n");
			} else {
				if (e > s) {
					for (int i = 1; i <= 9; i++) {
						for (int j = s; j <= e; j++) {
							int result = j * i;
							sb.append(String.format("%d * %d = %2d   ", j, i, result));
						}
						sb.append("\n");
					}
				} else if (e < s) {
					for (int i = 1; i <= 9; i++) {
						for (int j = s; j >= e; j--) {
							int result = j * i;
							sb.append(String.format("%d * %d = %2d   ", j, i, result));
						}
						sb.append("\n");
					}
				} else {
					for (int i = 1; i <= 9; i++) {
						int result = s * i;
						sb.append(String.format("%d * %d = %2d\n", s, i, result));
					}
				}
				check = false;
			}
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
