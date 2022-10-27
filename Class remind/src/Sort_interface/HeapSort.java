package Sort_interface;

public class HeapSort implements Sort{
    @Override
    public void ascending(int[] arr) {
        System.out.println("Heap Sort ascending");
    }

    @Override
    public void descending(int[] arr) {
        System.out.println("Heap Sort Descending");
    }

    @Override
    public void description() {
        Sort.super.description();
        System.out.println("Heap Sort 입니다");
    }
}
