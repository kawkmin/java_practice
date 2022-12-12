package baseball.controller;

import baseball.model.Computer;
import baseball.model.Judgement;
import baseball.model.User;
import baseball.util.CreateRandomNum;
import baseball.view.InputView;
import baseball.view.OutputView;

public class GameController {
    private final InputView inputView;
    private final OutputView outputView;

    private boolean gameContinue;

    public GameController() {
        inputView = new InputView();
        outputView = new OutputView();
        init();
    }

    public void Start() {
        init();
        outputView.printGameStartMessage();
        Computer computer = new Computer(CreateRandomNum.createComputerNums());
        do {
            User user = new User(inputView.readUserNumber());
            Judgement judgement = new Judgement(user, computer);
            judgement.calculator();
            outputView.printResultCountMessage(judgement.getStrikeCount(), judgement.getBallCount());
            gameContinue = judgement.continueGame();
        } while (gameContinue);
        if (inputView.readRestartNumber().equals("1")) {
            Start();
        }

    }

    private void init() {
        gameContinue = true;
    }
}
