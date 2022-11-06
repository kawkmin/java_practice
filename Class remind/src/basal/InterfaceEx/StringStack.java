package basal.InterfaceEx;

import java.util.ArrayList;
import java.util.List;

public class StringStack implements stack {
    private int length;
    private int capacity=0;

    public void setLength(int length) {
        this.length = length;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    private List<String> stringList=new ArrayList<>();

    @Override
    public int length() {
        return this.length;
    }

    @Override
    public int capacity() {
        return this.capacity;
    }

    @Override
    public String pop() {
        return String.join(" ",stringList);
    }

    @Override
    public boolean push(String val) {
        return stringList.add(val);
    }
}
