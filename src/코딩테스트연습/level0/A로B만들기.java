package 코딩테스트연습.level0;

public class A로B만들기 {
    public int solution(String before, String after) {
        int answer = 0;
        for(int i = 0; i < before.length(); i++) {
            after = after.replaceFirst(String.valueOf(before.charAt(i)), "");
        }

        if(after.length() == 0) {
            answer = 1;
        }

        return answer;
    }
}
