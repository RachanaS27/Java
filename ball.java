import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ball implements Serializable,Comparable<ball>{
    
    String color;
    int size;
    String material;
    String game;


    static ball b1 = new ball("White", 180, "Rubber", "Football");
    static ball b2 = new ball("Red", 80, "Leather", "Cricket");

    public ball() {
    }

    public ball(String color, int size, String material, String game) {
        this.color = color;
        this.size = size;
        this.material = material;
        this.game = game;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public String getGame() {
        return game;
    }
    public void setGame(String game) {
        this.game = game;
    }

    @Override
    public String toString() {
        return "ball [color=" + color + ", game=" + game + ", material=" + material + ", size=" + size + "]";
    }

    public static void main(String[] args) {
        
        System.out.println(b1);
        System.out.println(b2);
        b1.setColor("Yellow");
        b2.setColor("white");
        b2.setGame("Baseball");
        System.out.println( b1.getGame());
        System.out.println(b1);
        System.out.println(b2);
       new ball().sortAll();

    }
    public void sortAll()
    {
        System.out.println("Invoked sort in comparable");
        List<ball> list1 = new ArrayList<>();
        list1.add(b1);
        list1.add(b2);
        System.out.println(b1.compareTo(b2));
        list1.forEach(System.out::println);
    }

    @Override
    public int compareTo(ball b2) {
        if(b1.size < b2.size)
        {
            return -1;
        }
        return 0;
    }

    
}
