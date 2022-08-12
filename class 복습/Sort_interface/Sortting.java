package Sort_interface;

import java.io.IOException;

public class Sortting {
    public static void main(String[] args) throws IOException {
        System.out.println("정렬방식을 선택 하세요.");
        System.out.println("B : BubbleSort");
        System.out.println("H : HeapSort");
        System.out.println("Q : QuickSort");
        char a=(char)System.in.read();
        Sort sort=null;
        if(a=='B'){
            sort=new BubbleSort();
        }
        else if (a=='H') {
            sort=new HeapSort();
        }
        else if (a=='q') {
            sort=new QuickSort();
        }
        int[] arr=new int[10];
        sort.ascending(arr);
        sort.descending(arr);
        sort.description();
    }
}
