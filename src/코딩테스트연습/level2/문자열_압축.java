package 코딩테스트연습.level2;

import java.util.*;

public class 문자열_압축 {
    public  int solution(String s) {
        int answer = Integer.MAX_VALUE;

        if(s.length() == 1) {
            return 1;
        }

        for(int i = 1; i <= s.length() / 2; i++) {
            List<String> list = new ArrayList<>();
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < s.length(); j++) {
                sb.append(s.charAt(j));
                if((sb.length() == i) || (j == s.length() - 1)) {
                    list.add(sb.toString());
                    sb.setLength(0);
                }
            }

            StringBuilder sb2 = new StringBuilder();
            int count = 1;
            for(int k = 0; k < list.size(); k++) {
                if(((k + 1) < list.size()) && (list.get(k).equals(list.get(k + 1)))) {
                    count += 1;
                } else {
                    if(count == 1) {
                        sb2.append(list.get(k));
                    } else {
                        sb2.append(count).append(list.get(k));
                    }

                    count = 1;
                }
            }

            if(sb2.length() < answer) {
                answer = sb2.length();
            }
        }

        return answer;
    }
}
