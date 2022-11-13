package 코딩테스트연습.level2;

import java.util.HashMap;

public class 전화번호목록 {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0 ; i < phone_book.length ; i++)
            map.put(phone_book[i],i);

        for (String s : phone_book)
            for (int j = 1; j < s.length(); j++)
                if (map.containsKey(s.substring(0, j))) return false; //맵을 통해 containsKey로 효율성 올림
        return answer;
    }
}

//                                 <효율성 문제>
//    public boolean solution(String[] phone_book) {
//        boolean answer = true;
//        HashMap<String, Integer> map = new HashMap<>();
//        for(int i = 0 ; i < phone_book.length ; i++)
//            map.put(phone_book[i],i);
//
//        for(int i = 0 ; i < phone_book.length ; i++)
//            for(int j = 1 ; j < phone_book[i].length() ; j++ )
//                if(map.containsKey(phone_book[i].substring(0,j)))  return false;
//        return answer;
//    }