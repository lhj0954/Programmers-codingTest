package 코딩테스트연습.level0;

import java.util.Arrays;

public class 삼각형의완성조건_1 {
    public int solution(int[] sides) {
        int answer = 1;
        Arrays.sort(sides);

        if(sides[2] >= sides[0] + sides[1]) {
            answer = 2;
        }
        return answer;
    }
}
