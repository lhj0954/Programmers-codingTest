package 코딩테스트연습.level1;

public class 서울에서김씨찾기 {
    public static String solution(String[] seoul) {
        int x = 0;

        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                x = i;
            }
        }

        return x + "에 있음";
    }
}
