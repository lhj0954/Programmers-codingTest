package 코딩테스트연습.level2;

import java.util.HashSet;
import java.util.Set;

public class 소숫찾기 {
    static int r = 1;
    static Set<Integer> set = new HashSet<>();
    public boolean check (int n) {
        if(n == 1 || n == 0) {
            return false;
        }
        for(int i = 2 ; i < Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void perm(char[] arr, char[] output, boolean[] visited, int depth, int n) {
        if (depth == r) {
            if(check(Integer.parseInt(String.valueOf(output)))) {
                set.add(Integer.parseInt(String.valueOf(output)));
            }
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                output[depth] = arr[i];
                perm(arr, output, visited, depth + 1, n);
                visited[i] = false;
            }
        }
    }
    public int solution(String numbers) {
        char[] arr = numbers.toCharArray();
        boolean[] visited = new boolean[arr.length];

        while(r <= arr.length) {
            char[] output = new char[r];
            perm(arr, output, visited, 0, arr.length);
            r++;
        }
        return set.size();
    }
}
