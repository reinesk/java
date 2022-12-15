package keyce;

public class staff {
    String IDstaff;
    String nom;
    String prenom;
    String sexe;
    String DateNaiss;
    Integer tel;
    String email;
    String poste;

    staff Aida= new staff();
    staff Bencini = new staff();

    public void Renvoyer(){

    }

    public void Embaucher(){

    }

    public staff(){

    }

    public staff(String IDstaff, String nom, String prenom, String sexe, String dateNaiss, Integer tel, String email, String poste) {
        this.IDstaff = IDstaff;
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
        DateNaiss = dateNaiss;
        this.tel = tel;
        this.email = email;
        this.poste = poste;
    }
}
