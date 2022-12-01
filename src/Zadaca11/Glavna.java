package Zadaca11;
import java.util.ArrayList;
public class Glavna {
    public static void main(String[] args) {
        ArrayList<String> list1 =  new ArrayList<String>();
        list1.add("Kuche");
        list1.add("Macka");
        list1.add("Srna");

        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("Riba");
        list2.add("Kuche");
        list2.add("Hrcak");

        list1.retainAll(list2);

        System.out.println(list1);
    }
}

