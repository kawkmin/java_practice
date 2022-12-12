package baseball.view;

public enum ViewEnum {
    INPUT_USER_NUMBERS_MESSAGE("숫자를 입력해주세요 : "),
    INPUT_RESTART_MESSAGE("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요."),

    BALL("볼 "),
    NOTHING("낫싱"),
    STRIKE("스트라이크"),

    OUTPUT_GAME_START_MESSAGE("숫자 야구 게임을 시작합니다."),
    OUTPUT_GAME_END_MESSAGE("3개의 숫자를 모두 맞히셨습니다! 게임 종료")
    ;

    private String message;

    ViewEnum(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
