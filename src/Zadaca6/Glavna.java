package Zadaca6;
import java.util.ArrayList;
public class Glavna {
    public static void main(String[] args){
        ArrayList<String> list1=new ArrayList<String>();
        for (int i=1; i<21; i++){
            System.out.println("mail"+i+"yahoo@.com");
        }
        for(int i=0;i<list1.size();i++){
            System.out.println(list1.get(i));
        }
    }
}
