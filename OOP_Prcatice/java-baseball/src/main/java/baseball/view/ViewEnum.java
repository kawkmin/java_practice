package baseball.view;

public enum ViewEnum {
  OUT_GAME_START("숫자 야구 게임을 시작합니다."),
  OUT_GAME_RESULT_BALL("%d볼"),
  OUT_GAME_RESULT_STRIKE("%d스트라이크"),
  OUT_GAME_RESULT_NOTHING("낫싱"),

  IN_USER_NUMBER("숫자를 입력해 주세요 : "),
  IN_CONTINUE_GENERATE("3개의 숫자를 모두 맞히셨습니다! 게임 종료\n "
      + "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
  private String message;

  ViewEnum(String message) {
    this.message = message;
  }

  public String getMessage() {
    return message;
  }
}
