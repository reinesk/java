package keyce;

public class enseignant {
    private String IDenseignant;
    private String matricule="";
    private String nom="ange";
    private String prenom;
    private Integer age;

    public String getIDenseignant() {
        return IDenseignant;
    }

    public void setIDenseignant(String IDenseignant) {
        this.IDenseignant = IDenseignant;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMatiere() {
        return matiere;
    }

    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }

    private String sexe;
    private Integer tel;
    private String email;
    private String matiere;

    //keyce.enseignant Meloli= new keyce.enseignant();
    //keyce.enseignant Mendjemen = new keyce.enseignant();

    public void DispenserCours(){

    }

    public void CorrigerEvaluation(){

    }

    public enseignant(){

    }


    public enseignant(String IDens, String matricule, String nom, String prenom, Integer age, String sexe, Integer tel, String email, String matiere) {
        this.IDenseignant = IDens;
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.sexe = sexe;
        this.tel = tel;
        this.email = email;
        this.matiere = matiere;

    }
}
