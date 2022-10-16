package 코딩테스트연습.level2;

public class 올바른괄호 {
    static boolean solution(String s) {
        boolean answer = true;
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            sb.append(s.charAt(i));
            if (sb.substring(sb.length() - 2, sb.length() - 1).equals("()")) {
                sb.delete(sb.length() - 2, sb.length() - 1);
            }
        }

        if (sb.length() != 0) {
            answer = false;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("()()()()()()"));
    }
}
