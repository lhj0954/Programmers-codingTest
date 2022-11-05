package 코딩테스트연습.level1;

import java.util.Stack;

public class 햄버거만들기 {
    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for(int i : ingredient) {
            stack.push(i);
            StringBuilder burger = new StringBuilder();
            if(stack.size() >= 4) {
                burger
                        .append(stack.get(stack.size() - 4))
                        .append(stack.get(stack.size() - 3))
                        .append(stack.get(stack.size() - 2))
                        .append(stack.get(stack.size() - 1));
                if(burger.toString().equals("1231")) {
                    answer++;
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    stack.pop();
                }
            }
        }

        return answer;
    }
}
