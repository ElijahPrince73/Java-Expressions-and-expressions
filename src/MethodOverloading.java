public class MethodOverloading {
    public static void main(String[] args) {
        int newScore = calcScore("tim", 500);

        System.out.println(newScore);

        calcScore(75);
        calcScore();
    }

    public static int calcScore(String playerName, int score) {
        System.out.println(playerName);
        System.out.println(score);

        return score * 1000;
    }

    public static int calcScore(int score) {
        System.out.println("Unnamed player" + score + "points");

        return score * 1000;
    }

    public static int calcScore() {
        System.out.println("No player");

        return 0;
    }
}
