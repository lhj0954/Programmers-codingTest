package 코딩테스트연습.level2;

import java.util.Stack;

public class 괄호회전하기 {
    public int solution(String s) {
        int answer = 0;
        StringBuilder sb = new StringBuilder(s);

        for(int i = 0; i < s.length(); i++) {
            Stack<Character> stack = new Stack<>();
            for(int j = 0; j < sb.length(); j++) {
                char temp = sb.charAt(j);
                if(!stack.empty()) {
                    if(temp == ']' && stack.peek() == '[') {
                        stack.pop();
                    } else if(temp == ')' && stack.peek() == '(') {
                        stack.pop();
                    } else if(temp == '}' && stack.peek() == '{') {
                        stack.pop();
                    } else {
                        stack.push(temp);
                    }
                } else {
                    stack.push(temp);
                }
            }
            if(stack.empty()) {
                answer++;
            }
            sb.append(sb.charAt(0));
            sb.deleteCharAt(0);
        }

        return answer;
    }
}
