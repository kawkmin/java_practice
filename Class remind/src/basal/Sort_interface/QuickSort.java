package basal.Sort_interface;

public class QuickSort implements Sort{
    @Override
    public void ascending(int[] arr) {
        System.out.println("Quick Sort ascending");
    }

    @Override
    public void descending(int[] arr) {
        System.out.println("Quick Sort Descending");
    }

    @Override
    public void description() {
        Sort.super.description();
        System.out.println("Quick Sort 입니다");
    }
}
