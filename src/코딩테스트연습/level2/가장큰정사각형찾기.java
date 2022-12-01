package 코딩테스트연습.level2;

public class 가장큰정사각형찾기 {


    public static void main(String[] args) {
        int[][] board = {{0, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {0, 0, 1, 0}};
        System.out.println(solution(board));
    }
}
/*public static int solution(int [][]board) {
        int answer = 1;

        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                if(board[i][j] == 0) {
                    continue;
                }

                int width = 0;
                int height = 0;
                for(int k = j; k < board[i].length; k++) {
                    if(board[i][k] == 0) {
                        break;
                    }
                    width++;
                }
                for(int k = i; k < board.length; k++) {
                    if(board[k][j] == 0) {
                        break;
                    }
                    height++;
                }
                if(width != height) {
                    continue;
                }

                int size = 0;
                boolean flag = true;
                for(int k = (i + 1); k < (i + height); k++) {
                    boolean f = true;
                    for(int l = (j + 1); l < (j + width); l++) {
                        if(board[k][l] == 0) {
                            f = false;
                            break;
                        }
                        size++;
                    }
                    if(!f) {
                        flag = false;
                        break;
                    }
                }
                if(flag) {
                    if(answer < (width + height + size - 1)) {
                        answer = (width + height + size - 1);
                    }
                }

            }
        }

        return answer;
    }*/
