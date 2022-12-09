package 코딩테스트연습.level2;

import java.util.*;

public class 배달 {



}
/*public static int solution(int N, int[][] road, int K) {
        int answer = 0;

        Map<Integer, List<String>> map = new HashMap<>();
        for(int i = 1; i <= N; i++) {
            List<String> list = new LinkedList<>();
            map.put(i, list);
        }
        for(int[] r : road) {
            String s1 = r[1] + " " + r[2];
            String s2 = r[0] + " " + r[2];
            map.get(r[0]).add(s1);
            map.get(r[1]).add(s2);
        }

        Queue<Integer> queue = new LinkedList<>();
        int[][] visited = new int[N + 1][2];
        queue.add(1);
        visited[1][0] = 1;
        while(!queue.isEmpty()) {
            int temp = queue.poll();
            if(visited[temp][1] <= K) {
                answer++;
            }
            for(String s : map.get(temp)) {
                String[] arr = s.split(" ");
                if(visited[Integer.parseInt(arr[0])][0] == 0) {
                    queue.add(Integer.parseInt(arr[0]));
                    visited[Integer.parseInt(arr[0])][0] = 1;
                    visited[Integer.parseInt(arr[0])][1] += Integer.parseInt(arr[1]) + visited[temp][1];
                }
            }
        }

        return answer;
    }*/