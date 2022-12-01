package Zadaca2;
import java.util.ArrayList;
import java.util.List;
public class Glavna{
    public static void main(String[] args){
        List<String> list1=new ArrayList<String>();
        list1.add("Makedonija");
        list1.add("Srbija");
        list1.add("Hrvatska");
        list1.add("Italija");
        list1.add("Rusija");
        System.out.println("Listata ima: "+list1.size()+" elementi.");
        if(list1.size() == 3) {
            list1.add("Egipet");
            list1.add("Germanija");
            System.out.println(list1);
        }
        else {
            System.out.println(list1);
        }
    }
}
