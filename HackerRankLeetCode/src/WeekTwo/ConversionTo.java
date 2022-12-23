package WeekTwo;

public class ConversionTo {
    public static void main(String[] args){
        int a = 6;
        int rem =0;
        int result =0;
        int[] arr = new int[32];
        for(int i=0;i<32;i++){
            arr[i]=0;
        }
        for(int i =31;i>=0;i--){
            rem = a%2;
            a = a/2;
            arr[i] = rem;
            if(a==0)
                break;
        }
        for(int i=0;i<32;i++){
            if(arr[i]==0)
                arr[i]=1;
            else
                arr[i]=0;
        }
        for(int i=0;i<32;i++){
            result += arr[i] * Math.pow(2,31 - i);
        }
        System.out.println(result);
    }
}
