package 코딩테스트연습.level2;

import java.util.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class 방금그곡 {
    public String solution(String m,String[] musicinfos){
        String answer = "(None)";
        int maxtime = 0;
        for(int i = 0; i<m.length();i++){
            m = m.replace("A#","a");
            m = m.replace("C#","c");
            m = m.replace("D#","d");
            m = m.replace("F#","f");
            m = m.replace("G#","g");
            m = m.replace("E#","e");
        }

        for(int i = 0; i< musicinfos.length;i++) {
            String[] tmp = musicinfos[i].split(",");

            tmp[3] = tmp[3].replace("A#","a");
            tmp[3] = tmp[3].replace("C#","c");
            tmp[3] = tmp[3].replace("D#","d");
            tmp[3] = tmp[3].replace("F#","f");
            tmp[3] = tmp[3].replace("G#","g");
            tmp[3] = tmp[3].replace("E#","e");


            String[] starttime = tmp[0].split(":");
            String[] endtime = tmp[1].split(":");

            int hour = Integer.parseInt(endtime[0]) - Integer.parseInt(starttime[0]);
            int min = Integer.parseInt(endtime[1]) - Integer.parseInt(starttime[1]) + (hour * 60);

            String meltmp = "";
            for(int j = 0; j<min;j++){
                meltmp += tmp[3].charAt(j%tmp[3].length());
            }
            //System.out.println(meltmp); 노래가 진행되는 동안의 음들
            if(meltmp.contains(m)){
                if(maxtime < meltmp.length()){
                    maxtime = meltmp.length();
                    answer = tmp[2];
                }
            }
        }
        return answer;
    }

}
/*public static int getTime (String time1, String time2) {
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
        Map<String, Integer> map = new LinkedHashMap<>();
        for(String musicinfo : musicinfos) {
            String[] temp = musicinfo.split(",");
            int time = getTime(temp[0], temp[1]);
            String[] melody;
            if(temp[3].length() >= time) {
                StringBuilder sb = new StringBuilder();
                for(int i = 0; i < time; i++) {
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

        List<String> list = new ArrayList<>(map.keySet());
        list.sort((s1, s2) -> map.get(s2) - map.get(s1));
        //list.sort(Comparator.comparingInt(map::get));

        if(map.size() > 0) {
            answer = list.get(0);
        }

        return answer;
    }*/