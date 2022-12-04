package 코딩테스트연습.level2;

public class NQueen {
    static int answer = 0;
    static int[] location;
    public boolean able (int row) {
        for(int i = 0; i < row; i++) {
            if(location[i] == location[row] || row - i == Math.abs(location[row] - location[i])) { //column의 위치가 같거나 대각선에 위치한 경우
                return false;
            }
        }
        return true;
    }

    public void nQueen (int n, int row) {
        if(row == n) {
            answer++;
            return;
        }
        for(int column = 0; column < n; column++) {
            location[row] = column; //퀸의 위치 (row, column)
            if(able(row)) {
                nQueen(n, row + 1);
            }
        }
    }

    public int solution(int n) {
        location = new int[n];
        nQueen(n, 0);

        return answer;
    }
}
