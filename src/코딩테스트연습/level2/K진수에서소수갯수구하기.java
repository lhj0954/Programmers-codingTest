package 코딩테스트연습.level2;

public class K진수에서소수갯수구하기 {
    public int solution(int n, int k) {
        int answer = 0;
        StringBuilder str = new StringBuilder();
        for(; n > 0; n /= k) {
            str.insert(0, n % k);
        }
        String[] arr = str.toString().replaceAll("0{2,}", "0").split("0");
        for(String s : arr) {
            long temp = Long.parseLong(s);
            if(temp == 1) {
                continue;
            }
            boolean prim = true;
            for(int i = 2; i <= Math.sqrt(temp); i++) {
                if(temp % i == 0) {
                    prim = false;
                    break;
                }
            }
            if(prim) {
                answer++;
            }
        }

        return answer;
    }
}
