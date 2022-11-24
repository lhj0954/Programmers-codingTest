package 코딩테스트연습.level2;

import java.util.ArrayList;
import java.util.List;

public class 방문길이 {
    public int solution(String dirs) {
        int answer = 0;
        char[] points = dirs.toCharArray();
        List<String> visit = new ArrayList<>();
        int location_x = 0;
        int location_y = 0;

        for(char point : points) {
            StringBuilder temp1 = new StringBuilder(location_x + "," + location_y+ " ");
            StringBuilder temp2 = new StringBuilder(location_x + "," + location_y);
            boolean over = false;
            switch(point) {
                case 'U':
                    location_y++;
                    if(location_y > 5) {
                        location_y--;
                        over = true;
                    }
                    break;
                case 'D':
                    location_y--;
                    if(location_y < -5) {
                        location_y++;
                        over = true;
                    }
                    break;
                case 'R':
                    location_x++;
                    if(location_x > 5) {
                        location_x--;
                        over = true;
                    }
                    break;
                case 'L':
                    location_x--;
                    if(location_x < -5) {
                        location_x++;
                        over = true;
                    }
                    break;
            }

            if(over) {
                continue;
            }

            temp1.append(location_x + "," + location_y);
            temp2.insert(0, location_x + "," + location_y + " ");
            if(!visit.contains(temp1.toString()) || !visit.contains(temp2.toString())) {
                visit.add(temp1.toString());
                visit.add(temp2.toString());
                answer++;
            }
        }

        return answer;
    }
}
