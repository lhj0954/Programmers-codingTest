package 코딩테스트연습.level0;

public class 특정문자제거하기 {
    public String solution(String my_string, String letter) {
        String answer = "";
        answer = my_string.replaceAll(letter, "");
        return answer;
    }
}
