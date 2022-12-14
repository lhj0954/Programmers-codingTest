package 코딩테스트연습.level1;

public class 소수찾기 {
    public boolean find(int m) {
        boolean result = true;

        for(int i = 2; i <= Math.sqrt(m); i++) {
            if((m % i) == 0) {
                result = false;
                break;
            }
        }

        return result;
    }

    public  int solution(int n) {
        int answer = 0;

        for(int i = 2; i <= n; i++) {
            if(find(i)) {
                answer++;
            }
        }

        return answer;
    }
}
