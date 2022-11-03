package lamdapractice.Execrcise;

public class ex1 {
    public void main(String[] args) {

    }

    int max(int a, int b) { //(a,b)->a>b?a:b;
        return a > b ? a : b;
    }

    void printVar(String name, int i) { //(name,i)->sout(name+"="+i);
        System.out.println(name + "=" + i);
    }

    int square(int x) { //x->x*x;
        return x * x;
    }
    int roll() { //()->(int)(Math.random()*6);
        return (int) (Math.random() * 6);
    }
}
