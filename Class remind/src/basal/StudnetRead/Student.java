package basal.StudnetRead;

import java.util.ArrayList;

public class Student {
    String Name;

    ArrayList<Book> bookArrayList;

    public Student(String name) {
        Name = name;
        bookArrayList = new ArrayList<Book>();
    }

    public void addBook(String Name) {
        Book book = new Book(Name);
        bookArrayList.add(book);
    }

    public void show() {
        String s="";
        s+=Name + " 학생이 읽은 책은 : ";
        for (Book book : bookArrayList) {
            s+=book.getName()+" ";
        }
        System.out.println(s+"입니다");
    }
}
