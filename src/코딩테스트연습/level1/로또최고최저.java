package 코딩테스트연습.level1;

public class 로또최고최저 {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int hope = 6;
        int real = 0;

        for(int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0) {
                hope++;
                real--;
            } else {
                for(int j = 0; j < win_nums.length; j++) {
                    if(lottos[i] == win_nums[j]) {
                        hope++;
                        real++;
                    }
                }
            }
        }

        switch (hope) {
            case 6 :
                hope = 1;
                break;
            case 5 :
                hope = 2;
                break;
            case 4 :
                hope = 3;
                break;
            case 3 :
                hope = 4;
                break;
            case 2 :
                hope = 5;
                break;
            default :
                hope = 6;
                break;
        }
        switch (real) {
            case 6 :
                real = 1;
                break;
            case 5 :
                real = 2;
                break;
            case 4 :
                real = 3;
                break;
            case 3 :
                real = 4;
                break;
            case 2 :
                real = 5;
                break;
            default :
                real = 6;
                break;
        }

        return new int[]{hope, real};
    }
}
