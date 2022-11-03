package 코딩테스트연습.level0;

public class 잘라서배열로정리하기 {
    public String[] solution(String my_str, int n) {
        int l = 0;
        if(my_str.length() % n == 0) {
            l = my_str.length() / n;
        } else {
            l = my_str.length() / n + 1;
        }
        String[] answer = new String[l];

        for(int i = 0; i < answer.length; i++) {
            if(i == answer.length - 1) {
                answer[i] = my_str.substring(i*n);
            } else {
                answer[i] = my_str.substring(i*n, (i + 1)*n);
            }

        }

        return answer;
    }
}
