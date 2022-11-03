package 코딩테스트연습.level0;

public class 문자열계산하기 {
    public int solution(String my_string) {
        int answer = 0;
        String[] array = my_string.split(" ");

        int sign = 1;
        for(String str : array) {
            if(str.equals("+")) {
                sign = 1;
            } else if(str.equals("-")) {
                sign = -1;
            } else {
                answer += sign * Integer.parseInt(str);
            }
        }
        return answer;
    }
}
