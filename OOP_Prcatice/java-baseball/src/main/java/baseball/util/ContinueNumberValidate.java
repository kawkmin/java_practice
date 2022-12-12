package baseball.util;

import static baseball.util.ErrorEnum.CONTINUE_NUMBER_ERROR;

public class ContinueNumberValidate {
    private static String RESTART_NUMBER="1";
    private static String END_NUMBER="2";

    public static String checkContinueNumber(String continueNumber){
        if(!continueNumber.equals(RESTART_NUMBER) && !continueNumber.equals(END_NUMBER)){
            throw new IllegalArgumentException(CONTINUE_NUMBER_ERROR.getMessage());
        }
        return continueNumber;
    }
}
