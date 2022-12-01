package 코딩테스트연습.level2;

public class 가장큰정사각형찾기 {
    public static int solution(int [][]board)
    {
        int ans = 0;

        int sizeR = board.length;
        int sizeC = board[0].length;

        int[][] DP = new int[2][board[0].length];

        //첫째줄은 그냥 복사해주기 (대신 최대값은 갱신해준다.)
        for (int i = 0; i < sizeC; i++) {
            DP[0][i] = board[0][i];
            if(DP[0][i] > ans)
                ans = DP[0][i];
        }

        for (int i = 1; i < sizeR; i++) {
            for (int j = 0; j < sizeC; j++) {

                if(board[i][j] == 0)
                    DP[1][j] = 0;
                else {
                    if(j == 0)
                        DP[1][j] = 1;
                    else {
                        DP[1][j] = 1;
                        if(DP[1][j-1] == 0 | DP[0][j] == 0 | DP[0][j-1] == 0) //셋 중에 하나라도 0이면
                            DP[1][j] = 1;
                        else if(DP[1][j-1] == DP[0][j] && DP[0][j] == DP[0][j-1]) //셋 다 같으면
                            DP[1][j] = DP[0][j] + 1;
                        else { //셋 다 다르면 셋 중 가장 작은 값
                            if(DP[1][j-1] <= DP[0][j-1] && DP[1][j-1] <= DP[0][j])
                                DP[1][j] = DP[1][j-1] + 1;
                            else if(DP[0][j-1] <= DP[1][j-1] && DP[0][j-1] <= DP[0][j])
                                DP[1][j] = DP[0][j-1] + 1;
                            else if(DP[0][j] <= DP[0][j-1] && DP[0][j] <= DP[1][j-1])
                                DP[1][j] = DP[0][j] + 1;
                        }
                    }
                }

                if(DP[1][j] > ans)
                    ans = DP[1][j];
            }

            for (int j = 0; j < sizeC; j++) {
                DP[0][j] = DP[1][j];
            }

        }

        return ans*ans;
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
