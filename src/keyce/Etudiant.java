package keyce;

import java.util.*;

public class Etudiant {
    private int IDetudiant=1001;
    private String matricule;
    private String nom;
    private String prenom;
    private Integer age;
    private String sexe;
    private Integer tel;
    private String ecole;
    private String ville;

    //keyce.Etudiant Reine= new keyce.Etudiant();
    //keyce.Etudiant Marc = new keyce.Etudiant();

    public int getIDetudiant() {
        return IDetudiant;
    }

    public void setIDetudiant(int IDetudiant) {
        this.IDetudiant = IDetudiant;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public Integer getTel() {
        return tel;
    }

    public void setTel(Integer tel) {
        this.tel = tel;
    }

    public String getEcole() {
        return ecole;
    }

    public void setEcole(String ecole) {
        this.ecole = ecole;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public void Composer(){

    }

    public void ParticiperCours(){

    }

    public Etudiant(){

    }

    public Etudiant(int IDetudiant, String matricule, String nom, String prenom, Integer age, String sexe, Integer tel, String ecole, String ville) {
        this.IDetudiant = IDetudiant;
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.sexe = sexe;
        this.tel = tel;
        this.ecole = ecole;
        this.ville = ville;

    }
}
