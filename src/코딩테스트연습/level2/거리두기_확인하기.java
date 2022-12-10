package 코딩테스트연습.level2;

import java.util.*;

public class 거리두기_확인하기 {
    static int[] x = {1, 0, -1, 0};
    static int[] y = {0, 1, 0, -1};
    static int[] _x = {1, -1, -1, 1};
    static int[] _y = {1, 1, -1, -1};

    public static boolean check (List<Integer[]> positions, char[][] map) {
        for(Integer[] position : positions) {
            for(int i = 0; i < 4; i++) {
                int temp_x = position[0] + x[i];
                int temp_y = position[1] + y[i];
                if((temp_x >= 0 && temp_y >= 0) && (temp_x < 5 && temp_y < 5) && (map[temp_x][temp_y] == 'P')) {
                    return false;
                }
            }

            for(int i = 0; i < 4; i++) {
                int temp_x = position[0] + 2 * x[i];
                int temp_y = position[1] + 2 * y[i];
                if((temp_x >= 0 && temp_y >= 0) && (temp_x < 5 && temp_y < 5) && (map[temp_x][temp_y] == 'P')) {
                    switch (i) {
                        case 0:
                            temp_x--;
                            break;
                        case 1:
                            temp_y++;
                            break;
                        case 2:
                            temp_x++;
                            break;
                        case 3:
                            temp_y++;
                            break;
                    }
                    if(map[temp_x][temp_y] == 'O') {
                        return false;
                    }
                }
            }

            for(int i = 0; i < 4; i++) {
                int temp_x = position[0] + _x[i];
                int temp_y = position[1] + _y[i];
                if((temp_x >= 0 && temp_y >= 0) && (temp_x < 5 && temp_y < 5) && (map[temp_x][temp_y] == 'P')) {
                    switch (i) {
                        case 0:
                            if(!(map[temp_x - 1][temp_y] == 'X' && map[temp_x][temp_y - 1] == 'X')) {
                                return false;
                            }
                            break;
                        case 1:
                            if(!(map[temp_x + 1][temp_y] == 'X' && map[temp_x][temp_y - 1] == 'X')) {
                                return false;
                            }
                            break;
                        case 2:
                            if(!(map[temp_x + 1][temp_y] == 'X' && map[temp_x][temp_y + 1] == 'X')) {
                                return false;
                            }
                            break;
                        case 3:
                            if(!(map[temp_x - 1][temp_y] == 'X' && map[temp_x][temp_y + 1] == 'X')) {
                                return false;
                            }
                            break;
                    }
                }
            }
        }
        return true;
    }

    public static Object[] solution(String[][] places) {
        List<Integer> answer = new ArrayList<>();

        for(int i = 0; i < places.length; i++) {
            char[][] map = new char[5][5];
            List<Integer[]> position = new ArrayList<>();
            for(int j = 0; j < 5; j++) {
                for(int k = 0; k < 5; k++) {
                    map[j][k] = places[i][j].charAt(k);
                    if(map[j][k] == 'P') {
                        position.add(new Integer[]{j, k});
                    }
                }
            }

            if(check(position, map)) {
                answer.add(1);
            } else {
                answer.add(0);
            }
        }

        return answer.toArray();
    }

    public static void main(String[] args) {
        String[][] arr = {{"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"}, {"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"}, {"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"}, {"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"}, {"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}};
        System.out.println(Arrays.toString(solution(arr)));
    }
}
