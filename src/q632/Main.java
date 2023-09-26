package q632;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] ar = new int[3];

        for (int i = 0; i < 3; i++) {
            if (st.hasMoreTokens()) {
                ar[i] = Integer.parseInt(st.nextToken());
            }
        }

        Arrays.sort(ar);
        bw.write(Integer.toString(ar[0])); 
        bw.flush(); 
        bw.close(); 
        br.close();
    }
}

