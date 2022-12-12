package baseball.util;

public enum ErrorEnum {
    USER_SIZE_ERROR("사이즈가 3이 아닙니다."),
    USER_RIGHT_ERROR("숫자만 입력해 주세요."),
    USER_DISTINCT_ERROR("중복된 숫자는 입력하시면 안됩니다."),

    CONTINUE_NUMBER_ERROR("1 또는 2를 입력하세요.")
    ;

    private String message;
    private static final String ERROR="[ERROR] ";

    ErrorEnum(String message) {
        this.message =ERROR+message;
    }

    public String getMessage() {
        return message;
    }
}
