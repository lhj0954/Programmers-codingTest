package 코딩테스트연습.level2;

import java.util.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class 방금그곡 {
    public static int getTime (String time1, String time2) {
        long differ = 0;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
            Date date1 = sdf.parse(time1);
            Date date2 = sdf.parse(time2);
            long timeMill1 = date1.getTime();
            long timeMill2 = date2.getTime();
            differ = (timeMill2 - timeMill1) / 60000;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return (int) differ;
    }

    public static String[] toArray (String str) {
        List<String> list = new ArrayList<>();
        for(int i = 0; i < str.length(); i++) {
            if(i != str.length() - 1 && str.charAt(i + 1) == '#') {
                list.add(str.substring(i, i + 2));
                i++;
            } else {
                list.add(String.valueOf(str.charAt(i)));
            }
        }
        return list.toArray(String[]::new);
    }
    public static String solution(String m, String[] musicinfos) {
        String answer = "(None)";

        String[] mList = toArray(m);
        Map<String, Integer> map = new HashMap<>();
        for(String musicinfo : musicinfos) {
            String[] temp = musicinfo.split(",");
            int time = getTime(temp[0], temp[1]);
            String[] melody;
            if(temp[3].length() >= time) {
                StringBuilder sb = new StringBuilder();
                for(int i = 0; i < sb.length(); i++) {
                    sb.append(temp[3].charAt(i));
                }
                melody = toArray(sb.toString());
            } else {
                StringBuilder sb = new StringBuilder(temp[3]);
                for(int i = temp[3].length(); i < time; i++) {
                    sb.append(temp[3].charAt(i % temp[3].length()));
                }
                melody = toArray(sb.toString());
            }

            for(int i = 0; i < melody.length - mList.length; i++) {
                boolean contain = true;
                for(int j = 0; j < mList.length; j++) {
                    if(!melody[i + j].equals(mList[j])) {
                        contain = false;
                        break;
                    }
                }
                if(contain) {
                    map.put(temp[2], time);
                }
            }
        }

        for(String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }

        return answer;
    }

    public static void main(String[] args) {
        String m = "ABCDEFG";
        String[] mi = {"12:00,12:14,HELLO,CDEFGAB", "13:00,13:05,WORLD,ABCDEF"};
        solution(m, mi);
    }
}
