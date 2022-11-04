package 코딩테스트연습.level0;

public class 연속된수의합 {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];

        int start = 0;
        int variable = 0;
        int constant = 0;
        for(int i = 0; i < num; i++) {
            variable++;
            constant += i;
        }

        start = (total - constant) / variable;

        for(int i = 0; i < answer.length; i++) {
            answer[i] = start;
            start++;
        }

        return answer;
    }
}
