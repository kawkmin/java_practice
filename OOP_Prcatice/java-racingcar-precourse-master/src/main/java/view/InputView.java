package view;

import static view.ViewEnum.INPUT_CAR_NAME;

public class InputView {
    public static String getCarName(){
        System.out.println(INPUT_CAR_NAME.getMessage());
        return System.console().readLine();
    }
}
