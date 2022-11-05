package 코딩테스트연습.level1;

public class 옹알이_2 {
    public int solution(String[] babbling) {
        int answer = 0;

        for(int i = 0; i < babbling.length; i++) {
            String bab = babbling[i];
            bab = bab.replaceAll("aya", "1");
            bab = bab.replaceAll("ye", "2");
            bab = bab.replaceAll("woo", "3");
            bab = bab.replaceAll("ma", "4");
            babbling[i] = bab;
        }

        for(String bab : babbling) {
            boolean a = true;
            for(int i = 0; i < bab.length(); i++) {
                if(bab.charAt(i) > 57) {
                    a = false;
                } else {
                    if(i > 0 && bab.charAt(i - 1) == bab.charAt(i)) {
                        a = false;
                    }
                }
            }
            if(a) {
                answer++;
            }
        }

        return answer;
    }
}
