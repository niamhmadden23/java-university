public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("final score:" + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("final score:" + highScore);

        displayHighScorePosition(2, "Niamh");
        int highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition( highScorePosition, "jane");
        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition(highScorePosition, "Alan");
        highScorePosition= calculateHighScorePosition(900);
        displayHighScorePosition(highScorePosition, "mo");
        highScorePosition= calculateHighScorePosition(1500);
        displayHighScorePosition(highScorePosition, "G");


    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }

        return -1;

    }


    public static void displayHighScorePosition(int position, String player) {
        System.out.println(player + " managed to get into position " + position + " on the table");
    }

    public static int calculateHighScorePosition (int score) {
        int position = 4;
        if (score > 1000) {
            position = 1;
        } else if (score >= 500 ) {
           position = 2;
        } else if (score >= 100) {
            position = 3;
        }
            return position;
        }
    }
