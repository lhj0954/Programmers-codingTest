package 코딩테스트연습.level0;

public class 숫자찾기 {
    public int solution(int num, int k) {
        int answer = -1;
        int index = String.valueOf(num).length();
        for(; num > 0; num /= 10) {
            if(num % 10 == k) {
                answer = index;
            }
            index--;
        }
        return answer;
    }
}
