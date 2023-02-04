package baseball.view;

import static baseball.view.ViewEnum.OUT_GAME_RESULT_BALL;
import static baseball.view.ViewEnum.OUT_GAME_RESULT_NOTHING;
import static baseball.view.ViewEnum.OUT_GAME_RESULT_STRIKE;
import static baseball.view.ViewEnum.OUT_GAME_START;

import baseball.model.Judgement;

public class OutputView {

  public void gameStart() {
    System.out.println(OUT_GAME_START.getMessage());
  }

  public void printGameResult(Judgement judgement) {
    if (zeroBall(judgement)) {
      return;
    }

    String printResult = String.format(OUT_GAME_RESULT_BALL.getMessage(), judgement.getBall());
    if (judgement.getStrike() != 0) {
      printResult +=
          " " + String.format(OUT_GAME_RESULT_STRIKE.getMessage(), judgement.getStrike());
    }
    System.out.println(printResult);
  }

  private static boolean zeroBall(Judgement judgement) {
    if (judgement.getBall() == 0) {
      if (judgement.getStrike() == 0) {
        System.out.println(OUT_GAME_RESULT_NOTHING.getMessage());
        return true;
      }
      System.out.printf(OUT_GAME_RESULT_STRIKE.getMessage() + "\n", judgement.getStrike());
      return true;
    }
    return false;
  }

}
