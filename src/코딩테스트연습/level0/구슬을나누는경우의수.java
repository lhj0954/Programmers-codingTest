package 코딩테스트연습.level0;

public class 구슬을나누는경우의수 {
    public long solution(int balls, int share) {

        share = Math.min(balls - share, share); //7C3 = 7C4

        if (share == 0) //mC0 = 1
            return 1L;

        long result = solution(balls - 1, share - 1); //
        result *= balls;
        result /= share;

        return result;
    }
}
