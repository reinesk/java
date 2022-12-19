package keyce1;

import keyce.*;

public class Main {
    public static void main(String[] args) {

        Etudiant reine= new Etudiant();
        reine.surfer();
        reine.telephoner();

        String o = reine.getNom();
        System.out.println(o);

        parents marthe =  new parents(); // on cree un objet marthe dans la classe parents
        marthe.surfer(); // heritage des methodes de la classe parent sur l'objet marthe
        marthe.telephoner();

        enseignant meloli = new enseignant();
        meloli.surfer();
        meloli.telephoner();

        staff aida = new staff();
        aida.surfer();
        aida.telephoner();






    }
}

