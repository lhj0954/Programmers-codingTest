package 코딩테스트연습.level0;

public class 합성수찾기 {
    public int solution(int n) {
        int answer = 0;

        for(int i = 1; i <= n; i++) {
            boolean prime_number = true;
            for(int j = 1; j <= Math.sqrt(i); j++) {
                if(i % j == 0 && j != 1) {
                    prime_number = false;
                    break;
                }
            }
            if(!prime_number) {
                answer++;
            }
        }

        return answer;
    }
}
