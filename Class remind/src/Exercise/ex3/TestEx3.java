package Exercise.ex3;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class TestEx3 {
    public static void main(String[] args) throws IOException {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        //2011년에 일어난 모든 트랜잭션을 찾아 값을 오름차순으로 정리하시오
        transactions.stream()
                .filter(t -> t.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .forEach(System.out::println);

        System.out.println();
        //거래자가 근무하는 모든 도시를 중복없이 나열하시오
        transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .distinct()
                .forEach(System.out::println);

        System.out.println();
        //케임브리지에서 근무하는 모든 거래자를 찾아서 이름순으로 정렬하시오
        transactions.stream()
                .map(Transaction::getTrader)
                .sorted(Comparator.comparing(Trader::getName))
                .filter(s->s.getCity()=="Cambridge")
                .distinct()
                .forEach(System.out::println);

        System.out.println();
        //모든 거래자의 이름을 알파벳순으로 정리해서 반환하시오
        transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getName)
                .distinct()
                .sorted()
                .forEach(System.out::println);

        System.out.println();
        //밀라노에 거래자가 있는가?
        System.out.println(
                transactions.stream()
                .anyMatch(s->s.getTrader().getCity().equals("Milan")));

        System.out.println();
        //케임브리지에 거주하는 거래자의 모든 트랜잭션값을 출력하시오
        transactions.stream()
                .filter(s->s.getTrader().getCity()=="Cambridge")
                .forEach(System.out::println);

        System.out.println();
        //전체 트랜잭션 중 최댓값은 얼마인가?
        System.out.println(
                transactions.stream()
                .map(Transaction::getValue)
                .reduce(Integer::max).get()
        );

        System.out.println();
        //전체 트랜잭션 중 최솟값은 얼마인가?
        System.out.println(
                transactions.stream()
                .map(Transaction::getValue)
                .reduce(Integer::min).get()
        );
    }
}
