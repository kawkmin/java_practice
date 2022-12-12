package baseball.model;

import baseball.util.CreateRandomNum;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    private List<Integer> computerNums = new ArrayList<>();

    public Computer(List<Integer> computerNums) {
        this.computerNums = computerNums;
    }

    public List<Integer> getComputerNums() {
        return computerNums;
    }
}
