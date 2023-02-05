package baseball;

public enum ErrorMessageEnum {
  ERROR_USER_NUMBER_SIZE("3개를 입력해 주세요"),
  ERROR_USER_NUMBER_RIGHT("1에서 9의 숫자만 입력해 주세요"),
  ERROR_USER_NUMBER_DISTINCT("중복되지 않는 숫자를 입력해 주세요"),
  ERROR_CONTINUE_GENERATE_RIGHT("1 또는 2만 입력해 주세요.");

  private static final String ERROR_MESSAGE = "[ERROR] ";
  private String message;

  ErrorMessageEnum(String message) {
    this.message = ERROR_MESSAGE + message;
  }

  public String getMessage() {
    return message;
  }
}
