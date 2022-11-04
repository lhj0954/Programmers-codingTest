package 코딩테스트연습.level0;

public class OX퀴즈 {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        for(int i = 0; i < quiz.length; i++) {
            String[] temp = quiz[i].split(" ");
            int result = 0;

            if(temp[1].equals("+")) {
                result = Integer.parseInt(temp[0]) + Integer.parseInt(temp[2]);
            } else {
                result = Integer.parseInt(temp[0]) - Integer.parseInt(temp[2]);
            }

            if(result == Integer.parseInt(temp[4])) {
                answer[i] = "O";
            } else {
                answer[i] = "X";
            }
        }

        return answer;
    }
}
