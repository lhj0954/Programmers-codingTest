package 코딩테스트연습.level1;

import java.util.*;

public class 신고결과받기 {
    public static int[] solution(String[] id_list, String[] report, int k) {
        Map<String, Integer> reported = new HashMap<>();
        for (int i = 0; i < id_list.length; i++) {
            reported.put(id_list[i], 0);
        }

        Map<String, List<String>> report_list = new HashMap<>();
        for (int i = 0; i < id_list.length; i++) {
            List<String> list = new ArrayList<>();
            for (int j = 0; j < report.length; j++) {
                String[] report_split = report[j].split(" ");
                if (report_split[0].equals(id_list[i]) && !list.contains(report_split[1])) {
                    list.add(report_split[1]);
                    reported.put(report_split[1], reported.get(report_split[1]) + 1);
                }
            }
            report_list.put(id_list[i], list);
        }

        int[] answer = new int[id_list.length];
        for (int i = 0; i < id_list.length; i++) {
            String[] arr = report_list.get(id_list[i]).toArray(new String[0]);
            int mail = 0;
            for (int j = 0; j < arr.length; j++) {
                if (reported.get(arr[j]) >= k) {
                    mail++;
                }
            }
            answer[i] = mail;
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        System.out.println(Arrays.toString(solution(id_list, report, 2)));
    }
}
//Map<아이디, 내가 신고한 사람 리스트>