import java.util.Scanner;

public class PlayersGame {
    public static final int NUMBER_MATCHES = 20;
    private int remainsMatches = NUMBER_MATCHES;
    Scanner scanner = new Scanner(System.in);

    public void gamePlayers(int randomNumber) {
        gameProgress(randomNumber);

    }

    public void gameProgress(int x) {
        String player = null;
        int xx = x;
        while (true) {
            if (xx == 1) {
                player = "Player1";
            } else if (xx == 2) {
                player = "Player2";
            }
            OutputOfMessage.purposeFirstMove(xx);
            int enteredNumber = scanner.nextInt();
            while (true) {
                if (enteredNumber < 1 || enteredNumber > 3 || remainsMatches - enteredNumber < 1) {
                    if (remainsMatches - enteredNumber < 1) {
                        OutputOfMessage.lessThanOne(remainsMatches);
                        enteredNumber = scanner.nextInt();
                    } else if (enteredNumber < 1 || enteredNumber > 3) {
                        OutputOfMessage.wrongEnemyChoiceMatches();
                        enteredNumber = scanner.nextInt();
                    }
                }else {
                    break;
                }
            }

            OutputOfMessage.choiceMatches(enteredNumber, player);
            remainsMatches = remainsMatches - enteredNumber;
            if (xx == 1) {
                xx++;
            } else if (xx == 2) {
                xx--;
            }
            if (remainsMatches == 1) {
                OutputOfMessage.finishGame(xx);
                break;
            }
            OutputOfMessage.remMatches(remainsMatches);

        }
    }
}
