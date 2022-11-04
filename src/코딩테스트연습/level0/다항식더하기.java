package 코딩테스트연습.level0;

public class 다항식더하기 {
    public String solution(String polynomial) {
        StringBuilder answer = new StringBuilder();
        String[] temp = polynomial.split(" ");

        int variable = 0;
        int constant = 0;
        for(String str : temp) {
            if(str.contains("x")) {
                if(str.replace("x", "").length() == 0) {
                    variable += 1;
                } else {
                    variable += Integer.parseInt(str.replace("x", ""));
                }

            } else if(str.equals("+")) {
            } else {
                constant += Integer.parseInt(String.valueOf(str));
            }
        }

        if(constant == 0 && variable != 0) {
            if(variable == 1) {
                answer.append("x");
            } else {
                answer.append(variable).append("x");
            }
        } else if(variable == 0 && constant != 0) {
            answer.append(constant);
        } else if(variable == 0) {
            answer.append(0);
        } else {
            if(variable == 1) {
                answer.append("x + ").append(constant);
            } else {
                answer.append(variable).append("x + ").append(constant);
            }
        }

        return answer.toString();
    }
}
