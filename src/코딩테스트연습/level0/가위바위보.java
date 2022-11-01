package 코딩테스트연습.level0;

public class 가위바위보 {
    public String solution(String rsp) {
        StringBuilder answer = new StringBuilder();

        for(int i = 0; i < rsp.length(); i++) {
            String temp = String.valueOf(rsp.charAt(i));
            if(temp.equals("2")) {
                answer.append("0");
            } else if(temp.equals("0")) {
                answer.append("5");
            } else if(temp.equals("5")) {
                answer.append("2");
            }
        }

        return answer.toString();
    }
}
