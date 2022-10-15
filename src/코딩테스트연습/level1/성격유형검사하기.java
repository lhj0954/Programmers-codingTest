package 코딩테스트연습.level1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 성격유형검사하기 {
    public static String solution(String[] survey, int[] choices) {
        StringBuilder answer = new StringBuilder();
        Map<String, Integer> chart = new HashMap<>();
        String[] index = {"R","T","C","F","J","M","A","N"};
        for (int i = 0; i < index.length; i++) {
            chart.put(index[i], 0);
        }

        for (int i = 0; i < survey.length; i++) {
            switch (choices[i]) {
                case 1:
                    chart.put(survey[i].substring(0, 1), chart.get(survey[i].substring(0, 1)) + 3);
                    break;
                case 2:
                    chart.put(survey[i].substring(0, 1), chart.get(survey[i].substring(0, 1)) + 2);
                    break;
                case 3:
                    chart.put(survey[i].substring(0, 1), chart.get(survey[i].substring(0, 1)) + 1);
                    break;
                case 5:
                    chart.put(survey[i].substring(1, 2), chart.get(survey[i].substring(1, 2)) + 1);
                    break;
                case 6:
                    chart.put(survey[i].substring(1, 2), chart.get(survey[i].substring(1, 2)) + 2);
                    break;
                case 7:
                    chart.put(survey[i].substring(1, 2), chart.get(survey[i].substring(1, 2)) + 3);
                    break;
            }
        }

        if (chart.get("R") >= chart.get("T")) {
            answer.append("R");
        } else {
            answer.append("T");
        }

        if (chart.get("C") >= chart.get("F")) {
            answer.append("C");
        } else {
            answer.append("F");
        }

        if (chart.get("J") >= chart.get("M")) {
            answer.append("J");
        } else {
            answer.append("M");
        }

        if (chart.get("A") >= chart.get("N")) {
            answer.append("A");
        } else {
            answer.append("N");
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
        int[] choices = {5, 3, 2, 7, 5};
        System.out.println(solution(survey, choices));
    }
}
//rt/cf/jm/an
