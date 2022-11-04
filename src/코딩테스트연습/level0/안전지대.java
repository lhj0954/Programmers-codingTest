package 코딩테스트연습.level0;

public class 안전지대 {
    public int solution(int[][] board) {
        int answer = 0;
        int[][] board_copy = new int[board.length + 2][board.length + 2];

        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                if(board[i][j] == 1) {
                    board_copy[i + 1][j + 1] = 1;
                    board_copy[i][j] = 1;
                    board_copy[i][j + 1] = 1;
                    board_copy[i][j + 2] = 1;
                    board_copy[i + 1][j] = 1;
                    board_copy[i + 1][j + 2] = 1;
                    board_copy[i + 2][j] = 1;
                    board_copy[i + 2][j + 1] = 1;
                    board_copy[i + 2][j + 2] = 1;
                }
            }
        }

        for(int i = 1; i <= board.length; i++) {
            for(int j = 1; j < board_copy.length - 1; j++) {
                if(board_copy[i][j] == 0) {
                    answer++;
                }
            }
        }

        return answer;
    }
}
