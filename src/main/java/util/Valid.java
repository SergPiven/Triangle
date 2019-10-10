package util;

public class Valid {
    public static boolean checkDoubleToZero(double number) {
        if (number == 0) {
            return true;
        }
        return false;
    }

    public static boolean checkDoubleToPositive(double number) {
        if (number > 0) {
            return true;
        }
        return false;
    }

    public static boolean checkStrForNumber(String str){
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) < '0' || str.charAt(i) > '9'){
                return false;
            }
        }
        return true;
    }
}
