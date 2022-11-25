package 코딩테스트연습.level2;

import java.util.LinkedList;
import java.util.Queue;

public class 게임맵최단거리 {
    int[] dx = {1, 0, -1, 0};
    int[] dy = {0, 1, 0, -1};

    public int solution(int[][] maps) {
        int answer = 0;

        int[][] visited = new int[maps.length][maps[0].length];

        bfs(maps, visited);
        answer = visited[maps.length-1][maps[0].length-1];

        if(answer == 0){
            answer = -1;
        }

        return answer;
    }

    public void bfs(int[][] maps, int[][] visited){
        //시작점
        int x = 0;
        int y = 0;
        visited[x][y] = 1;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});

        while(!queue.isEmpty()){
            int[] current = queue.remove();
            int cX = current[0];
            int cY = current[1];

            for(int i = 0; i < 4; i++){ //동서남북 탐색
                int nX = cX + dx[i];
                int nY = cY + dy[i];

                if(nX < 0 || nX > maps.length-1 || nY < 0 || nY > maps[0].length-1) //맵을 벗어나면 건너뛰기
                    continue;

                if(visited[nX][nY] == 0 && maps[nX][nY] == 1){ //동서남북 중 방문하지 않고 벽이 아닌 곳으로
                    visited[nX][nY] = visited[cX][cY] + 1; //현재까지 이동거리 + 1
                    queue.add(new int[]{nX, nY});
                }
            }

        }


    }
}
