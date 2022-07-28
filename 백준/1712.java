import java.util.Scanner;

public class 1712 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int A= scanner.nextInt();
        int B= scanner.nextInt();
        int C= scanner.nextInt();
        int x=C-B;
        if(x>0)
        {
            System.out.println(A/x+1);
        }
        else System.out.println(-1);
    }
}
