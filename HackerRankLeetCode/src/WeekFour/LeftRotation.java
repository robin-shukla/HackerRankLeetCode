package WeekFour;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeftRotation {
    public static void main(String[] args){
        Integer[] arr1 = {1,2,3,4,5};
        List<Integer> arr = new ArrayList<>();
        Collections.addAll(arr,arr1);
        List<Integer> res = new ArrayList<>();
        int k = 2;
        for(int i=k;i<arr.size();i++){
            res.add(arr.get(i));
        }
        for(int i=0;i<k;i++){
            res.add(arr.get(i));
        }
        System.out.println(res);

    }
}
