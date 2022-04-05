package CodingTest.Question3;

import java.util.LinkedHashMap;
import java.util.Map;

public class numLetters {
    public static void main(String[] args) {
        Map<Character,Integer> m1 = new LinkedHashMap<>();
        String str = "Harry Potter in his magical Island";
        char[] ch = str.replaceAll(" ", "").toCharArray();
        for (char c : ch) {
            if(m1.containsKey(c)){
                m1.put(c,m1.get(c)+1);
            }else{
                m1.put(c, 1);
            }
        }
        //for(Map.Entry<Character,Integer> entry : m1.entrySet()){
          //  System.out.println(entry.getKey()+" "+entry.getValue());
        //}
        int maxnum=0;
        char maxchar=0;
        for (Map.Entry<Character,Integer> entry : m1.entrySet()) {
            if(entry.getValue()>maxnum){
                maxnum = entry.getValue();
                maxchar = entry.getKey();
            }
        }
        System.out.println("maximum "+maxchar+" "+maxnum);
    }
}
