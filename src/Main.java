public class Main {
    public static void main(String[] args) {
//        double kilometers = (100 * 1.609344);
//
//        int highScore = 50;
//
//        if(highScore > 25) {
//            highScore = 1000 + highScore; // bonus points
//        }
//
//        int health = 100;
//        if((health < 25) && (highScore > 1000)) {
//            highScore = highScore - 1000;
//        }

        boolean gameOver = true;
        int score = 4000;
        int levelCompleted = 5;
        int bonus = 100;

        if (score < 5000 && score > 1000) {
            System.out.print("Your score less than 5000");
        } else if (score < 1000) {
            System.out.print("Your score less than 1000");
        } else {
            System.out.print("Got here");
        }
    }
}
