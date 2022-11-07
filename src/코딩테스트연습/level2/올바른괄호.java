package 코딩테스트연습.level2;

import java.util.Stack;

public class 올바른괄호 {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')' && !stack.empty()) {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }

        if(stack.size() > 0) {
            return false;
        }

        return answer;
    }
}
//boolean solution(String s) {
//        boolean answer = true;
//        Stack<Character> stack = new Stack<>();
//
//        for(int i = 0; i < s.length(); i++) {
//            stack.push(s.charAt(i));
//            if(stack.size() > 1) {
//                StringBuilder temp = new StringBuilder();
//                temp.append(stack.get(stack.size() - 2)).append(stack.peek());
//                if(temp.toString().equals("()")) {
//                    stack.pop();
//                    stack.pop();
//                }
//            }
//        }
//
//        if(stack.size() != 0) {
//            answer = false;
//        }
//
//        return answer;
//    }
