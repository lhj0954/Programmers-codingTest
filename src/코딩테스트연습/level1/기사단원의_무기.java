package 코딩테스트연습.level1;

public class 기사단원의_무기 {
    public int solution(int number, int limit, int power) {
        int answer = 0;

        for(int i = 1; i <= number; i++) {
            int cnt = 0;
            for(int j = 1; j <= Math.sqrt(i); j++) {
                if(i % j == 0) {
                    cnt += 2;
                    if(j == Math.sqrt(i)) {
                        cnt--;
                    }
                }
            }

            if(cnt > limit) {
                answer += power;
            } else {
                answer += cnt;
            }
        }

        return answer;
    }
}
