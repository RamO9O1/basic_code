import java.io.*;
import java.util.*;

public class CheckProLos {
    static class Pair {
        int first;
        int second;

        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + first;
            result = prime * result + second;
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Pair other = (Pair) obj;
            if (first != other.first)
                return false;
            if (second != other.second)
                return false;
            return true;
        }

    }

    public static void main(String[] args) throws IOException {
        int Q = 3;
        int[][] pairs = new int[][] { { 4, 10 }, { 10, 5 }, { 5, 4 } };
        int N = 7;
        int[] A = new int[] { 4, 4, 10, 5, 4, 10, 5 };
        long out_ = solve(Q, pairs, N, A);
        System.out.println(out_);

    }

    static long solve(int Q, int[][] pairs, int N, int[] A) {
        long result = 0;
        Map<Pair, Integer> map = new HashMap<>();
        List<Pair> arr = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                Pair p = new Pair(A[i], A[j]);
                arr.add(p);
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            map.put(arr.get(i), map.getOrDefault(arr.get(i), 0) + 1);
        }
        for (int[] pair : pairs) {
            Pair p = new Pair(pair[0], pair[1]);
            if (map.containsKey(p)) {
                result += map.get(p);
            }
        }
        return result;

    }
}