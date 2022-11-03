package 코딩테스트연습.level0;

public class 특이한정렬 {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        int[][] array = new int[numlist.length][2];

        for(int i = 0; i < numlist.length; i++) {
            array[i][0] = numlist[i];
            array[i][1] = Math.abs(numlist[i] - n);
        }

        for(int i = 0; i < array.length; i++) {
            for(int j = (i + 1); j < array.length; j++) {
                if(array[i][1] > array[j][1]) {
                    int temp_0 = array[i][0];
                    int temp_1 = array[i][1];
                    array[i][0] = array[j][0];
                    array[i][1] = array[j][1];
                    array[j][0] = temp_0;
                    array[j][1] = temp_1;
                } else if(array[i][1] == array[j][1]) {
                    if(array[i][0] < array[j][0]) {
                        int temp_0 = array[i][0];
                        int temp_1 = array[i][1];
                        array[i][0] = array[j][0];
                        array[i][1] = array[j][1];
                        array[j][0] = temp_0;
                        array[j][1] = temp_1;
                    }
                }
            }
        }

        for(int i = 0; i < array.length; i++) {
            answer[i] = array[i][0];
        }

        return answer;
    }
}
