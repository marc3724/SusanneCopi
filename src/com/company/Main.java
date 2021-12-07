package com.company;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        DbSql db = new DbSql();
       // db.opretTabelStud();
        Studerende s = new Studerende(1, "Anne", "Andersen", "Annevej 5", "2000", "12121212", "1a");
        //db.indsaetStud(s);
        Studerende s1 = new Studerende(2, "Bent", "Jensen", "Bentvej 7", "2000", "12345678", "1b");
        //db.indsaetStud(s1);

     /*  StudContainer sc= new StudContainer();
       try {
           sc.laesTxtFil();
       } catch (FileNotFoundException exception) {
           exception.printStackTrace();
       }

       OutputSkaerm os=new OutputSkaerm();

       os.udskrivStudListe(sc);*/

        //db.indsaetStudListe(sc);


        //db.opretTabelfag();
        Fag f = new Fag(1, "Matematik");
        //db.indsaetFag(f);
        f.setFagnr(5);
         f.setFagnavn("Systemudvikling");
         //db.indsaetFag(f);
        //db.opretTabelStudFag();


      /*  StudFagContainer sfc=new StudFagContainer();
        try {
            sfc.laesTxtFil();
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        }*/
        //  sfc.udskrivSkaerm();
        //   db.indsaetStudFagListe(sfc);

       /* s=db.soegStnnr(3);
        os.udskrivStud(s);*/


       /* ArrayList<Studerende> tabel;
        tabel = db.soegefternavn("Hansen");

        OutputSkaerm os=new OutputSkaerm();
        for (int i = 0; i < tabel.size(); i++) {
            s=tabel.get(i);
            os.udskrivStud(s);

        }*/
       /* OutputSkaerm os = new OutputSkaerm();
        ArrayList<Studerende> tabelalle;
        tabelalle = db.allestud();

        for (int i = 0; i < tabelalle.size(); i++) {
            s = tabelalle.get(i);
            os.udskrivStud(s);
        }
        Studerende s2=new Studerende();
        s2=db.soegStnnr(5);
        System.out.println(s2.toString());  */

        /*ArrayList<StudFag> tabel2;
        tabel2=db.alleoplysninger();
        for(int i=0;i<tabel2.size();i++){
            System.out.print(tabel2.get(i).getS().getFnavn());
            System.out.println(tabel2.get(i).getF().getFagnr());
            System.out.println(("%s %d %s \n") );

        }
        */

    }
}