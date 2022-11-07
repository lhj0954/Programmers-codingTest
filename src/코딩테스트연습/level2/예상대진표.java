package 코딩테스트연습.level2;

public class 예상대진표 {
    public int solution(int n, int a, int b) {
        int answer = 1;
        int s = Math.min(a, b);
        int l = Math.max(a, b);

        while(l - s != 1 || s % 2 == 0) {
            answer++;
            if(s % 2 == 1) {
                s = s / 2 + 1;
            } else {
                s = s / 2;
            }
            if(l % 2 == 1) {
                l = l / 2 + 1;
            } else {
                l = l / 2;
            }
        }

        return answer;
    }
}
