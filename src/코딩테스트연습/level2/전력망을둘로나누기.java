package 코딩테스트연습.level2;
import java.util.*;
public class 전력망을둘로나누기 {
    static int[][] adj;
    public int bfs (int n, int start) {
        boolean[] visited = new boolean[n + 1];
        int cnt = 1;

        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);

        while(!queue.isEmpty()) {
            int temp = queue.poll();
            visited[temp] = true;

            for(int i = 1; i <= n; i++) {
                if(visited[i]) {
                    continue;
                }
                if(adj[temp][i] == 1) {
                    queue.add(i);
                    cnt++;
                }
            }
        }

        return (int)Math.abs(n-2*cnt);
    }
    public int solution(int n, int[][] wires) {
        int answer = n;
        adj = new int[n + 1][n + 1];
        for(int[] wire : wires) {
            adj[wire[0]][wire[1]] = 1;
            adj[wire[1]][wire[0]] = 1;
        }

        for(int[] wire : wires) {
            adj[wire[0]][wire[1]] = 0; // 선 끊기
            adj[wire[1]][wire[0]] = 0;

            answer = Math.min(answer, bfs(n, wire[0]));

            adj[wire[0]][wire[1]] = 1; // 복구
            adj[wire[1]][wire[0]] = 1;
        }

        return answer;
    }
}
