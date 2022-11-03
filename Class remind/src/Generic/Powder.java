package Generic;

public class Powder extends Material{
    public String toString(){
        return "재료는 파우더";
    }

    @Override
    public void doPrint() {
        System.out.println("파우더");
    }
}
