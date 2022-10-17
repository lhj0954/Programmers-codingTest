package 코딩테스트연습.level2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class N개의최소공배수 {
    public static  int gcd (int l, int s) {
        if (s == 0) {
            return l;
        } else {
            return gcd(s, (l % s));
        }
    }

    public static int solution(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        Integer[] _arr = set.toArray(new Integer[0]);

        Arrays.sort(_arr);
        int gcd = _arr[0];

        if (_arr.length < 2) {
            return _arr[0];
        } else {
            for (int i = 1; i < _arr.length; i++) {
                gcd = gcd(_arr[i], gcd);
            }

            int lcm = gcd;
            for (int i = 0; i < arr.length; i++) {
                lcm *= (_arr[i] / gcd);
            }

            return lcm;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,6,8,14};
        System.out.println(solution(arr));
    }
}
