import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
public class seqInputEx {
   public static void main(String[] args) {
       try {
           FileInputStream f1 = new FileInputStream("Names.txt");
           FileInputStream f2 = new FileInputStream("student.txt");
           SequenceInputStream si = new SequenceInputStream(f1,f2);
           int j;
           System.out.println( si.available());
           while((j=si.read())!=-1)
           {
               System.out.print((char)j);
           }
           System.out.println( si.available());
           si.close();
           f1.close();
           f2.close();
       } catch (IOException e) {
           System.out.println(e.getMessage());
        }
   } 
}
