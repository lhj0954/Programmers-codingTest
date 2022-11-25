package 코딩테스트연습.level2;

import java.util.LinkedList;
import java.util.Queue;

public class 다리를지나는트럭 {
    public int solution () {
        Queue<Integer[]> queue = new LinkedList<>();
        queue.add(new Integer[]{4, 2});
        int sum = 0;
        for(Integer[] i : queue) {
            sum += i[1];
        }
        return 1;
    }
}
