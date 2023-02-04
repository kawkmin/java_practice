package baseball.model;

import baseball.util.RandomUtil;
import java.util.ArrayList;
import java.util.List;

public class Computer {

  private final List<Integer> Number;

  public Computer() {
    this.Number = RandomUtil.makeRandomNumbers();
  }
}
