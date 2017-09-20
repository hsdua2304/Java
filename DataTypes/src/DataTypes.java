/**
 * Created by harmdua on 3/31/2017.
 */
public class DataTypes {
    public static void main(String[] args) {
        byte myByteValue = 127;
        byte resultByte = (byte) (myByteValue / 2);
        System.out.println("Byte result = " + resultByte);

        short myShortValue = 32345;
        short resultShort = (short) (myShortValue / 2);
        System.out.println("Short result = " + resultShort);

        int myIntValue = 272272727;
        int resultInt = (myIntValue / 2);
        System.out.println("Int result = " + resultInt);

        long myLongValue = 50000L + 10L * (myByteValue + myIntValue + myShortValue);
        System.out.println("Long result = " + myLongValue);

        float myFloatValue = 5.02f;
        double myDoubleValue = 5.34d;
        System.out.println("Float result = " + myFloatValue + " Double result = " + myDoubleValue);

        double pound = 200d;
        double kilograms = 0.45359237d * pound;
        System.out.println("Result = " + kilograms);

        char myChar = '\u00AE';
        System.out.println("Char result = " + myChar);

        boolean myBoolean = false;
        System.out.println("My Boolean = " + myBoolean);

        String myString = "This is my first string";
        System.out.println(myString);
        String lastString = "10";
        int myInteger = 20;
        lastString = lastString + myInteger;
        System.out.println(lastString);

        boolean isCar = false;
        boolean wasCar = isCar ? false : true;
        if (wasCar) {
            System.out.println("YESSSSS");
        }


    }
}
