import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class pipeEx {
   public static void main(String[] args) throws InterruptedException {
    char ch[] = {'a','b','s'};   
    try {
           PipedInputStream pi = new PipedInputStream();
           PipedOutputStream po = new PipedOutputStream();
           po.connect(pi);
           for(int i=0;i<ch.length;i++){
           po.write(ch[i]);
           System.out.println((char)pi.read()); 
           } 
           pi.close();
           po.close();      
       } catch (IOException e) {
           System.out.println(e.getMessage());
              }
   } 
}
