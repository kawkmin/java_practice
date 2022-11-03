package Exercise.ex4;

public class Client {
    private String name;
    private int number,age,cost;

    public Client() {
    }

    public Client(int number,String name, int age, int cost) {
        this.name = name;
        this.number = number;
        this.age = age;
        this.cost = cost;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void showAll(){
        System.out.println("고객 번호: "+number+" 이름 :"+name+" 나이 :"+age+" 비용: "+cost);
    }
}
