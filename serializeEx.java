import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class serializeEx {
    public static void main(String[] args) {
        try {
            ball b1 =  new ball("yellow", 80, "rubber", "tennis");
            FileOutputStream fo = new FileOutputStream("Names.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fo);
            oos.writeObject(b1);
            oos.flush();
            oos.close();
            fo.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());  
      }
    }
}
