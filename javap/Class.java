class Dino{
    int legs=10;
    void hunt(){
        System.out.println("hunt for food");
    }
    void sleep()
    {
        System.out.println("sleep");
    }
    }
class cube extends Dino{

}
class lion extends Dino{
    void king(){
        System.out.println("king of jungle");
    }
}
public class Class {
    public static void main(String[] args) {
        Dino d = new Dino();
        cube c = new cube();
        lion l = new lion();
    }
}
