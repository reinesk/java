public class Main {
    // Main method
    public static void main(String[] args) {

        System.out.println("Hello world!");
        FirstClass myObject = new FirstClass();
        System.out.println(myObject.x);
        FirstClass myObject2 = new FirstClass();
        System.out.println((myObject2.x) * 2);
        SecondClass mysObject = new SecondClass();
        System.out.println(mysObject.x);
        Etudiant Souksou = new Etudiant();
        Enseignant Babana = new Enseignant();
        System.out.println("Je m'appelle: " + Souksou.nom + " " + Souksou.prenom + " de matricule " + Souksou.Matricule + "," + " j'ai " + Souksou.age + "ans" + "," + " je suis de sexe " + Souksou.sexe + "," + " mon numero de telephone est " + Souksou.numero_tel + " et mon email est " + Souksou.email + "," + " je vis a " + Souksou.ville);
        System.out.println("Je m'appelle: " + Babana.nom + " " + Babana.prenom + " de matricule " + Souksou.Matricule + "," + " j'ai " + Babana.age + "ans" + "," + " je suis de sexe " + Babana.sexe + "," + " mon numero de telephone est " + Babana.numero_tel + "," + "j'enseigne " + Babana.matiere + " a " + Babana.ecole + "," + " je vis a " + Souksou.ville);

         myMethod();
         myStaticMethod(); // Call the static method
        // myPublicMethod() : On ne peut pas appeler une methode publique dans un contexte static

        Main reine= new Main();
        reine.myPublicMethod();

        Main myCar = new Main();       // Create a myCar object
        myCar.fullThrottle();         // Call the fullThrottle() method
        myCar.speed(200);    // Call the speed() method

    }


        static void myMethod() {
            System.out.println("Hello World!");

        }
        //static method
        static void myStaticMethod(){
        System.out.println("Static methods can be called without creating objects");

        }

        //Public method
        public void myPublicMethod(){
        System.out.println("Public methods must be called by creating objects");
        }

         // Create a fullThrottle() method
        public void fullThrottle(){
        System.out.println("The car is going as fast as it can!");
        }

       // Create a speed() method and add a parameter
        public void speed(int maxSpeed){
        System.out.println("Max speed is: "+maxSpeed);
        }

        // Inside main, call the methods on the myCar object











}