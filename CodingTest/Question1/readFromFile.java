package CodingTest.Question1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class readFromFile {
    public static void main(String[] args) {
        
        try {
            File f1 = new File("CodingTest/Question1/file1.txt");
            File f2 = new File("CodingTest/Question1/file2.txt");
            FileReader reader = new FileReader(f1);
            FileWriter writer = new FileWriter(f2);
            int ch;
            String data="";
            while((ch=reader.read())!=-1){
                char letter = (char)ch;
                data += letter;
            }
            reader.close();
            writer.append(data);
            writer.close();
            
        } catch (IOException e) {
            System.out.println("Error occured during file data transfer");
        }
    }
}
