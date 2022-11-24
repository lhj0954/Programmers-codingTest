package 코딩테스트연습.level2;

import java.util.ArrayList;
import java.util.List;

public class 프렌즈4블록 {
    List<List<Character>> b;
    public int solution(int m, int n, String[] board) {
        b = new ArrayList<>();
        int ans = 0;

        for(int i = 0; i < n; i ++) b.add(new ArrayList<>());
        for(int i = 0; i < n; i ++)
            for(int j = m - 1; j >= 0; j --)
                b.get(i).add(board[j].charAt(i));

        while(true){
            int cnt = 0;
            for(int i = 0; i < n - 1; i ++) // 조건 확인, 소문자로 변경
                for(int j = b.get(i).size() - 1 ; j > 0; j --)
                    check(i, j);

            for(int i = 0; i < n; i ++) // 소문자만 제거
                for(int j = b.get(i).size() - 1 ; j >= 0; j --)
                    if(Character.isLowerCase(b.get(i).get(j))){
                        b.get(i).remove(j);
                        cnt ++;
                    }

            if(cnt == 0) break; // 더 없으면 break
            else ans += cnt;
        }

        return ans;
    }

    public void check(int i , int j){ //인접 4칸 같은지 조건 확인 후 소문자로 바꿔줌
        if(b.get(i).size() <= 1 || j >= b.get(i + 1).size()) return;

        char cUp = Character.toUpperCase(b.get(i).get(j));
        char cLow = Character.toLowerCase(cUp);
        if((b.get(i).get(j - 1) == cUp || b.get(i).get(j - 1) == cLow)
                && (b.get(i + 1).get(j) == cUp || b.get(i + 1).get(j) == cLow)
                && (b.get(i + 1).get(j - 1) == cUp || b.get(i + 1).get(j - 1) == cLow)){
            b.get(i).set(j, cLow);
            b.get(i + 1).set(j, cLow);
            b.get(i + 1).set(j - 1, cLow);
            b.get(i).set(j - 1, cLow);
        }
    }

}
