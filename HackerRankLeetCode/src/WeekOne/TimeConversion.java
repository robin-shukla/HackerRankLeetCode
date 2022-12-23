package WeekOne;

public class TimeConversion {
    public static void main(String[] args){
        String s = "12:05:45AM";
        String res = timeConversion(s);
        System.out.println(res);
    }

    public static String timeConversion(String s) {
        String amPm = s.substring(8);
        String conversion = "";
        if(amPm.equals("AM")){
            if(Integer.valueOf(s.substring(0,2))==12){
                conversion = "00" + s.substring(2,8);
            }else
                conversion = s.substring(0,8);
        }
        else{
            if(Integer.valueOf(s.substring(0,2))==12){
            conversion = "12" + s.substring(2,8);
            }else {
                conversion = (Integer.valueOf(s.substring(0, 2)) + 12) + s.substring(2, 8);
            }
        }
        return conversion;
    }
}
