package 코딩테스트연습.level2;
import java.util.*;
public class 삼각달팽이 {
    public Object[] solution(int n) {
        List<List<Integer>> tower = new LinkedList<>();
        for(int i = 0; i < n; i++) {
            List<Integer> floor = new LinkedList<>();
            tower.add(floor);
        }
        int nn = 1;
        int top = 0;
        int bottom = n;
        int peel = 0;
        int capacity = n - 1;

        while(bottom > top) {
            for(int i = top; i < bottom; i++) {
                tower.get(i).add(peel, nn);
                nn++;
            }
            for(int i = 0; i < capacity; i++) {
                tower.get(bottom - 1).add(peel + 1 + i, nn);
                nn++;
            }
            bottom--;
            for(int i = bottom - 1; i > top; i--) {
                tower.get(i).add(tower.get(i).size() - peel, nn);
                nn++;
            }
            top += 2;
            peel++;
            capacity -= 3;
        }

        List<Integer> answer= new ArrayList<>();
        for(List<Integer> f : tower) {
            for(Integer i : f) {
                answer.add(i);
            }
        }

        return answer.toArray();
    }
}
