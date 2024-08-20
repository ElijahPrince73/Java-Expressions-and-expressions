public class MainChallenge {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 4000;
        int levelCompleted = 5;
        int bonus = 100;
        int finalScore = score;

        calculateScore(gameOver, score, levelCompleted, bonus, finalScore);

         score = 10000;
         levelCompleted = 8;
         bonus = 200;

        calculateScore(gameOver, score, levelCompleted, bonus, finalScore);

    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus, int finalScore) {
        if (gameOver) {
            finalScore += finalScore + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }

}
