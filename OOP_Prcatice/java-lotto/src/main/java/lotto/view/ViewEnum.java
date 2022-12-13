package lotto.view;

public enum ViewEnum {
    ;

    private String message;

    ViewEnum(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
