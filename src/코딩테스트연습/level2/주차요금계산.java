package 코딩테스트연습.level2;

import java.util.*;

public class 주차요금계산 {
    public static Object[] solution(int[] fees, String[] records) {
        Map<String, Stack<Integer>> time_stack = new TreeMap<>();
        for(String record : records) {
            String[] info = record.split(" ");
            int time = 0;
            String[] temp = info[0].split(":");
            if(info[2].equals("IN")) {
                time = (-1) * ((60 * Integer.parseInt(temp[0]) + Integer.parseInt(temp[1])));
            } else {
                time = 60 * Integer.parseInt(temp[0]) + Integer.parseInt(temp[1]);
            }
            if(!time_stack.containsKey(info[1])) {
                time_stack.put(info[1], new Stack<>());
            }
            time_stack.get(info[1]).push(time);
        }
        for(String str : time_stack.keySet()) {
            if(time_stack.get(str).peek() <= 0) {
                time_stack.get(str).push(23 * 60 + 59);
            }
        }

        List<Integer> list = new ArrayList<>();
        for(String number : time_stack.keySet()) {
            int time_sum = 0;
            while(!time_stack.get(number).empty()) {
                time_sum += time_stack.get(number).pop();
            }
            if(time_sum <= fees[0]) {
                list.add(fees[1]);
            } else {
                list.add((int) (fees[1] + (Math.ceil(((double)time_sum - fees[0]) / fees[2])) * fees[3]));
            }
        }

        return list.toArray();
    }

    public static void main(String[] args) {
        int[] fee = {180, 5000, 10, 600};
        String[] record = {"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"};
        System.out.println(Arrays.toString(solution(fee, record)));
    }
}
