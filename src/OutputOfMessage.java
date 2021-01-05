public class OutputOfMessage {

    public static void remMatches(int remainsMatches) {
        System.out.println(" -На столе осталось " + remainsMatches + " спичек.");
    }

    public static void choiceMatches(int enteredNumber, String player) {
        System.out.println(player + " выбрал " + enteredNumber + " спичек.");
    }

    public static void finishGame(int xx) {

        System.out.println("Осталась 1 спичка.Player" + xx + " проиграл!");
    }

    public static void finishGameComp() {
        System.out.println("Осталась 1 спичка.Вы проиграли!");
    }

    public static void wrongEnemyChoiceMatches() {
        System.out.print("Вы вели неверное значение. Введите число от 1 до 3: ");
    }

    public static void turnPlayer() {
        System.out.print(" -Ход игрока. Введите количество спичек: ");
    }

    public static void lessThanOne(int x) {
        System.out.print("Вы ввели неверное значение. Введите от " + 1 + " до " + (x - 1) + " ");
    }

    public void wrongEnemyChoicePlayer() {
        System.out.println("Вы ввели неверное значение." + '\n' + "Введите 1 или 2" + '\n'
                + "1 - компьютер" + '\n' + "2 - другой игрок");
    }

    public void startGame() {
        System.out.println("Игра началась!!!" + '\n' + "На столе 20 спичек");
    }

    public static void purposeFirstMove(int x) {
        System.out.print(" -Ход Player" + x + "." + "Введите количество спичек: ");
    }

    public void choiceOpponent() {
        System.out.println("Нажмите 1 или 2 для выбора противника."
                + '\n' + "1 - компьютер" + '\n' + "2 - другой игрок");
    }
}
