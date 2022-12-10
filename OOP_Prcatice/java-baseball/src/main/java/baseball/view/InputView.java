package baseball.view;

import camp.nextstep.edu.missionutils.Console;

import static baseball.view.ViewEnum.INPUT_USER_NUMBERS_MESSAGE;

public class InputView {
    public InputView() {}

    public String readUserNumber(){
        INPUT_USER_NUMBERS_MESSAGE.getMessage();
        return Console.readLine();
    }
}
