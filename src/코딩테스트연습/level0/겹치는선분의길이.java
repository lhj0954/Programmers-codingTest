package 코딩테스트연습.level0;

import java.util.ArrayList;
import java.util.List;

public class 겹치는선분의길이 {
    public int solution(int[][] lines) {
        int answer = 0;
        List<Integer> list_1 = new ArrayList<>();
        List<Integer> list_2 = new ArrayList<>();
        List<Integer> list_3 = new ArrayList<>();
        List<Integer> list_4 = new ArrayList<>();

        for(int i = -100; i <= 200; i++) {
            if((i >= lines[0][0] && i <= lines[0][1]) && (i >= lines[1][0] && i <= lines[1][1])) {
                list_1.add(i);
            }
        }
        for(int i = -100; i <= 200; i++) {
            if((i >= lines[1][0] && i <= lines[1][1]) && (i >= lines[2][0] && i <= lines[2][1])) {
                list_2.add(i);
            }
        }
        for(int i = -100; i <= 200; i++) {
            if((i >= lines[2][0] && i <= lines[2][1]) && (i >= lines[0][0] && i <= lines[0][1])) {
                list_3.add(i);
            }
        }
        for(int i = -100; i <= 200; i++) {
            if((i >= lines[0][0] && i <= lines[0][1]) && (i >= lines[1][0] && i <= lines[1][1]) && (i >= lines[2][0] && i <= lines[2][1])) {
                list_4.add(i);
            }
        }

        int length_1 = 0;
        int length_2 = 0;
        int length_3 = 0;
        int length_4 = 0;

        if(list_1.size() != 0) {
            length_1 = list_1.size() - 1;
        } else {
            length_1 = 0;
        }
        if(list_2.size() != 0) {
            length_2 = list_2.size() - 1;
        } else {
            length_2 = 0;
        }
        if(list_3.size() != 0) {
            length_3 = list_3.size() - 1;
        } else {
            length_3 = 0;
        }
        if(list_4.size() != 0) {
            length_4 = list_4.size() - 1;
        } else {
            length_4 = 0;
        }

        answer = length_1 + length_2 + length_3 - 2 * length_4;

        return answer;
    }
}
