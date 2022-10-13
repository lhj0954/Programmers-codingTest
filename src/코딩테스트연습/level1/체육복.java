package 코딩테스트연습.level1;

import java.util.Arrays;

public class 체육복 {
    public static int solution(int n, int[] lost, int[] reserve) {
        int[] students = new int[n + 2]; //0번과 마지막 번호 + 1 , 2명이 가상으로 존재한다고 하자.
        Arrays.fill(students, 1);

        for (int i = 0; i < lost.length; i++) {
            students[lost[i]] -= 1;
        }
        for (int i = 0; i < reserve.length; i++) {
            students[reserve[i]] += 1;
        }

        Arrays.sort(lost);

        for (int i = 0; i < lost.length; i++) {
            if (students[lost[i]] == 0 && students[lost[i] - 1] == 2) {
                students[lost[i] - 1] -= 1;
                students[lost[i]] += 1;
            }
            if (students[lost[i]] == 0 && students[lost[i] + 1] == 2) {
                students[lost[i] + 1] -= 1;
                students[lost[i]] += 1;;
            }
        }

        int lost_count = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i] == 0) {
                lost_count++;
            }
        }

        return n - lost_count;
    }

    public static void main(String[] args) {
        int[] lost = {4, 2};
        int[] reserve = {3, 5};
        System.out.println(solution(5, lost, reserve));
    }
}
