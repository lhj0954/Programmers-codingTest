package 코딩테스트연습.level0;

public class 이진수더하기 {
    public String solution(String bin1, String bin2) {
        StringBuilder answer = new StringBuilder();

        int index_1 = bin1.length() - 1;
        int index_2 = bin2.length() - 1;
        int carry = 0;

        while(index_1 >= 0 || index_2 >= 0) {
            int sum = 0;
            if(index_1 < 0) {
                sum = Integer.parseInt(String.valueOf(bin2.charAt(index_2))) + carry;
            } else if (index_2 < 0) {
                sum = Integer.parseInt(String.valueOf(bin1.charAt(index_1))) + carry;
            } else {
                sum = Integer.parseInt(String.valueOf(bin1.charAt(index_1))) + Integer.parseInt(String.valueOf(bin2.charAt(index_2))) + carry;
            }

            System.out.println(sum);

            switch(sum) {
                case 0:
                    answer.insert(0, "0");
                    break;
                case 1:
                    answer.insert(0, "1");
                    carry = 0;
                    break;
                case 2:
                    answer.insert(0, "0");
                    carry = 1;
                    break;
                case 3:
                    answer.insert(0, "1");
                    carry = 1;
                    break;
            }

            index_1--;
            index_2--;
        }

        if(carry == 1) {
            answer.insert(0, "1");
        }

        return answer.toString();
    }
}
