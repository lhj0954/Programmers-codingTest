package 코딩테스트연습.level1;

public class 숫자문자열과영단어 {
    public int solution(String s) {
        String str;
        str = s.replace("zero", "0");
        str = str.replace("one", "1");
        System.out.println(str);
        str = str.replace("two", "2");
        str = str.replace("three", "3");
        str = str.replace("four", "4");
        str = str.replace("five", "5");
        str = str.replace("six", "6");
        str = str.replace("seven", "7");
        System.out.println(str);
        str = str.replace("eight", "8");
        System.out.println(str);
        str = str.replace("nine", "9");

        return Integer.parseInt(str);
    }
}
