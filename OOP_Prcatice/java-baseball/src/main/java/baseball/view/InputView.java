package baseball.view;

import baseball.util.UserNumsValidate;
import camp.nextstep.edu.missionutils.Console;

import static baseball.view.ViewEnum.INPUT_USER_NUMBERS_MESSAGE;

public class InputView {
    public InputView() {}

    public String readUserNumber(){
        System.out.print(INPUT_USER_NUMBERS_MESSAGE.getMessage());
        return UserNumsValidate.checkUserNums(Console.readLine());
    }
}
