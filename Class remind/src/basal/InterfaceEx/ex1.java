package basal.InterfaceEx;

import java.util.Scanner;


public class ex1 {
    public static void main(String[] args) {
        StringStack stringStacks=new StringStack();

        System.out.print("총 스택 저장 공간의 크기 입력 >> ");
        Scanner scanner=new Scanner(System.in);
        int length=scanner.nextInt();
        String str;
        stringStacks.setLength(length);
        do{
            System.out.print("문자열 입력 >> ");
            str=scanner.next();
            if(str.equals("그만")) continue;
            if(stringStacks.length()== stringStacks.capacity()){
                System.out.println("스택이 꽉 차서 푸시 불가");
                continue;
            }
             stringStacks.push(str);
             stringStacks.setCapacity(stringStacks.capacity()+1);
        }while(!str.equals("그만"));
        System.out.println(stringStacks.pop());
    }
}
