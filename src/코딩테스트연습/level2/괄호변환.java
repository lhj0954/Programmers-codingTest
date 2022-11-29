package 코딩테스트연습.level2;

import java.util.*;

public class 괄호변환 {
    public String function (String p) {
        if(good(p)) {
            return p;
        } else {
            StringBuilder u = new StringBuilder();
            int left = 0;
            int right = 0;
            int index = 0;
            do {
                char temp = p.charAt(index);
                if(temp == '(') {
                    left++;
                } else {
                    right++;
                }
                u.append(temp);
                index++;
            } while (left != right);

            String v = p.substring(index);
            if(good(u.toString())) {
                return u.append(function(v)).toString();
            } else {
                StringBuilder temp = new StringBuilder("(");
                temp.append(function(v));
                temp.append(")");
                u.deleteCharAt(0);
                u.deleteCharAt(u.length() - 1);
                for(int i = 0; i < u.length(); i++) {
                    char t = u.charAt(i);
                    if(t == '(') {
                        u.setCharAt(i, ')');
                    } else {
                        u.setCharAt(i, '(');
                    }
                }
                return temp.append(u).toString();
            }
        }
    }

    public boolean good (String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if(stack.size() > 0 && temp == ')' && stack.peek() == '(') {
                stack.pop();
            } else {
                stack.push(temp);
            }
        }
        if(stack.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public String solution(String p) {
        return function(p);
    }
}
