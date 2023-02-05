package baseball.model;

import static baseball.ErrorMessageEnum.ERROR_USER_NUMBER_DISTINCT;
import static baseball.ErrorMessageEnum.ERROR_USER_NUMBER_RIGHT;
import static baseball.ErrorMessageEnum.ERROR_USER_NUMBER_SIZE;
import static baseball.NumberEnum.EXCEPTED_NUMBER;
import static baseball.NumberEnum.LIST_SIZE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class User {

  private List<Integer> userNumbers;

  public User(String strUserNumber) {
    userNumberValidate(strUserNumber);
  }

  private void userNumberValidate(String strUserNumber) {
    numberRightValidate(strUserNumber);
    numberSizeValidate();
    numberDistinctValidate();
  }

  private void numberRightValidate(String strUserNumber) {
    try {
      this.userNumbers = new ArrayList<>(Arrays.asList(strUserNumber.split("")))
          .stream()
          .map(Integer::parseInt)
          .collect(Collectors.toList());

      if (this.userNumbers.contains(EXCEPTED_NUMBER.getLimitedNumber())) {
        throw new Exception();
      }
    } catch (Exception e) {
      throw new IllegalArgumentException(ERROR_USER_NUMBER_RIGHT.getMessage());
    }

  }

  private void numberSizeValidate() {
    if (LIST_SIZE.getLimitedNumber() != this.userNumbers.size()) {
      throw new IllegalArgumentException(ERROR_USER_NUMBER_SIZE.getMessage());
    }
  }

  private void numberDistinctValidate() {
    int size = (int) this.userNumbers.stream().distinct().count();
    if (size != LIST_SIZE.getLimitedNumber()) {
      throw new IllegalArgumentException(ERROR_USER_NUMBER_DISTINCT.getMessage());
    }
  }

  public List<Integer> getUserNumbers() {
    return userNumbers;
  }
}
