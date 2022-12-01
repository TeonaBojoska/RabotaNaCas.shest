package Zadaca8;
import java.util.ArrayList;
public class Glavna {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 5; i < 21; i=i+5) {
            System.out.println("mail" + i + "yahoo@.com");
        }
        for (int i = 0; i <list.size(); i=i+5) {
            System.out.println(list.get(i));
        }
    }
}
