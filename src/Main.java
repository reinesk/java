public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        FirstClass myObject = new FirstClass();
        System.out.println(myObject.x);
        FirstClass myObject2 = new FirstClass();
        System.out.println((myObject2.x)*2);
        SecondClass mysObject = new SecondClass();
        System.out.println(mysObject.x);
        Etudiant Souksou = new Etudiant();
        System.out.println("Je m'appelle: "+ Souksou.nom +" "+Souksou.prenom+" de matricule "+Souksou.Matricule+","+" j'ai "+Souksou.age+ "ans"+ ","+" je suis de sexe "+Souksou.sexe+","+" mon numero de telephone est "+Souksou.numero_tel+ " et mon email est "+Souksou.email+ ","+" je vis a "+ Souksou.ville);

    }
}