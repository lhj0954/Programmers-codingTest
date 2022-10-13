package 코딩테스트연습.level1;

import java.util.*;

public class 실패율 {
    public static Integer[] solution(int N, int[] stages) {
        double[] fail_rate = new double[N];
        List<Integer> answer = new ArrayList<>();

        for(int i = 0; i < N; i++) {
            double arrived = 0;
            double unclear = 0;

            for(int j = 0; j < stages.length; j++) {
                if(stages[j] >= (i + 1)) {
                    arrived++;
                }
                if(stages[j] == (i + 1)) {
                    unclear++;
                }
            }

            fail_rate[i] = unclear / arrived;
        }

        Set<Double> set = new HashSet<>();
        for (int i = 0; i < fail_rate.length; i++) {
            set.add(fail_rate[i]);
        }

        List<Double> doubleList = new ArrayList<>(set);
        doubleList.sort(Comparator.reverseOrder());

        for(int i = 0; i < doubleList.size(); i++) {
            for (int j = 0; j < fail_rate.length; j++) {
                if(doubleList.get(i) == fail_rate[j]) {
                    answer.add(j + 1);
                }
            }
        }

        return answer.toArray(new Integer[0]);
    }

    public static void main(String[] args) {
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};

        System.out.println(Arrays.toString(solution(5, stages)));
    }
}
