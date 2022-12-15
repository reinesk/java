package keyce;

public class parents {
    String IDparent;
    String nom;
    String prenom;
    Integer age;
    String sexe;
    Integer tel;
    String profession;

    parents Choupo = new parents();
    parents Marthe =new parents();

    public void inscription(){

    }

    public void DemandeReleve(){

    }

    public parents(String IDparent, String nom, String prenom, Integer age, String sexe, Integer tel, String profession, parents choupo, parents marthe) {
        this.IDparent = IDparent;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.sexe = sexe;
        this.tel = tel;
        this.profession = profession;

    }

    public parents() {

    }
}
