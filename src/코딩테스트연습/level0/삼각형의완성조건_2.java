package 코딩테스트연습.level0;

public class 삼각형의완성조건_2 {
    public int solution(int[] sides) {
        int big = Math.max(sides[0], sides[1]);
        int small = Math.min(sides[0], sides[1]);

        return (big + small - 1) - (big - small + 1) + 1;
    }
}
