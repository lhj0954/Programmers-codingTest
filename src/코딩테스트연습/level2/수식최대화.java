package 코딩테스트연습.level2;

public class 수식최대화 {
    public long solution(String expression) {
        long answer = 0;

        List<Long> num = new ArrayList<>();
        List<String> cal = new ArrayList<>();

        int numIdx = 0;
        for (int i = 0; i < expression.length(); i++) {
            switch (expression.charAt(i)) {
                case '*':
                    cal.add(String.valueOf(expression.charAt(i)));
                    num.add(Long.parseLong(expression.substring(numIdx, i)));
                    numIdx = i + 1;
                    break;
                case '+':
                    cal.add(String.valueOf(expression.charAt(i)));
                    num.add(Long.parseLong(expression.substring(numIdx, i)));
                    numIdx = i + 1;
                    break;
                case '-':
                    cal.add(String.valueOf(expression.charAt(i)));
                    num.add(Long.parseLong(expression.substring(numIdx, i)));
                    numIdx = i + 1;
                    break;
            }
        }
        num.add(Long.parseLong(expression.substring(numIdx, expression.length())));

        answer = findMax(num, cal, "*", "+", "-", answer);
        answer = findMax(num, cal, "*", "-", "+", answer);
        answer = findMax(num, cal, "+", "*", "-", answer);
        answer = findMax(num, cal, "-", "*", "+", answer);
        answer = findMax(num, cal, "-", "+", "*", answer);
        answer = findMax(num, cal, "+", "-", "*", answer);

        return answer;
    }

    public long findMax(List<Long> num, List<String> cal, String first, String second, String third, long answer) {
        long result = 0;

        int idx = 0;
        List<Long> tempNum = new ArrayList<>(num);
        List<String> tempCal = new ArrayList<>(cal);
        while (!tempCal.isEmpty()) {
            if (tempCal.indexOf(first) != -1)
                idx = tempCal.indexOf(first);
            else if (tempCal.indexOf(second) != -1)
                idx = tempCal.indexOf(second);
            else
                idx = tempCal.indexOf(third);

            if(idx == -1) break;

            long f = tempNum.remove(idx);
            long e = tempNum.remove(idx);
            String c = tempCal.remove(idx);

            switch (c) {
                case "*":
                    result = f * e;
                    break;
                case "+":
                    result = f + e;
                    break;
                case "-":
                    result = f - e;
                    break;
            }
            tempNum.add(idx, result);
        }

        result = Math.max(answer, Math.abs(result));
        return result;
    }
}
