package baseball.model;

import java.util.List;

public class Judgement {

  private final Computer computer;
  private final User user;

  private int ball;
  private int strike;

  public Judgement(Computer computer, User user) {
    this.computer = computer;
    this.user = user;
    ball = 0;
    strike = 0;

    calculatorBaseBall(computer.getComputerNumbers(), user.getUserNumbers());
  }

  private void calculatorBaseBall(List<Integer> computerNumbers, List<Integer> userNumbers) {
    for (int i = 0; i < computerNumbers.size(); i++) {
      if (computerNumbers.get(i) == userNumbers.get(i)) {
        this.strike++;
        continue;
      }
      if (computerNumbers.contains(userNumbers.get(i))) {
        this.ball++;
      }
    }
  }

}
