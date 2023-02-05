package baseball.view;

import static baseball.view.ViewEnum.IN_CONTINUE_GENERATE;
import static baseball.view.ViewEnum.IN_USER_NUMBER;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

  public String readUserNumber() {
    System.out.print(IN_USER_NUMBER.getMessage());
    return Console.readLine();
  }

  public String readContinueGenerate() {
    System.out.println(IN_CONTINUE_GENERATE.getMessage());
    return Console.readLine();
  }
}
