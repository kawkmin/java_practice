package baseball.util;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class CreateRandomNum {
    private final static int numSize=3;
    private final static int numMax=9;
    private final static int numMin=1;

    public static List<Integer> createNum(){
        List<Integer> computer = new ArrayList<>();
        while (computer.size() < numSize) {
            int randomNumber = Randoms.pickNumberInRange(numMin, numMax);
            if (!computer.contains(randomNumber)) {
                computer.add(randomNumber);
            }
        }
        return computer;
    }
}
