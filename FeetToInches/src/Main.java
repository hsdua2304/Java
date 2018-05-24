/**
 * Created by Harmandeep on 23-05-2018.
 */
public class Main {

    public static void main(String arg[]){
        calcFeetandInchesToCentimeters(1,13);
        calcFeetandInchesToCentimeters(123);
    }

    public static double calcFeetandInchesToCentimeters(double feet, double inches){
        if(feet <= 0){
            System.out.println("Feet must be greater than 0");
            return -1;
        } else if(inches <= 0 || inches >= 12){
            System.out.println("Inches must be in range 0 to 12");
            return -1;
        }else{
            double feetToCent = 30.48 * feet;
            double inchToCent = 2.54 * inches;
            System.out.println(feetToCent + inchToCent + " cm.");
            return feetToCent + inchToCent;
        }
    }

    public static double calcFeetandInchesToCentimeters(double inches){
        if(inches <= 0){
            System.out.println("Inches must be greater than 0");
            return -1;
        } else{
            double feet = inches/12;s
            double inch = inches%12;
            return calcFeetandInchesToCentimeters(feet,inch);
        }
    }
}
