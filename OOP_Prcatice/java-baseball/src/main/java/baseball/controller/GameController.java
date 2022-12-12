package baseball.controller;

import baseball.model.Computer;
import baseball.model.User;
import baseball.util.CreateRandomNum;
import baseball.view.InputView;
import baseball.view.OutputView;

public class GameController {
    private final InputView inputView;
    private final OutputView outputView;
    public GameController() {
        inputView=new InputView();
        outputView=new OutputView();
    }

    public void Start(){
        try{
            outputView.printGameStartMessage();
            Computer computer=new Computer(CreateRandomNum.createComputerNums());
            User user=new User(inputView.readUserNumber());

        }catch (IllegalArgumentException exception){
            System.out.println(exception.getMessage());
        }
    }
}
