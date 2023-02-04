package baseball.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class User {

  private List<Integer> userNumber;

  public User(String strUserNumber) {
    this.userNumber = new ArrayList<>(Arrays.asList(strUserNumber.split("")))
        .stream()
        .map(Integer::parseInt)
        .collect(Collectors.toList());
  }

}
