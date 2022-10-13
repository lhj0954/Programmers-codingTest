package 코딩테스트연습.level1;

public class 평균구하기 {
    static public double solution (int[] arr) {
        double answer = 0;

        for (int j : arr) {
            answer += j;
        }

        answer = answer/ arr.length;

        return answer;
    }

}
