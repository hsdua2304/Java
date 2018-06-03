import java.util.ArrayList;

/**
 * Created by Harmandeep on 02-06-2018.
 */
 class IntClass{
    private int intValue;

    public IntClass(int intValue) {
        this.intValue = intValue;
    }

    public int getIntValue() {
        return intValue;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }
}

public class Main {

    public static void main(String args[]){
        ArrayList<IntClass> myIntArray = new ArrayList<>();
        for(int i =0 ; i < 10; i++){
            myIntArray.add(new IntClass(i));
        }

        for(int i =0 ; i < 10; i++){
            System.out.println(myIntArray.get(i).getIntValue());
        }

        ArrayList<Integer> myIntegerList = new ArrayList<>();
        for(int i =10 ; i < 20; i++){
            myIntegerList.add(Integer.valueOf(i));
        }

        for(int i =0 ; i < 10; i++){
            System.out.println(myIntegerList.get(i).intValue());
        }

        ArrayList<Double> myDoubleList = new ArrayList<>();
        for(double i =20.0 ; i < 30.0; i+= 0.5){
            myDoubleList.add(Double.valueOf(i));
        }

        for(int i =0 ; i < myDoubleList.size(); i++){
            System.out.println(myDoubleList.get(i).doubleValue());
        }

    }


}
