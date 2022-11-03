package 코딩테스트연습.level0;

public class 유한소수판별하기 {
    public static int Euclid(int m, int n) {
        if(n == 0) {
            return m;
        } else {
            return Euclid(n, m % n);
        }
    }
    public int solution(int a, int b) {
        int answer = 1;

        int gcd = Euclid(Math.max(a, b), Math.min(a, b));
        b = b / gcd;

        if(b == 1) {
            answer = 1;
        } else {
            int temp = 2;
            while(b != 1) {
                if(b % temp == 0) {
                    if(temp == 2 || temp == 5) {
                        b /= temp;
                    } else {
                        answer = 2;
                        break;
                    }
                } else {
                    temp++;
                }
            }

        }

        return answer;
    }
}
