package 코딩테스트연습.level2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 오픈채팅방 {
    public String[] solution(String[] record) {
        String[] answer;
        List<String> arr = new ArrayList<>();
        int k = 0;
        Map<String, String> hsmap = new HashMap<>();
        String[] msg;
        for(int i = 0; i < record.length; i++){
            msg = record[i].split(" ");
            if(msg.length > 2){
                hsmap.put(msg[1],msg[2]);
            }
        }
        for(int i = 0; i < record.length; i++) {
            msg = record[i].split(" ");
            if(msg[0].charAt(0) == 'C') continue;
            if(msg[0].charAt(0) == 'E') arr.add(hsmap.get(msg[1])+"님이 들어왔습니다.");
            else arr.add(hsmap.get(msg[1])+"님이 나갔습니다.");
        }
        answer = new String[arr.size()];
        arr.toArray(answer);
        return answer;
    }
}
/*
* public String[] solution(String[] record) {
        Map<String, String> userId = new HashMap<>(); //유저아이디, 닉네임
        List<String> list = new ArrayList<>(); // 유저아이디 + 들어감 나감 장부
        for(String rec : record) {
            String[] temp = rec.split(" ");
            if(temp[0].equals("Leave")) {
                list.add(temp[0] + " " + temp[1]);
            } else {
                userId.put(temp[1], temp[2]);
                if(temp[0].equals("Enter")) {
                    list.add(temp[0] + " " + temp[1]);
                }
            }
        }

        String[] answer = new String[list.size()];
        int index = 0;
        for(String s : list) {
            String[] temp = s.split(" ");
            if(temp[0].equals("Enter")) {
                answer[index] = userId.get(temp[1]) + "님이 들어왔습니다.";
            } else {
                answer[index] = userId.get(temp[1]) + "님이 나갔습니다,";
            }
            index++;
        }

        return answer;
    }
* */
