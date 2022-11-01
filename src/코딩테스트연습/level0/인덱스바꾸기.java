package 코딩테스트연습.level0;

public class 인덱스바꾸기 {
    public String solution(String my_string, int num1, int num2) {
        char temp1 = my_string.charAt(num1);
        char temp2 = my_string.charAt(num2);

        StringBuilder answer = new StringBuilder();
        for(int i = 0; i < my_string.length(); i++) {
            if(i == num1) {
                answer.append(temp2);
            } else if(i == num2) {
                answer.append(temp1);
            } else {
                answer.append(my_string.charAt(i));
            }

        }

        return answer.toString();
    }
}
