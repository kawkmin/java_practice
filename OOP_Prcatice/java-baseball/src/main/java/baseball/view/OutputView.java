package baseball.view;

import static baseball.view.ViewEnum.OUT_GAME_START;

public class OutputView {
  public void gameStart(){
    System.out.println(OUT_GAME_START.getMessage());
  }

}
