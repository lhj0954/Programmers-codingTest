package 코딩테스트연습.level2;

public class Jadencase문자열만들기 {
    public static String solution(String s) {
        s = s.toLowerCase();
        StringBuilder answer = new StringBuilder(s);

        if (!answer.substring(0, 1).equals(" ")) {
            String temp = answer.substring(0, 1);
            answer.deleteCharAt(0);
            answer.insert(0, temp.toUpperCase());
        }

        for (int i = 1; i < answer.length(); i++) {
            String temp = answer.substring(i, (i + 1));

            if (answer.substring((i - 1), i).equals(" ")) {
                answer.deleteCharAt(i);
                answer.insert(i, temp.toUpperCase());
            }
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("a aa"));
    }
}
//a aa,A Aa