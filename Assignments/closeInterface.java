package Assignments;

import java.io.Closeable;
import java.io.IOException;

public class closeInterface implements Closeable{

    @Override
    public void close() throws IOException {
        System.out.println("Invoked close method");
        System.exit(0);
        
    }

    public static void main(String[] args) throws IOException {
        closeInterface ci = new closeInterface();
        ci.close();
    }
    
}
