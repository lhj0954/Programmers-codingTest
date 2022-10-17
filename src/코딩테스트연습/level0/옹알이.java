package 코딩테스트연습.level0;

public class 옹알이 {
    public static int solution(String[] babbling) {
        for(int i = 0; i < babbling.length; i++) {
            babbling[i] = babbling[i].replaceAll("aya", "1");
            babbling[i] = babbling[i].replaceAll("ye", "2");
            babbling[i] = babbling[i].replaceAll("woo", "3");
            babbling[i] = babbling[i].replaceAll("ma", "4");
        }

        int answer = 0;
        for (int i = 0; i < babbling.length; i++) {
            boolean accept = true;
            if (babbling[i].charAt(0) > 96) {
                continue;
            } else {
                for (int j = 1; j < babbling[i].length(); j++) {
                    if (babbling[i].charAt(j) > 96 || babbling[i].charAt(j) == babbling[i].charAt(j - 1)) {
                        accept = false;
                        break;
                    }
                }
            }

            if (accept) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] arr = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
        System.out.println(solution(arr));
    }
}
//yemawoe