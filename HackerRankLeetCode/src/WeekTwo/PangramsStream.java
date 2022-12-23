package WeekTwo;

import java.util.Arrays;

public class PangramsStream {
    public static void main(String[] args){
        String s = "We promptly judged antique ivory buckles for the prize";
        int[] arr = new int[26];
        for(int i=0;i<26;i++){
            arr[i] = 0;
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ')
                continue;
            int c = Character.toLowerCase(s.charAt(i));
            arr[c - 97]++;
        }
        Arrays.stream(arr).forEach(e-> System.out.println(e));
        boolean flag = Arrays.stream(arr).allMatch(e->e > 0);
        System.out.println(flag);
    }
}
