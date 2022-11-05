package 코딩테스트연습.level1;

public class 푸드파이트대회 {
    public String solution(int[] food) {
        StringBuilder answer = new StringBuilder("0");

        for(int i = food.length - 1; i > 0; i--) {
            String str = String.valueOf(i).repeat(food[i] / 2);
            answer.insert(0, str);
            answer.append(str);
        }

        return answer.toString();
    }
}
