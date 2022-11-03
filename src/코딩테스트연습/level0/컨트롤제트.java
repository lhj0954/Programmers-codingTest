package 코딩테스트연습.level0;

import java.util.Stack;

public class 컨트롤제트 {
    public int solution(String s) {
        int answer = 0;
        String[] arr = s.split(" ");
        Stack<Integer> stack = new Stack<>();

        for(String str : arr) {
            if(str.equals("Z")) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(str));
            }
        }

        for(Integer i : stack) {
            answer += i;
        }

        return answer;
    }
}
