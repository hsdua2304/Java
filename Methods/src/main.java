import com.sun.media.jfxmedia.events.PlayerStateEvent;

/**
 * Created by Harmandeep on 14-05-2018.
 */
public class main {

    public static void main(String args[]){

        int playerPosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Harman",playerPosition);

        playerPosition = calculateHighScorePosition(500);
        displayHighScorePosition("Natesh",playerPosition);

        playerPosition = calculateHighScorePosition(-100);
        displayHighScorePosition("Harsh",playerPosition);

    }

    public static void displayHighScorePosition(String playerName, int position){

        System.out.println(playerName+" managed to got " + position + " in highscore table");
    }

    public static int calculateHighScorePosition(int score){

        if(score > -1) {
            if (score >= 1000) {
                return 1;
            } else if (score >= 500 & score < 1000) {
                return 2;
            } else if (score >= 100 & score < 500) {
                return 3;
            } else {
                return 4;
            }
        }else{
            System.out.println("Score can't be negative");
            return 0;
        }
    }


}
