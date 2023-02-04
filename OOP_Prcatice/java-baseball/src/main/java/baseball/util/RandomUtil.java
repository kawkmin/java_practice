package baseball.util;

import static baseball.NumberEnum.LIST_SIZE;
import static baseball.NumberEnum.MAX_NUMBER;
import static baseball.NumberEnum.MIN_NUMBER;

import baseball.NumberEnum;
import camp.nextstep.edu.missionutils.Randoms;
import java.util.List;

public class RandomUtil {

  public static List<Integer> makeRandomNumbers() {
    return Randoms.pickUniqueNumbersInRange(MIN_NUMBER.getLimitedNumber(),
        MAX_NUMBER.getLimitedNumber(), LIST_SIZE.getLimitedNumber());
  }
}
