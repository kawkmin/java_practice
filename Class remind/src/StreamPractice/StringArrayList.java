package StreamPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StringArrayList {
    public static void main(String[] args) {

        List<String> slist=new ArrayList<>();
        slist.add("토마스");
        slist.add("에워드");
        slist.add("잭");

        Stream<String> stream=slist.stream();
        stream.forEach(s-> System.out.print(s + " "));
        System.out.println();

        //stream.sorted().forEach(s-> System.out.print(s + " ")); 한번쓴 스트림은 다시 사용 불가능
        slist.stream().sorted().forEach(s-> System.out.print(s+" "));
        System.out.println();

        slist.stream().map(s->s.length()).forEach(n-> System.out.println(n)); //스트림은 원래 값 영향 x 따라서 sort전 3 3 1sout
    }
}
