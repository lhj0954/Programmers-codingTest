package 코딩테스트연습.level0;

public class k의개수 {
    public int solution(int i, int j, int k) {
        int answer = 0;

        for(int start = i; start <= j; start++) {
            int temp = start;
            for(; temp > 0; temp /= 10) {
                if(temp % 10 == k) {
                    answer++;
                }
            }
        }

        return answer;
    }
}
