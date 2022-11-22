package 코딩테스트연습.level2;

import java.util.PriorityQueue;

public class 더맵게 {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(int i : scoville) {
            heap.add(i);
        }

        while(heap.peek() < K) {
            if(heap.size() == 1) {
                answer = -1;
                break;
            }
            int sum = 0;
            sum += heap.poll();
            sum += 2 * heap.poll();
            heap.add(sum);
            answer++;
        }

        return answer;
    }
    
}
// -1 9 10 12     13
