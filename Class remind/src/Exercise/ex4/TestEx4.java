package Exercise.ex4;

import java.util.ArrayList;
import java.util.List;

public class TestEx4 {
    public static void main(String[] args) {
        Client Lee=new Client(1,"이순신",40,100);
        Client Kim=new Client(2,"김유신",20,100);
        Client Hong=new Client(3,"홍길동",13,50);
        List<Client> clientList=new ArrayList<>();
        clientList.add(Lee);
        clientList.add(Kim);
        clientList.add(Hong);

        clientList.stream()
                .forEach(s->s.showAll());

        System.out.println(
                clientList.stream()
                .mapToInt(Client::getCost)
                .sum()
        );

        clientList.stream()
                .filter(s->s.getAge()>=20)
                .map(Client::getName)
                .sorted()
                .forEach(System.out::println);
    }
}
