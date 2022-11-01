package 코딩테스트연습.level0;

public class 대문자와소문자 {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();

        for(int i = 0; i < my_string.length(); i++) {
            if(my_string.charAt(i) >= 97) {
                answer.append(String.valueOf(my_string.charAt(i)).toUpperCase());
            } else {
                answer.append(String.valueOf(my_string.charAt(i)).toLowerCase());
            }
        }

        return answer.toString();
    }
}
