package WeekOne;

import java.util.ArrayList;
import java.util.List;

public class BreakingRecords {
    public static void main(String[] args){
        List<Integer> arr = new ArrayList<>();
        arr.add(12);
        arr.add(24);
        arr.add(10);
        arr.add(24);
        List<Integer> res = breakingRecords(arr);
    }

    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here
        List<Integer> res = new ArrayList<>();
        int min = scores.get(0);
        int max = scores.get(0);
        int minpoint =0;
        int maxpoint =0;
        for (int i = 1; i < scores.size(); i++) {
            if(min > scores.get(i)) {
                min = scores.get(i);
                minpoint += 1;
            }
            if(max < scores.get(i)) {
                max = scores.get(i);
                maxpoint += 1;
            }
        }
        res.add(maxpoint);
        res.add(minpoint);
        return res;
    }

}
