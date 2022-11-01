package 코딩테스트연습.level0;

public class 문자반복출력하기 {
    public String solution(String my_string, int n) {
        StringBuilder answer = new StringBuilder();

        for(int i = 0; i < my_string.length(); i++) {
            answer.append(String.valueOf(my_string.charAt(i)).repeat(n));
        }

        return answer.toString();
    }
}
