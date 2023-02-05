package baseball.model;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class JudgementTest {

  Computer computer;

  @BeforeEach
  void setUp() {
    computer = new Computer(List.of(1, 2, 3));
  }

  @DisplayName("3개 다 맞을 때, 스트라이크를 3개, 볼 0개를 가짐")
  @Test
  void should_HaveThreeStrike_when_threeStrike() {
    assertThat(new Judgement(computer, new User("123")).getStrike())
        .isEqualTo(3);
    assertThat(new Judgement(computer, new User("123")).getBall())
        .isEqualTo(0);
  }

  @DisplayName("2개만 맞을 때, 스트라이크 2개만 가짐")
  @ParameterizedTest
  @ValueSource(strings = {"129", "193", "923", "126", "163"})
  void should_haveTwoStrike_when_TwoStrike(String userNumber) {
    assertThat(new Judgement(computer, new User(userNumber)).getStrike())
        .isEqualTo(2);
    assertThat(new Judgement(computer, new User(userNumber)).getBall())
        .isEqualTo(0);
  }

  @DisplayName("1개가 맞고, 2개는 숫자만 맞을 때, 스트라이크 1개, 볼 2개를 가짐")
  @ParameterizedTest
  @ValueSource(strings = {"132", "213", "321"})
  void should_haveOneStrikeTwoBall_when_OneStrikeTwoBall(String userNumber) {
    assertThat(new Judgement(computer, new User(userNumber)).getStrike())
        .isEqualTo(1);
    assertThat(new Judgement(computer, new User(userNumber)).getBall())
        .isEqualTo(2);
  }

  @DisplayName("1개가 맞고, 1개는 숫자만 맞을 때, 스트라이크 1개, 볼 1개를 가짐")
  @ParameterizedTest
  @ValueSource(strings = {"136", "329", "283"})
  void should_haveOneStrikeOneBall_when_OneStrikeOneBall(String userNumber) {
    assertThat(new Judgement(computer, new User(userNumber)).getStrike())
        .isEqualTo(1);
    assertThat(new Judgement(computer, new User(userNumber)).getBall())
        .isEqualTo(1);
  }

  @DisplayName("1개만 맞았을 때, 스트라이크 1개를 가짐")
  @ParameterizedTest
  @ValueSource(strings = {"189", "829", "893"})
  void should_haveOneStrike_when_OneStrike(String userNumber) {
    assertThat(new Judgement(computer, new User(userNumber)).getStrike())
        .isEqualTo(1);
    assertThat(new Judgement(computer, new User(userNumber)).getBall())
        .isEqualTo(0);
  }

  @DisplayName("숫자만 3개만 맞았을 때, 볼 3개를 가짐")
  @ParameterizedTest
  @ValueSource(strings = {"312", "231"})
  void should_haveThreeBall_when_ThreeBall(String userNumber) {
    assertThat(new Judgement(computer, new User(userNumber)).getStrike())
        .isEqualTo(0);
    assertThat(new Judgement(computer, new User(userNumber)).getBall())
        .isEqualTo(3);
  }

  @DisplayName("숫자만 2개만 맞았을 때, 볼 2개를 가짐")
  @ParameterizedTest
  @ValueSource(strings = {"912", "931", "238"})
  void should_haveTwoBall_when_TwoBall(String userNumber) {
    assertThat(new Judgement(computer, new User(userNumber)).getStrike())
        .isEqualTo(0);
    assertThat(new Judgement(computer, new User(userNumber)).getBall())
        .isEqualTo(2);
  }

  @DisplayName("숫자만 1개만 맞았을 때, 볼 1개를 가짐")
  @ParameterizedTest
  @ValueSource(strings = {"891", "289", "836"})
  void should_haveOneBall_when_OneBall(String userNumber) {
    assertThat(new Judgement(computer, new User(userNumber)).getStrike())
        .isEqualTo(0);
    assertThat(new Judgement(computer, new User(userNumber)).getBall())
        .isEqualTo(1);
  }

  @DisplayName("모두 틀렸을 때, 0을 가짐")
  @ParameterizedTest
  @ValueSource(strings = {"574", "456", "978", "586"})
  void should_haveZero_when_zero(String userNumber) {
    assertThat(new Judgement(computer, new User(userNumber)).getStrike())
        .isEqualTo(0);
    assertThat(new Judgement(computer, new User(userNumber)).getBall())
        .isEqualTo(0);
  }

}