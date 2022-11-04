package 코딩테스트연습.level0;

public class 다음에올숫자 {
    public int solution(int[] common) {
        int answer = 0;

        if(common[1] - common[0] == 0) {
            return common[0];
        } else if(common[2] - common[1] == common[1] - common[0]) {
            return common[0] + (common[1] - common[0]) * common.length;
        } else {
            return common[0] * (int)Math.pow(common[1] / common[0], common.length);
        }

    }
}
