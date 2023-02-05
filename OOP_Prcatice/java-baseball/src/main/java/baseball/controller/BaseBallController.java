package baseball.controller;

import baseball.ErrorMessageEnum;
import baseball.model.Computer;
import baseball.model.Judgement;
import baseball.model.User;
import baseball.util.RandomUtil;
import baseball.view.InputView;
import baseball.view.OutputView;

public class BaseBallController {

  private static final String CONTINUE_NUMBER = "1";
  private static final String END_NUMBER = "0";

  private final OutputView outputView = new OutputView();
  private final InputView inputView = new InputView();
  private Computer computer;
  private Judgement judgement;
  private User user;

  public void gameStart() {
    outputView.gameStart();
    gameCalculate();
  }

  private void gameCalculate() {
    do {
      computer = new Computer(RandomUtil.makeRandomNumbers());
      user = new User(inputView.readUserNumber());
      judgement = new Judgement(computer, user);
      outputView.printGameResult(judgement);
    } while (!judgement.isFinish());

    continueGenerate(inputView.readContinueGenerate());
  }

  private void continueGenerate(String number) {
    if (number.equals(CONTINUE_NUMBER)) {
      gameCalculate();
      return;
    }
    if (number.equals(END_NUMBER)) {
      return;
    }
    throw new IllegalArgumentException(ErrorMessageEnum.ERROR_CONTINUE_GENERATE_RIGHT.getMessage());
  }
}
