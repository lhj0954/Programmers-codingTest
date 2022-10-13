package 코딩테스트연습.level1;

public class 삼총사 {
    public static int solution(int[] number) {
        int answer = 0;

        for(int i = 0; i < number.length; i++) {
            for(int j = (i + 1); j < number.length; j++) {
                for(int k = (j + 1); k < number.length; k++) {
                    if(number[i] + number[j] + number[k] == 0) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
}
