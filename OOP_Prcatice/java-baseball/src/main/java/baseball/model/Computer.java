package baseball.model;

import java.util.List;

public class Computer {

  private final List<Integer> computerNumbers;

  public Computer(List<Integer> computerNumbers) {
    this.computerNumbers = computerNumbers;
  }

  public List<Integer> getComputerNumbers() {
    return computerNumbers;
  }
}
