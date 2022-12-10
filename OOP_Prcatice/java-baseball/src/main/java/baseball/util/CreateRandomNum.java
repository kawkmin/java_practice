package baseball.util;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class CreateRandomNum {
    private final static int NUM_MAX_SIZE=3;
    private final static int MAX_NUM=9;
    private final static int NIM_NUM=1;

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
