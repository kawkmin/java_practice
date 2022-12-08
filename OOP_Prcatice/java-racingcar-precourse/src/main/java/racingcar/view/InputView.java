package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

import static racingcar.view.ViewEnum.INPUT_CAR_LIST;

public class InputView {
    public static String readCars(){
        INPUT_CAR_LIST.getMessage();
        return Console.readLine();
    }
}
