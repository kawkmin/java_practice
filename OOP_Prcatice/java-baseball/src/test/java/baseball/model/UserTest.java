package baseball.model;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class UserTest {

  @DisplayName("유저 숫자의 길이가 3이 아닐 때 예외 발생")
  @ParameterizedTest
  @ValueSource(strings = {"1234", "12", "12456", "1"})
  void should_throwException_when_userNumberSizeNotThree(String strNumber) {
    IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
        () -> new User(strNumber));
    assertThat(exception.getMessage()).isEqualTo("[ERROR] 3개를 입력해 주세요");
  }

  @DisplayName("유저 숫자가 1에서 9사이 숫자가 아닐 때 예외 발생")
  @ParameterizedTest
  @ValueSource(strings = {"013", "asdf", "@!@#", "$@!", "12$", "", "Zx3"})
  void should_throwException_when_wrongUserNumber(String strNumber) {
    IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
        () -> new User(strNumber));
    assertThat(exception.getMessage()).isEqualTo("[ERROR] 1에서 9의 숫자만 입력해 주세요");
  }

  @DisplayName("유저 숫자에 중복이 있을 때 예외 발생")
  @ParameterizedTest
  @ValueSource(strings = {"112", "222", "121", "211"})
  void should_throwException_when_duplicateUserNumber(String strNumber) {
    IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
        () -> new User(strNumber));
    assertThat(exception.getMessage()).isEqualTo("[ERROR] 중복되지 않는 숫자를 입력해 주세요");
  }

}