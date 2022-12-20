package keyce;
// si toutr
public class Pig implements Animal{// elle permet d'acceder aux methodes de l'inetrface grace  au mot cle implement
    public void animalsound(){
        System.out.println("the pig said: wee wee");

    }

    public void run(){
        System.out.println("le porc fuit quand il me voit");
    }

    public void sleep(){
        System.out.println("je dors");
    }
}
