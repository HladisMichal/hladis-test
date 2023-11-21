import java.util.ArrayList;
import java.util.List;

public class Objednavka {
    public static void main(String[] args) {
        ArrayList<Zbozi> seznamZbozi = new ArrayList<>();

        //seznamZbozi.remove();

        Zbozi zbozi1 = new Zbozi("kleště",20,false,11);
        Zbozi zbozi2 = new Zbozi("šroubovák",15,true,10);
        seznamZbozi.add(zbozi2);
        seznamZbozi.add(zbozi1);

        int celkovaCena = 0;
        for (Zbozi z: seznamZbozi)
        {
            celkovaCena = z.getCena() * z.getPocetKusu();
            if (z.isMaSnizenouDph()){
                System.out.println(z.getPopis());
            }
        }
        System.out.println("Celková cena: " + celkovaCena);

     
        }
    }

