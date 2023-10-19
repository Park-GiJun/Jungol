package q9020;

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		bw.write("5개의 수를 입력하시오. ");

		int[] nums = new int[5];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < nums.length; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}
		List<Integer> list = new ArrayList<>();
		list.add(nums[0] + 3);
		list.add(nums[1] - 3);
		list.add(nums[2] * 3);
		list.add(nums[3] / 3);
		list.add(nums[4] % 3);

		for (int num : list) {
			bw.write(String.valueOf(num) + " ");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
