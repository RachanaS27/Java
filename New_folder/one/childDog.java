package New_folder.one;
import New_folder.dog;

public class childDog extends dog{

    public childDog() {
        System.out.println("child dog constructor invoked");
    }
    
    public void barking()
    {
        System.out.println("child dog is barking");
    }

    @Override
    public void eating()
    {
        System.out.println("child dog is eating");
    }

    public static void main(String[] args) {
        dog d = new dog("Bolt", 10, "Husky", 2000);
        childDog pup = new childDog();
        System.out.println(d.breed);
        System.out.println(d);
        pup.eating();
        pup.sleeping();
        pup.barking();
        d.eating();
    }
}
