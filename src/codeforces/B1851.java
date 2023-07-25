package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class B1851 {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                if (st.hasMoreTokens()) {
                    str = st.nextToken("\n");
                } else {
                    str = br.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String[] args) {
        FastReader fastReader = new FastReader();
        int t = fastReader.nextInt();
        while (t-- > 0) {
            int n = fastReader.nextInt();
            int[] a = new int[n];
            List<Integer> indexEvenElements = new LinkedList<>();
            for (int i = 0; i < n; i++) {
                a[i] = fastReader.nextInt();
                if (a[i] % 2 == 0) {
                    indexEvenElements.add(i);
                }
            }
            Arrays.sort(a);
            boolean isPossible = true;
            for (int i : indexEvenElements) {
                if (a[i] % 2 != 0) {
                    isPossible = false;
                    break;
                }
            }
            System.out.println(isPossible? "YES" : "NO");
        }
    }
}
