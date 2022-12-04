package 코딩테스트연습.level2;

import java.util.LinkedList;
import java.util.Queue;

public class 다리를지나는트럭 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 1;

        int index = 1;
        Queue<Integer[]> bridge = new LinkedList<>();
        Integer[] temp = {truck_weights[0], 1};
        bridge.add(temp);
        while(!bridge.isEmpty()) {
            int sum = 0;
            if(bridge.peek()[1] == bridge_length) {
                bridge.remove();
            }
            for(Integer[] i : bridge) {
                sum += i[0];
                i[1] += 1;
            }
            if((index < truck_weights.length) && (sum + truck_weights[index]) <= weight) {
                Integer[] temp2 = {truck_weights[index], 1};
                bridge.add(temp2);
                index++;
            }
            answer++;
        }

        return answer;
    }
}
