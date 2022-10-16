package 코딩테스트연습.level2;

import java.util.Arrays;

public class 이진변환반복하기 {
    public static int[] solution(String s) {
        int zero = 0;
        int count = 0;
        while(s.length() > 1) {
            for(int i = 0; i < s.length(); i++) {
                String element = String.valueOf(s.charAt(i)); //char는 String.valueOf()
                if(element.equals("0")) {
                    zero++;
                }
            }
            s = s.replaceAll("0", "");
            int length = s.length();
            StringBuilder temp = new StringBuilder();
            for(; length > 0; length /= 2) {
                temp.insert(0, (length % 2));
            }
            s = temp.toString();
            count++;
        }

        return new int[]{count, zero};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("110010101001")));
    }
}
