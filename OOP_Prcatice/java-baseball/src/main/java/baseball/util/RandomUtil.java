package baseball.util;

import static baseball.NumberEnum.LIST_SIZE;
import static baseball.NumberEnum.MAX_NUMBER;
import static baseball.NumberEnum.MIN_NUMBER;

import baseball.NumberEnum;
import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class RandomUtil {

  public static List<Integer> makeRandomNumbers() {
    List<Integer> randomNumbers = new ArrayList<>();

    while (randomNumbers.size() < LIST_SIZE.getLimitedNumber()) {
      int randomNumber = Randoms.pickNumberInRange(MIN_NUMBER.getLimitedNumber(),
          MAX_NUMBER.getLimitedNumber());
      if (!randomNumbers.contains(randomNumber)) {
        randomNumbers.add(randomNumber);
      }
    }
    return randomNumbers;
  }
}
