import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main() {
        
    }



    public static void main(String[] args) {
        Scanner skaitytuvas= new Scanner(System.in);
        ArrayList<Preke>prekes=nuskaitoPrekesIsFailo("prekes.csv");

        System.out.println("kiekPrekiuSandelyje(prekes) = " + kiekPrekiuSandelyje(prekes));



    }

    public static ArrayList<Preke> nuskaitoPrekesIsFailo(String failoPavadinimas){
        ArrayList<Preke>prekes= new ArrayList<>();
        try {File failObjektas =new File(failoPavadinimas);
            Scanner skaitytuvas = new Scanner(failObjektas);
            skaitytuvas.nextLine();
            while (skaitytuvas.hasNextLine()){
                String eilute=skaitytuvas.nextLine();
                String[] stulpeliai= eilute.split(",");
                Preke laikinaPreke = new Preke(Integer.parseInt(stulpeliai[0]), stulpeliai[1], stulpeliai[2], Double.parseDouble(stulpeliai[3]), Integer.parseInt(stulpeliai[4]), stulpeliai[5], stulpeliai[6]);
                prekes.add(laikinaPreke);
                System.out.println("laikinaPreke = " + laikinaPreke);
            }

        }
        catch (FileNotFoundException e){
            e.printStackTrace();
            System.out.println("Nera tokio failo");

        }
        return prekes;

    }
    public static int kiekPrekiuSandelyje(List<Preke> prekes){
        int suma=0;
        for (Preke preke :prekes){
            suma += preke.getKiekisSandelyje();
        }
        return suma;
    }
    public static double listoMaximumas(List<Preke> prekes) {
        double laikinasMaximumas = prekes.get(0).getKaina();
        for (Preke preke: prekes) {
            if (preke.getKaina() > laikinasMaximumas) {
                laikinasMaximumas=preke.getKaina();
            }

            }
        }
        return laikinasMaximumas;


}
