package 코딩테스트연습.level1;

public class 인형뽑기 {
    public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        int[] bucket =  new int[moves.length];

        int index = 0;
        for (int i = 0; i < moves.length; i++) {
            for(int j = 0; j < board[moves[i] - 1].length; j++) {
                if (board[j][moves[i] - 1] != 0) {
                    bucket[index] = board[j][moves[i] - 1];
                    if (index > 0 && bucket[index] == bucket[index - 1]) {
                        bucket[index - 1] = 0;
                        bucket[index] = 0;
                        index--;
                        answer += 2;
                    } else {
                        index++;
                    }
                    board[j][moves[i] - 1] = 0;
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};

        System.out.println(solution(board, moves));
    }
}
