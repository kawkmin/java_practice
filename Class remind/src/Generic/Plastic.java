package Generic;

public class Plastic extends Material{
    public String toString(){
        return "재료는 플라스틱";
    }

    @Override
    public void doPrint(){
        System.out.println("플라스틱");
    }
}
