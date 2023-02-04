package baseball.view;

import static baseball.view.ViewEnum.IN_USER_NUMBER;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
  public String getUserNumber(){
    System.out.print(IN_USER_NUMBER.getMessage());
    return Console.readLine();
  }
}
