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

        Etudiant souksouna =  new Etudiant();
        Etudiant.Programme choupo = souksouna.new Programme(); // creation d'un objet dans une classe imbrige
        String n = choupo.getNom(); // recuperer l'attribut nom de la classe mere Personne
        System.out.println("Voici le nom que recupere la variable "+ n);


        Pig george = new Pig();
        george.run();//appellation de la methode run de l'interface animal
        george.sleep();

        DaysOfTheWeek jour = DaysOfTheWeek.SUNDAY;
        System.out.println(jour);

        MonthsOfTheYear an = MonthsOfTheYear.OCTOBER;
        System.out.println(an);

        switch (jour){
            case MONDAY:
                System.out.println("Today is Monday");
                break;
            case TUESDAY:
                System.out.println("Today is Tuesday");
                break;
            case WEDNESDAY:
                System.out.println("Today is Wednesday");
                break;
            case THURSDAY:
                System.out.println("Today is Thursday");
                break;
            case FRIDAY:
                System.out.println("Today is Friday");
                break;
            case SATURDAY:
                System.out.println("Today is Saturday : ");
                break;
            case SUNDAY:
                System.out.println("Today is Sunday");
                break;


        }

        System.out.println("Voici les jours de la semaine : ");
        for (DaysOfTheWeek Day : DaysOfTheWeek.values()){ //liste les jours de la semaine
            System.out.println(Day);
        }

        System.out.println("Voici les mois de l'annee");
        for (MonthsOfTheYear Mois: MonthsOfTheYear.values()){ // liste les mois de l'am
            System.out.println(Mois);
        }











    }
}

