package StreamPractice;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String>{
    @Override
    public String apply(String s, String s2) {
        return s.getBytes().length>s2.getBytes().length?s:s2;
    }
}

public class ReduceTest {
    public static void main(String[] args) {
        String[] greetings={"안녕하세요~~","hello","Good morning","반갑습니다"};
        System.out.println(Arrays.stream(greetings).reduce("",
                (a,b)->a.getBytes().length>b.getBytes().length?a:b
           ));

        System.out.println(Arrays.stream(greetings).reduce(new CompareString()).get());
    }
}
