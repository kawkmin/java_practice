package baseball.controller;

import baseball.model.Computer;
import baseball.model.Judgement;
import baseball.model.User;
import baseball.util.RandomUtil;
import baseball.view.InputView;
import baseball.view.OutputView;

public class BaseBallController {

  private final OutputView outputView = new OutputView();
  private final InputView inputView = new InputView();
  private final Computer computer;

  private Judgement judgement;

  private User user;

  public BaseBallController() {
    computer = new Computer(RandomUtil.makeRandomNumbers());
  }

  public void gameStart() {
    outputView.gameStart();
    gameCalculate();
  }

  private void gameCalculate() {
    do {
      user = new User(inputView.getUserNumber());
      judgement=new Judgement(computer, user);
      outputView.printGameResult(judgement);
    } while(!judgement.isFinish());
  }
}
