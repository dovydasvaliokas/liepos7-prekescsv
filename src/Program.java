import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

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
                System.out.println("laikinaPreke = " + laikinaPreke);
            }

        }
        catch (FileNotFoundException e){
            e.printStackTrace();
            System.out.println("Nera tokio failo");

        }
        return prekes;

    }
}
