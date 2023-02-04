package baseball.view;

public enum ViewEnum {
  OUT_GAME_START("숫자 야구 게임을 시작합니다."),
  OUT_GAME_RESULT_BALL("%d볼"),
  OUT_GAME_RESULT_STRIKE("%d스트라이크"),
  OUT_GAME_RESULT_NOTHING("낫싱"),

  IN_USER_NUMBER("숫자를 입력해 주세요 : "),
  ;
  private String message;

  ViewEnum(String message) {
    this.message = message;
  }

  public String getMessage() {
    return message;
  }
}
