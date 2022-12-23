package LeetcodeLevel1;

public class FindPivotIndex {
    public static void main(String[] args){
        int[] arr = {1,7,3,6,5,6};
        int res = pivotIndex(arr);
        System.out.println(res);
    }

    public static int pivotIndex(int[] nums) {
        int totalSum = 0;
        for(int i=0;i<nums.length;i++){
            totalSum += nums[i];
        }
        int index = -1;
        for(int i=0;i<nums.length;i++){
            int sumleft = 0;
            for(int j=0;j<i;j++){
                sumleft += nums[j];
            }
            int dataright = totalSum - sumleft - nums[i];
            if( dataright == sumleft){
                index = i;
                break;
            }
        }
        return index;
    }
}
