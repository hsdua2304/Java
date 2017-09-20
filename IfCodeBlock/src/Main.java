/**
 * Created by harmdua on 4/3/2017.
 */
public class Main {
    public static void main(String[] args){

        boolean gameOver = true;
        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your Final score = " + finalScore);
        }
        //Example 1 String to primitive Int
        String nr = "100";
        int result = Integer.parseInt(nr);
        System.out.println(result);
        //Example 2 String to Integer object
        String nr1 = "100";
        Integer result1 = Integer.valueOf(nr1);
        System.out.println(result1);
    }
}

