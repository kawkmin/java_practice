package lotto.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lotto {
    private final List<Integer> numbers;
    private final int numberSize=6;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        List<Integer> temp=new ArrayList<>();
        temp.addAll(numbers);
        Collections.sort(temp);
        this.numbers = temp;
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != numberSize) {
            throw new IllegalArgumentException();
        }
    }

    public List<Integer> getNumbers() {
        return numbers;
    }
}
