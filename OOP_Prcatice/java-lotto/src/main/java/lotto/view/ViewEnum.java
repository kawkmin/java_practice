package lotto.view;

public enum ViewEnum {
    INPUT_PURCHASE_MONEY("구입금액을 입력해 주세요."),
    INPUT_WIN_LOTTO("당첨 번호를 입력해 주세요."),
    INPUT_BONUS_NUMBER("\n보너스 번호를 입력해 주세요."),

    OUTPUT_PURCHASE_LOTTO("\n%d개를 구매했습니다.\n"),
    OUTPUT_RESULT_RANKING_MESSAGE("당첨 통계\n---"),
    OUTPUT_RESULT_RANKING("%d개 일치%s (%s원) - %d개\n"),
    OUTPUT_BONUS_RESULT_RANKING(", 보너스 볼 일치"),
    OUTPUT_ADVANCED_RATE("총 수익률은 %.1f%%입니다."),
    ;

    private String message;

    ViewEnum(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
