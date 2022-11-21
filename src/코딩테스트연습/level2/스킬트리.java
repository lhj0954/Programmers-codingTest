package 코딩테스트연습.level2;

import java.util.ArrayList;
import java.util.List;

public class 스킬트리 {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;

        for(String skill_tree : skill_trees) {
            boolean good = true;
            List<Character> list = new ArrayList<>();
            for(int i = 0; i < skill.length(); i++) {
                list.add(skill.charAt(i));
            }
            for(int i = 0; i < skill_tree.length(); i++) {
                char temp = skill_tree.charAt(i);
                if(list.contains(temp)) {
                    if(list.get(0) == temp) {
                        list.remove(0);
                    } else {
                        good = false;
                        break;
                    }
                }
            }
            if(good) {
                answer++;
            }
        }

        return answer;
    }
}
