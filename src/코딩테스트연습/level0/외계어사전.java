package 코딩테스트연습.level0;

public class 외계어사전 {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;

        for(int i = 0; i < dic.length; i++) {
            String temp = dic[i];
            int count = 0;
            for(int j = 0; j < spell.length; j++) {
                if(temp.contains(spell[j])) {
                    temp = temp.replaceFirst(spell[j], "");
                    count++;
                }
            }

            if(temp.length() == 0 && count == spell.length) {
                answer = 1;
            }
        }

        return answer;
    }
}
