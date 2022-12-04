package 코딩테스트연습.level2;

public class N진수게임 {
    public String solution(int n, int t, int m, int p) {
        int start = 1;
        StringBuilder sb = new StringBuilder("0");
        while(sb.length() <= t * m) {
            int temp = start;
            StringBuilder sb2 = new StringBuilder();
            for(; temp > 0; temp /= n) {
                switch(temp % n) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        sb2.insert(0, temp % n);
                        break;
                    case 10:
                        sb2.insert(0, 'A');
                        break;
                    case 11:
                        sb2.insert(0, 'B');
                        break;
                    case 12:
                        sb2.insert(0, 'C');
                        break;
                    case 13:
                        sb2.insert(0, 'D');
                        break;
                    case 14:
                        sb2.insert(0, 'E');
                        break;
                    case 15:
                        sb2.insert(0, 'F');
                        break;
                }
            }
            sb.append(sb2);
            start++;
        }

        StringBuilder answer = new StringBuilder();
        for(int i = 0; answer.length() <= t; i++) {
            if(i % m == (p - 1)) {
                answer.append(sb.charAt(i));
            }
        }

        return answer.toString();
    }
}
