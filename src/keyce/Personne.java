package keyce;

import java.util.Date;

public class Personne {
    private int IdPersonne;
    private  String Nom="Souksouna";
    private String Prenom="Reine";
    private Date DateNaissance;
    private String adresse;
    private String email;



    public void surfer(){
        System.out.println("je surfe sur internet");

    }

    public void telephoner(){
        System.out.println("je telephone");

    }

    public int getIdPersonne() {
        return IdPersonne;
    }

    public void setIdPersonne(int idPersonne) {
        IdPersonne = idPersonne;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String prenom) {
        Prenom = prenom;
    }

    public Date getDateNaissance() {
        return DateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        DateNaissance = dateNaissance;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
