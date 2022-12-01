package Zadaca9;
import java.util.ArrayList;
class Fakultet {
    private String ime;
    private int brojSmerovi;
    private int vkupnoStudenti;

    public Fakultet(String ime, int brojSmerovi, int vkupnoStudenti) {
        this.ime = ime;
        this.brojSmerovi = brojSmerovi;
        this.vkupnoStudenti = vkupnoStudenti;
    }

    public String getIme() {
        return ime;
    }

    public int getBrojSmerovi() {
        return brojSmerovi;
    }

    public int getVkupnoStudenti() {
        return vkupnoStudenti;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setBrojSmerovi(int brojSmerovi) {
        this.brojSmerovi = brojSmerovi;
    }

    public void setVkupnoStudenti(int vkupnoStudenti) {
        this.vkupnoStudenti = vkupnoStudenti;
    }
}
    public class Glavna {
        public static void main(String[] args) {
            ArrayList<Fakultet> lista = new ArrayList<Fakultet>();

            Fakultet f = new Fakultet("Fikt",2, 500);
            lista.add(f);
            lista.add(new Fakultet("Biotehnicki", 5, 600));
            lista.add(new Fakultet("Praven", 3, 350));
            lista.add(new Fakultet("Umetnicki", 4, 700));
            lista.add(new Fakultet("Akademija", 5, 150));

            for (int i = 0; i < lista.size(); i++) {
                System.out.println(lista.get(i).getIme());
                System.out.println(lista.get(i).getBrojSmerovi());
                System.out.println(lista.get(i).getVkupnoStudenti());
            }
        }
    }


