package 코딩테스트연습.level0;

public class 문자열뒤집기 {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        for(int i = my_string.length() - 1; i >= 0; i--) {
            answer.append(my_string.charAt(i));
        }
        return answer.toString();
    }
}
