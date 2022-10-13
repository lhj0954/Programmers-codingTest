package 코딩테스트연습.level1;

public class 문자열내p와y개수 {
    static public boolean solution(String s) {
        boolean answer = true;
        char[] arr = s.toLowerCase().toCharArray();
        int p_count = 0;
        int y_count = 0;

        for (char c : arr) {
            if (c == 'p') {
                p_count++;
            }
            if (c == 'y') {
                y_count++;
            }
        }

        if (p_count != y_count) {
            answer = false;
        }

        return answer;
    }
}
