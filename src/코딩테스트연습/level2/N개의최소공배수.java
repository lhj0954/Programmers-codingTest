package 코딩테스트연습.level2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class N개의최소공배수 {
    public static int Euclid(int m, int n) {
        if(n == 0) {
            return m;
        } else {
            return Euclid(n, m % n);
        }
    }
    public int solution(int[] arr) {
        int answer = 0;

        if(arr.length == 1) {
            answer = arr[0];
        } else if(arr.length == 2) {
            int gcd = Euclid(Math.max(arr[0], arr[1]), Math.min(arr[0], arr[1]));
            answer = gcd * (arr[0] / gcd) * (arr[1] / gcd);
        } else {
            int gcd = Euclid(Math.max(arr[0], arr[1]), Math.min(arr[0], arr[1]));
            int temp = gcd * (arr[0] / gcd) * (arr[1] / gcd);
            for(int i = 2; i < arr.length; i++) {
                gcd = Euclid(Math.max(temp, arr[i]), Math.min(temp, arr[i]));
                temp = gcd * (temp / gcd) * (arr[i] / gcd);
            }

            answer = temp;
        }

        return answer;
    }
}
