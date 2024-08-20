public class MethodChallenge {
    public static void main(String[] args) {
        int score = calcHighScorePosition(500);

        displayHighScore("Tim", score);
    }

    public static void displayHighScore (String playerName, int playerPosition) {
        System.out.print(playerName + " managed to get into position " + playerPosition + " on the high score list");
    }

    public static int calcHighScorePosition(int playerScore) {
        int finalScore = 0;
        if (playerScore >= 1000) {
            finalScore = 1;
        } else if (playerScore >= 500) {
            finalScore = 2;
        } else if (playerScore >= 100) {
            finalScore = 3;
        } else {
            finalScore = 4;
        }

        return finalScore;
    }
 }
