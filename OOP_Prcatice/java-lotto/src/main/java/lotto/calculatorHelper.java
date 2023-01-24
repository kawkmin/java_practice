package lotto;

public enum calculatorHelper {
    INDEX_ARRAY_HELPER(3),
    INDEX_SIZE(5),

    NEED_CHECK_BONUS(5),
    ALL_RIGHT(6),
    MIN_RIGHT(3),
    ALL_RIGHT_INDEX(4),
    NO_BONUS_INDEX(2),
    YES_BONUS_INDEX(3),
    NO_RANK_INDEX(-1),
    ;
    private int helpNumber;

    calculatorHelper(int helpNumber) {
        this.helpNumber = helpNumber;
    }

    public int getHelpNumber() {
        return helpNumber;
    }
}
