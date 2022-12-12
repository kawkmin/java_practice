package baseball.util;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class CreateRandomNum {
    private static final int NUM_MAX_SIZE=3;
    private static final int MAX_NUM=9;
    private static final int NIM_NUM=1;

    public static List<Integer> createComputerNums(){
        List<Integer> computerNums = new ArrayList<>();
        while (computerNums.size() < NUM_MAX_SIZE) {
           checkNum(computerNums);
        }
        return computerNums;
    }

    private static void checkNum(List<Integer> computerNums){
        int randomNumber = Randoms.pickNumberInRange(NIM_NUM, MAX_NUM);
        if (!computerNums.contains(randomNumber)) {
            computerNums.add(randomNumber);
        }
    }
}
