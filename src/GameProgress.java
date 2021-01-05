import java.util.Random;
import java.util.Scanner;

public class GameProgress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        OutputOfMessage outputOfMessage = new OutputOfMessage();
        PlayersGame playersGame = new PlayersGame();
        PlayerComputer playerComputer = new PlayerComputer();
        outputOfMessage.choiceOpponent();

        int enemy = scanner.nextInt();
        while (true) {
            if (enemy == 1 || enemy == 2) {
                outputOfMessage.startGame();
                if (enemy == 1) {
                    playerComputer.gameComputer();
                    break;
                } else {
                    int randomNumber = random.nextInt(2) + 1;
                    playersGame.gamePlayers(randomNumber);
                    break;
                }
            } else {
                outputOfMessage.wrongEnemyChoicePlayer();
                enemy = scanner.nextInt();
            }
        }
    }
}
