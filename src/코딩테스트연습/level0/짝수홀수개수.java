package 코딩테스트연습.level0;

public class 짝수홀수개수 {
    public int[] solution(int[] num_list) {
        int odd = 0;
        int even = 0;

        for(int i : num_list) {
            if(i % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        return new int[]{even, odd};
    }
}
