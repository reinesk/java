package keyce1;

import keyce.Etudiant;
import keyce.Student;
import keyce.enseignant;

public class Main {
    public static void main(String[] args) {

        Student frida = new Student();
        frida.obeir();

        System.out.println("Hello world!");

        Etudiant Reine = new Etudiant();
        int x = Reine.getIDetudiant();
        System.out.println(x);
        Reine.setIDetudiant(2002);
        int y = Reine.getIDetudiant();
        System.out.println(x);

        enseignant ange = new enseignant(); // creation de l'objet ange
        String a = ange.getNom();// recuperer la valeur de la variable nom lorsqui est declare en private et l'affecter dans la variable a
        System.out.println(a); // afficher la variable qu'on a recupere
        ange.setNom("Mathieu");/// modifier la valeur de la varaiable nom de la classe keyce.enseignant
        String b = ange.getNom();// affectation de la nouvelle valeur dans une variable
        System.out.println(b);// afficher la nouvelle valeur quon affecte a la variable nom de la classe keyce.enseignant






    }
}

