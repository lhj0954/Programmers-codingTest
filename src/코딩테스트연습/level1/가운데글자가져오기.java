package 코딩테스트연습.level1;

public class 가운데글자가져오기 {
    public static String solution(String s) {
        String answer = "";

        int l = s.length();
        int m = (l + 1) / 2;

        if((l % 2) == 1) {
            answer = s.substring(m, m + 1);
        } else {
            answer = s.substring(m, m + 2);
        }

        return answer;
    }
}
