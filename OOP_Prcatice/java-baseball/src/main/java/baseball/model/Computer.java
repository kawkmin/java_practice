package baseball.model;

import baseball.util.RandomUtil;
import java.util.List;

public class Computer {

  private final List<Integer> computerNumbers;

  public Computer() {
    this.computerNumbers = RandomUtil.makeRandomNumbers();
  }

  public List<Integer> getComputerNumbers() {
    return computerNumbers;
  }
}
