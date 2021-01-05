import java.util.Random;
import java.util.Scanner;

public class PlayerComputer {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    private int enteredNumber = random.nextInt(3) + 1;
    protected int remainsMatches = PlayersGame.NUMBER_MATCHES - enteredNumber;

    public void gameComputer() {
        String nameComp = "Компьютер";
        OutputOfMessage.choiceMatches(enteredNumber, nameComp);
        OutputOfMessage.remMatches(remainsMatches);

        while (true) {
            OutputOfMessage.turnPlayer();
            enteredNumber = scanner.nextInt();
            while (true) {
                if (enteredNumber < 1 || enteredNumber > 3) {
                    OutputOfMessage.wrongEnemyChoiceMatches();
                    enteredNumber = scanner.nextInt();
                } else {
                    break;
                }
            }

            remainsMatches = remainsMatches - enteredNumber;
            OutputOfMessage.remMatches(remainsMatches);
            OutputOfMessage.choiceMatches((remainsMatches - 1) % 4, nameComp);
            remainsMatches = remainsMatches - ((remainsMatches - 1) % 4);
            OutputOfMessage.remMatches(remainsMatches);

            if (remainsMatches == 1) {
                OutputOfMessage.finishGameComp();
                break;
            }
        }
    }
}
