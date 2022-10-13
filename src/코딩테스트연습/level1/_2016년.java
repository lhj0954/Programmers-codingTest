package 코딩테스트연습.level1;

public class _2016년 {
    public static String solution(int a, int b) {
        String answer = "";
        int days = 0;

        for (int i = 0; i < a; i++) {
            switch (i) {
                case 0:
                    days += 0;
                    break;
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    days += 31;
                    break;
                case 2:
                    days += 29;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    days += 30;
                    break;
            }
        }

        days += b;

        switch (days % 7) {
            case 1:
                answer = "FRI";
                break;
            case 2:
                answer = "SAT";
                break;
            case 3:
                answer = "SUN";
                break;
            case 4:
                answer = "MON";
                break;
            case 5:
                answer = "TUE";
                break;
            case 6:
                answer = "WEN";
                break;
            case 0:
                answer = "THU";
                break;
        }

        return answer;
    }
}
