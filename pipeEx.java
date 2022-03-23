import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class pipeEx {
   public static void main(String[] args) {
       try {
           PipedInputStream pi = new PipedInputStream();
           PipedOutputStream po = new PipedOutputStream();
           po.connect(pi);
           po.write(68);
           System.out.println((char)pi.read());  
           pi.close();
           po.close();      
       } catch (IOException e) {
           System.out.println(e.getMessage());
              }
   } 
}
