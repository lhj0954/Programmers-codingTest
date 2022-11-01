package 코딩테스트연습.level0;

public class 외계행성의나이 {
    public String solution(int age) {
        StringBuilder answer = new StringBuilder();
        String str = String.valueOf(age);

        for(int i = 0; i < str.length(); i++) {
            answer.append((char) (str.charAt(i) + 49));
        }


        return answer.toString();
    }
}
