import java.io.IOException;
import java.io.RandomAccessFile;

public class randomAccessEx {
    public static void main(String[] args)
    {
        try
        {
           //float num = 65.0f;
            RandomAccessFile r1 = new RandomAccessFile("Names.txt", "rw");
            r1.seek(0);
            //System.out.println(r1.readLine());
            r1.write(65);
            //r1.seek(0);
           // System.out.println(r1.readLine());
           //r1.writeFloat(num);
            //r1.writeChar('v');
            //r1.writeDouble(99.77);
            //r1.seek(0);
            r1.writeBytes("1782.2");  
            r1.seek(0);

            System.out.println(r1.readLine());
            r1.close();
        }
        catch (IOException ex)
        {
            System.out.println("Something went Wrong");
            ex.printStackTrace();
        }
    }
}
