package Exercise;

import java.util.Arrays;
import java.util.Comparator;

public class ex1 {
    public static void main(String[] args) {
        String[] strArr = { "aaa", "bb", "c", "dddd" };

        int sum= Arrays.stream(strArr).mapToInt(s->s.length()).sum();
        System.out.println(sum);

        Arrays.stream(strArr).sorted(Comparator.reverseOrder()).limit(1).forEach(s-> System.out.println(s));
//        Arrays.stream(strArr).sorted(Comparator.reverseOrder()).limit(1).forEach(System.out::println);
    }
}
