package baseball.controller;

import baseball.model.Computer;
import baseball.model.User;
import baseball.view.InputView;
import baseball.view.OutputView;

public class BaseBallController {

  private final OutputView outputView = new OutputView();
  private final InputView inputView = new InputView();
  private final Computer computer;

  private User user;

  public BaseBallController() {
    computer = new Computer();
  }

  public void gameStart() {
    outputView.gameStart();
    user = new User(inputView.getUserNumber());
  }
}
