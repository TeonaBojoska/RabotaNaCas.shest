package Zadaca10;
import java.util.ArrayList;
public class Glavna {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Kuche");
        list.add("Macka");
        list.add("Lav");
        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("Lisica");
        list2.add("Hrcak");
        list2.add("Riba");

        list.addAll(list2);

        System.out.println(list);
    }
}

