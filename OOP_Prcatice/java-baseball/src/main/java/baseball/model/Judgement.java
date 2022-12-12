package baseball.model;

import java.util.List;

public class Judgement {
    private final User user;
    private final Computer computer;
    private int strikeCount;
    private int ballCount;

    public Judgement(User user, Computer computer) {
        this.user = user;
        this.computer = computer;
        this.strikeCount=0;
        this.ballCount=0;
    }

    public void calculator(){
        List<Integer> userNums=user.getUserNums();
        List<Integer> computerNums=computer.getComputerNums();
        calculatorStrike(userNums,computerNums);
        calculatorBall(userNums,computerNums);
    }

    private void calculatorStrike(List<Integer> userNums,List<Integer> computerNums){
        for(int i=0;i<userNums.size();i++){
            if(userNums.get(i)==computerNums.get(i)){
                this.strikeCount++;
            }
        }
    }

    private void calculatorBall(List<Integer> userNums,List<Integer> computerNums){
        for(int i=0;i<userNums.size();i++){
            if(userNums.get(i)!=computerNums.get(i)&&computerNums.contains(userNums.get(i))){
                this.ballCount++;
            }
        }
    }

    public int getStrikeCount() {
        return strikeCount;
    }

    public int getBallCount() {
        return ballCount;
    }
}
