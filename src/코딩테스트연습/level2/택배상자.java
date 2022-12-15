package 코딩테스트연습.level2;

import java.util.*;

public class 택배상자 {
    public int solution(int[] order) {
        Stack<Integer> assistance = new Stack<>();
        int answer = 0;
        int i = 0;

        for(int box = 1; box <= order.length; box++) {
            if(order[i] != box) {
                assistance.push(box);
                continue;
            }

            i++;
            answer++;

            while (assistance.size() != 0 && order[i] == assistance.peek()) {
                assistance.pop();
                i++;
                answer++;
            }
        }

        return answer;
    }
}
