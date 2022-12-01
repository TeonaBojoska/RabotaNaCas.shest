package Zadaca4;
import java.util.ArrayList;
import java.util.Collections;
public class Glavna {
    public static void main(String[] args){
        ArrayList<Integer> list1=new ArrayList<Integer>();
        list1.add(7);
        list1.add(14);
        list1.add(98);
        list1.add(45);
        list1.add(36);
        Collections.sort(list1);
        System.out.println(list1);
    }
}
