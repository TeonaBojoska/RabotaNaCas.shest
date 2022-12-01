package Zadaca3;
import java.util.ArrayList;
import java.util.List;
public class Glavna {
    public static void main(String[] args){
        List<String> iminja=new ArrayList<String>();
        iminja.add("INKI");
        iminja.add("IKT");
        iminja.add("KNI");

        iminja.add(2,"Mis");
        System.out.println("Elemntite so smenat element na tretoto mesto se: "+iminja);

    }
}
