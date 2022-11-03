package 코딩테스트연습.level0;

public class 캐릭터의좌표 {
    public int[] solution(String[] keyinput, int[] board) {
        int ud = 0;
        int lr = 0;

        for(String input : keyinput) {
            switch(input) {
                case "up":
                    if(ud < board[1] / 2) {
                        ud++;
                    }
                    break;
                case "down":
                    if(ud > (board[1] / 2) * (-1)) {
                        ud--;
                    }
                    break;
                case "right":
                    if(lr < board[0] / 2) {
                        lr++;
                    }
                    break;
                case "left":
                    if(lr > (board[0] / 2) * (-1)) {
                        lr--;
                    }
                    break;
            }
        }

        return new int[]{lr, ud};
    }
}
