package keyce;

public class matiere {
    String IDmatiere;
    String UniteEnseignement;
    String intitule;
    float credit;
    int VolumeHoraire;

    matiere math= new matiere();
    matiere java = new matiere();

    public void EtreDispenser(){

    }

    public void EtreValider(){

    }

    public matiere(){

    }

    public matiere(String IDmatiere,String UniteEnseignement,int credit,int VolumeHoraire, String intitule){
        this.IDmatiere=IDmatiere;
        this.credit=credit;
        this.intitule=intitule;
        this.UniteEnseignement=UniteEnseignement;
        this.VolumeHoraire= VolumeHoraire;

    }



}
