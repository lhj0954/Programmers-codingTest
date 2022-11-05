package 코딩테스트연습.level1;

public class 키패드누르기 {
    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();
        String[][] pad = {{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}, {"*", "0", "#"}};
        int[] left = {3, 0}; // "*" 위치
        int[] right = {3, 2}; // "#" 위치

        for(int number : numbers) {
            switch(number) {
                case 1:
                    left[0] = 0;
                    left[1] = 0;
                    answer.append("L");
                    break;
                case 4:
                    left[0] = 1;
                    left[1] = 0;
                    answer.append("L");
                    break;
                case 7:
                    left[0] = 2;
                    left[1] = 0;
                    answer.append("L");
                    break;
                case 3:
                    right[0] = 0;
                    right[1] = 2;
                    answer.append("R");
                    break;
                case 6:
                    right[0] = 1;
                    right[1] = 2;
                    answer.append("R");
                    break;
                case 9:
                    right[0] = 2;
                    right[1] = 2;
                    answer.append("R");
                    break;
                case 2:
                    if(Math.abs(left[0] - 0) + Math.abs(left[1] - 1) <
                            Math.abs(right[0] - 0) + Math.abs(right[1] - 1)) {
                        left[0] = 0;
                        left[1] = 1;
                        answer.append("L");
                        break;
                    } else if(Math.abs(left[0] - 0) + Math.abs(left[1] - 1) >
                            Math.abs(right[0] - 0) + Math.abs(right[1] - 1)) {
                        right[0] = 0;
                        right[1] = 1;
                        answer.append("R");
                        break;
                    } else if(Math.abs(left[0] - 0) + Math.abs(left[1] - 1) ==
                            Math.abs(right[0] - 0) + Math.abs(right[1] - 1)) {
                        if(hand.equals("right")) {
                            right[0] = 0;
                            right[1] = 1;
                            answer.append("R");
                            break;
                        } else {
                            left[0] = 0;
                            left[1] = 1;
                            answer.append("L");
                            break;
                        }
                    }
                case 5:
                    if(Math.abs(left[0] - 1) + Math.abs(left[1] - 1) <
                            Math.abs(right[0] - 1) + Math.abs(right[1] - 1)) {
                        left[0] = 1;
                        left[1] = 1;
                        answer.append("L");
                        break;
                    } else if(Math.abs(left[0] - 1) + Math.abs(left[1] - 1) >
                            Math.abs(right[0] - 1) + Math.abs(right[1] - 1)) {
                        right[0] = 1;
                        right[1] = 1;
                        answer.append("R");
                        break;
                    } else if(Math.abs(left[0] - 1) + Math.abs(left[1] - 1) ==
                            Math.abs(right[0] - 1) + Math.abs(right[1] - 1)) {
                        if(hand.equals("right")) {
                            right[0] = 1;
                            right[1] = 1;
                            answer.append("R");
                            break;
                        } else {
                            left[0] = 1;
                            left[1] = 1;
                            answer.append("L");
                            break;
                        }
                    }
                case 8:
                    if(Math.abs(left[0] - 2) + Math.abs(left[1] - 1) <
                            Math.abs(right[0] - 2) + Math.abs(right[1] - 1)) {
                        left[0] = 2;
                        left[1] = 1;
                        answer.append("L");
                        break;
                    } else if(Math.abs(left[0] - 2) + Math.abs(left[1] - 1) >
                            Math.abs(right[0] - 2) + Math.abs(right[1] - 1)) {
                        right[0] = 2;
                        right[1] = 1;
                        answer.append("R");
                        break;
                    } else if(Math.abs(left[0] - 2) + Math.abs(left[1] - 1) ==
                            Math.abs(right[0] - 2) + Math.abs(right[1] - 1)) {
                        if(hand.equals("right")) {
                            right[0] = 2;
                            right[1] = 1;
                            answer.append("R");
                            break;
                        } else {
                            left[0] = 2;
                            left[1] = 1;
                            answer.append("L");
                            break;
                        }
                    }
                case 0:
                    if(Math.abs(left[0] - 3) + Math.abs(left[1] - 1) <
                            Math.abs(right[0] - 3) + Math.abs(right[1] - 1)) {
                        left[0] = 3;
                        left[1] = 1;
                        answer.append("L");
                        break;
                    } else if(Math.abs(left[0] - 3) + Math.abs(left[1] - 1) >
                            Math.abs(right[0] - 3) + Math.abs(right[1] - 1)) {
                        right[0] = 3;
                        right[1] = 1;
                        answer.append("R");
                        break;
                    } else if(Math.abs(left[0] - 3) + Math.abs(left[1] - 1) ==
                            Math.abs(right[0] - 3) + Math.abs(right[1] - 1)) {
                        if(hand.equals("right")) {
                            right[0] = 3;
                            right[1] = 1;
                            answer.append("R");
                            break;
                        } else {
                            left[0] = 3;
                            left[1] = 1;
                            answer.append("L");
                            break;
                        }
                    }

            }
            System.out.println("left : [" + left[0] + ", "
                    + left[1] + "]");
            System.out.println("right : [" + right[0] + ", "
                    + right[1] + "]");
        }

        return answer.toString();
    }
}
