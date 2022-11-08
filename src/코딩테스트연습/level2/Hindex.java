package 코딩테스트연습.level2;

import java.util.Arrays;

public class Hindex {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);

        int h = citations[citations.length - 1];
        while(true) {
            int m = 0;
            for(int i : citations) {
                if(i >= h) {
                    m++;
                }
            }
            if(m >= h) {
                answer = h;
                break;
            } else {
                h--;
            }
        }

        return answer;
    }
}
