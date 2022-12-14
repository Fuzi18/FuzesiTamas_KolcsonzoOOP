package hu.petrik.kolcsonzooop;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    static List<Kolcsonozheto> katalogus= new ArrayList<>();
    static List<Dvd> dvdk= new ArrayList<>();

    public static void main(String[] args) {
        Konyv konyv1= new Konyv("A Gyűrűk ura","J.R.R. Tolkie", "AABBCC-121314");
        Dvd dvd1= new Dvd("Star Wars V.rész", 124);
        Dvd dvd2= new Dvd("Star Wars VI.rész", 103);
        Dvd dvd3= new Dvd("Gyűrűk ura", 178);
        Ujsag ujsag1 = new Ujsag("Képes Sport", 2007, 23);
        Kolcsonozheto kolcsonozheto= new Kolcsonozheto() {
            @Override
            public String megjelenitendoNev() {
                return null;
            }

            @Override
            public int meddigKolcsonozheto() {
                return 0;
            }
        };

        System.out.println(konyv1.getIsbn());
        System.out.println(konyv1.megjelenitendoNev());

        katalogus.add(konyv1);
        katalogus.add(dvd1);
        katalogus.add(dvd2);
        katalogus.add(dvd3);
        katalogus.add(ujsag1);

        dvdk.add(dvd1);
        dvdk.add(dvd2);
        dvdk.add(dvd3);

        for (Kolcsonozheto k :katalogus) {
            System.out.println(k.megjelenitendoNev() + " " + k.meddigKolcsonozheto());


        }
        Collections.sort(dvdk);
        System.out.println();
        for (Dvd d:dvdk) {
            System.out.println(d.megjelenitendoNev() + " " + d.getHossz());

        }

    }
}
