package 코딩테스트연습.level1;

public class 인형뽑기 {
    public int solution(int[][] board, int[] moves) {
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
}
