package lotto.utils;

public enum ErrorEnum {
    ;
    private String message;

    ErrorEnum(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
