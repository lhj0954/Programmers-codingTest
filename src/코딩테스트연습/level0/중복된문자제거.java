package 코딩테스트연습.level0;

public class 중복된문자제거 {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();

        for(int i = 0; i < my_string.length(); i++) {
            if(!answer.toString().contains(String.valueOf(my_string.charAt(i)))) {
                answer.append(my_string.charAt(i));
            }
        }

        return answer.toString();
    }
}
