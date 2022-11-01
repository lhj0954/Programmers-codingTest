package 코딩테스트연습.level0;

public class 두수의나눗셈 {
    public int solution(int num1, int num2) {
        int answer = 0;
        double temp = (double) num1 / num2 * 1000;
        answer = (int) temp;
        return answer;
    }
}
