package WeekThree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaximumPerimeterTriangle {
    public static void main(String[] args){
        Integer[] arr1 = {1,5,4,3,2,6};
        List<Integer> arr = new ArrayList<>();
        Collections.addAll(arr,arr1);
        Collections.sort(arr);
        // data ko sort kar lenge ..
        // fir lastIndex wala value agar less than huaa 2 phele wala index
        // wala value se toh triangle ban jaega ..
        // last wala value ko koi jarurat nahi hai kisi aur value se check karne ka kue
        // agar check bhi karenge toh hamesha impossible hoga triangle banane ko
        // eg: 1,2,3,4,5,6 after sorting
        // agar 4+5 > 6 answer yehi triangle
        Integer maxPerimeter = 0;
        for(int i=0;i<arr.size()-2;i++){
            int k = arr.size() - i - 3;
            if(arr.get(k+2) < (arr.get(k+1) + arr.get(k))){
                maxPerimeter = arr.get(k+2) + arr.get(k+1) + arr.get(k);
                break;
            }
        }
		
		
		
		
		
        System.out.println(maxPerimeter);


    }
}
