package baseball.view;

import static baseball.view.ViewEnum.OUTPUT_GAME_START_MESSAGE;

public class OutputView {
    public OutputView() {
    }

    public void printGameStartMessage(){
        System.out.println(OUTPUT_GAME_START_MESSAGE.getMessage());
    }
}
