package baseball.view;

public enum ViewEnum {
  OUT_GAME_START("숫자 야구 게임을 시작합니다."),

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
