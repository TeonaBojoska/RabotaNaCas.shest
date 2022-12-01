package Zadaca7;
import java.util.ArrayList;
public class Glavna {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 1; i < 21; i++) {
            if (i<10)
                list.add("mail0" + i + "yahoo@.com");
            else
                list.add("mail"+i+"yahoo@.com");
        }
        for (int i = 0; i <list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
