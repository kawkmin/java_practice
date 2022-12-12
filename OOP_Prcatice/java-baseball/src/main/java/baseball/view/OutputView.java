package baseball.view;

import static baseball.view.ViewEnum.OUTPUT_GAME_START_MESSAGE;

public class OutputView {
    public OutputView() {
    }

    public void printGameStartMessage(){
        OUTPUT_GAME_START_MESSAGE.getMessage();
    }
}
