package 코딩테스트연습.level0;

public class 모음제거 {
    public String solution(String my_string) {
        String answer = "";
        answer = my_string.replaceAll("[aeiou]", "");
        return answer;
    }
}
