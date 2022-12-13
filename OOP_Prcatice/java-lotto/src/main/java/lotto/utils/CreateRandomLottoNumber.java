package lotto.utils;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.List;

public class CreateRandomLottoNumber {
    public static List<Integer> createNumber(){
        return Randoms.pickUniqueNumbersInRange(1,45,6);
    }
}
