package 코딩테스트연습.level1;

import java.util.regex.Pattern;

public class 신규아이디추천 {
    public static String solution(String new_id) {
        String level_1 = new_id.toLowerCase();

        String level_2 = level_1.replaceAll("[^\\w-_.]","");

        String level_3 = level_2.replaceAll("\\.{2,}", ".");

        String level_4 = level_3.replaceAll("^[.]|[.]$", "");

        String level_5 = level_4;
        if (level_5.length() == 0) {
            level_5 = "a";
        }

        String level_6 = level_5;
        if(level_6.length() > 15) {
            level_6 = level_6.substring(0, 15);
            level_6 = level_6.replaceAll("^[.]|[.]$", "");
        }

        StringBuilder level_7 = new StringBuilder(level_6);
        if (level_7.length() <= 2) {
            String tail = level_7.substring(level_7.length() - 1);
            for (int i = level_7.length(); i < 3; i++) {
                level_7.append(tail);
            }
        }

        return level_7.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution(	"z-+.^."));
    }
}
