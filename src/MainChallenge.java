public class MainChallenge {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 4000;
        int levelCompleted = 5;
        int bonus = 100;


        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("The high score is " + highScore);

        System.out.print("The next highscore is " + calculateScore(true, 1000, 8, 200));
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score;

        if (gameOver) {
            finalScore += finalScore + (levelCompleted * bonus);
            finalScore += 1000;
        }

        return finalScore;
    }

}
