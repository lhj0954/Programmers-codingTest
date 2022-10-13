package 코딩테스트연습.level1;

public class 핸드폰번호가리기 {
    public static String solution(String pn) {
        String last_4 = pn.substring(pn.length() - 4);
        String front = "*".repeat(pn.length() - 4);

        return front.concat(last_4);
    }
}
