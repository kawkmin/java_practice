package baseball.view;

import static baseball.view.ViewEnum.*;

public class OutputView {
    public OutputView() {
    }

    public void printGameStartMessage(){
        System.out.println(OUTPUT_GAME_START_MESSAGE.getMessage());
    }

    public void printResultCountMessage(int strikeCount,int ballCount){
        String resultCountMessage="";
        if(ballCount>0) {
            resultCountMessage += ballCount + BALL.getMessage();
        }
        if(strikeCount>0){
            resultCountMessage+=strikeCount+STRIKE.getMessage();
        }
        if(resultCountMessage.equals("")){
            resultCountMessage= NOTHING.getMessage();
        }
        System.out.println(resultCountMessage);
    }


}
