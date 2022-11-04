package 코딩테스트연습.level0;

public class 직사각형넓이구하기 {
    public int solution(int[][] dots) {
        int answer = 0;
        int width = 0;
        int height = 0;

        int standard_x = dots[0][0];
        int standard_y = dots[0][1];

        for(int i = 1; i < dots.length; i++) {
            if(standard_x == dots[i][0]) {
                height = Math.abs(standard_y - dots[i][1]);
            }
            if(standard_y == dots[i][1]) {
                width = Math.abs(standard_x - dots[i][0]);
            }
        }

        answer = width * height;

        return answer;
    }
}
