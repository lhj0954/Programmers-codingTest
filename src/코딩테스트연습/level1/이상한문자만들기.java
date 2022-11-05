package 코딩테스트연습.level1;

public class 이상한문자만들기 {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();

        int index = 0;
        for(int i = 0; i < s.length(); i++) {
            if(String.valueOf(s.charAt(i)).equals(" ")) {
                index = 0;
                answer.append(" ");
            } else {
                if(index % 2 == 0) {
                    answer.append(String.valueOf(s.charAt(i)).toUpperCase());
                } else {
                    answer.append(String.valueOf(s.charAt(i)).toLowerCase());
                }
                index++;
            }
        }

        return answer.toString();
    }
}
