package WeekOne;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SparseArrays {
    public static void main(String args[]){
        String[] input = {"ab","abc","acb"};
        String[] queries = {"ab","abc","ac"};
        Map<String,Integer> map = new HashMap<>();
        for(int i =0;i<queries.length;i++){
            map.put(queries[i],0);
            for(int j=0;j<input.length;i++){
                if(queries[i].equals(input[j])){
                    map.put(queries[i],map.get(queries[i])+1);
                }
            }
        }
        List<Integer> res = new ArrayList<>();
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            res.add(entry.getValue());
        }

    }
}
