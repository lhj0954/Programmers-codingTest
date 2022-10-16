package 코딩테스트연습.level2;

import java.util.ArrayList;
import java.util.List;

public class 카펫 {
    public int[] solution(int brown, int yellow) {
        List<Integer> factors = new ArrayList<>();
        for(int i = 1; i <= Math.sqrt(yellow); i++) {
            if ((yellow % i) == 0) {
                factors.add(i);
            }
        }

        int width = 0;
        int height = 0;
        for(Integer factor : factors) {
            if (brown == (4 + 2*(factor + (yellow / factor)))) {
                width = (yellow / factor) + 2;
                height = factor + 2;
            }
        }

        return new int[]{width, height};
    }
}
