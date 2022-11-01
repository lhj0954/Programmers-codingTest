package 코딩테스트연습.level0;

public class 숨어있는숫자의덧셈 {
    public int solution(String my_string) {
        int answer = 0;

        for(int i = 0; i < my_string.length(); i++) {
            if(my_string.charAt(i) <= 57) {
                answer += Integer.parseInt(String.valueOf(my_string.charAt(i)));
            }
        }

        return answer;
    }
}
