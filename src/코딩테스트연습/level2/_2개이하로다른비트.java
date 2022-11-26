package 코딩테스트연습.level2;

import java.util.Arrays;

public class _2개이하로다른비트 {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];

        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 4 == 3) {
                long temp = numbers[i];
                int cnt = 0;
                while(temp % 2 != 0) {
                    temp /= 2;
                    cnt++;
                }
                answer[i] = numbers[i] + (long)Math.pow(2, cnt) - (long)Math.pow(2, cnt - 1);
            } else {
                answer[i] = numbers[i] + 1;
            }
        }

        return answer;
    }
}
/*
[시간 초과]
public static long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        int index = 0;
        for(long number : numbers) {
            long temp = number + 1;
            while(true) {
                long temp2 = temp;
                long num = number;
                int cnt = 0;
                for(; temp2 > 0; temp2 /= 2) {
                    if(temp2 % 2 != num % 2) {
                        cnt++;
                    }
                    num /= 2;
                }
                if(cnt <= 2) {
                    break;
                }
                temp++;
            }
            answer[index] = temp;
            index++;
        }

        return answer;
    }
* */
