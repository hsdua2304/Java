/**
 * Created by Harmandeep on 15-05-2018.
 */
public class megabytes {
        public static void main(String args[]) {
            //printMegsBytesAndKiloBytes(1024);
            //System.out.println(bark(true,1));
            //System.out.println(bark(false,2));
            //System.out.println(bark(true,8));
            //System.out.println(bark(true,-1));
            System.out.println(isLeapYear(-1600));
            System.out.println(isLeapYear(1600));
            System.out.println(isLeapYear(2017));
            System.out.println(isLeapYear(2000));
        }
        public static void printMegsBytesAndKiloBytes(int kiloBytes){

            int megaBytes = kiloBytes/1024;
            int remainder = kiloBytes%1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainder + " KB");
        }

    public static boolean bark(boolean barking,int hourOfDay){

        if(hourOfDay > -1 && hourOfDay < 24){
            if (hourOfDay < 8 | hourOfDay > 22) {
                if (barking == true) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else{
            System.out.println("Invalid Value");
            return false;

        }
    }

    public static boolean isLeapYear(int year){

        if(year > 0 & year < 10000) {

            if ((year % 4 == 0 | year % 100 != 0) && year % 400 == 0 ) {
                return true;
            } else {
                return false;
            }
        } else{
            return false;
        }
    }
}



