package keyce;

// abstract class
abstract class PetitFrere {
    public String fname = "choupo";
    public int age = 19;


    public abstract void obeir(); // abstract method

}

//subclass
public class Student extends PetitFrere{
    public int graduationYear = 2018;

    public void obeir() {
        System.out.println("Studying all day long");
    }
}




