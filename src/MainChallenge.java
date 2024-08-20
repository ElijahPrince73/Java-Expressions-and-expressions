public class MainChallenge {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 4000;
        int levelCompleted = 5;
        int bonus = 100;
        int finalScore = score;

        if (gameOver) {
            finalScore += finalScore + (levelCompleted * bonus);
            System.out.print("Your final score was " + finalScore);
        }
    }
}
