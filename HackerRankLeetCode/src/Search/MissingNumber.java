package Search;

import java.util.*;

public class MissingNumber {
    public static void main(String[] args){
        Integer[] a = {203,204,205,206,207,208,203,204,205,206};
        Integer[] b = {203,204,204,205,206,207,205,208,203,206,205,206,204};
        List<Integer> arr = new ArrayList<>();
        Collections.addAll(arr,a);
        List<Integer> brr = new ArrayList<>();
        Collections.addAll(brr,b);
        Map<Integer,Integer> map = new HashMap<>();
        for(Integer brrr : brr){
            if(map.get(brrr)!=null){
                map.put(brrr,map.get(brrr)+1);
            }else{
                map.put(brrr,1);
            }
        }
        List<Integer> res = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            Integer count = 0;
            for(int i=0;i<arr.size();i++){
                // if((arr.get(i))==(key)) yeh kue nahi kaam kar raha hai
                // == checks if both objects point to the same memory location whereas . equals()
                // evaluates to the comparison of values in the objects
                if((arr.get(i)).equals(key)){
                    count++;
                    if(count == value)
                        break;
                }
            }
            if(count<value)
                res.add(key);
        }
        System.out.println(res);
       /* // Write your code here
        arr.forEach((i) -> brr.remove(i));
//removed the elements of arr from brr
//using removeAll removes all the occurances of an object
        Set<Integer> set = new HashSet<>(brr);
// created HashSet so as to store unique elements only
        brr.clear();
// cleared the brr array as it may contain duplicate elements
        brr.addAll(set);
        Collections.sort(brr);
//Finally added the elements of set to list and sorted to ascending order

        return brr;*/

    }
}
