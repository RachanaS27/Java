import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class fileHandling {
    public static void main(String[] args) {
        
        try {
            File file = new File("Names.txt");
            FileReader reader = new FileReader(file);
            String data = "";
            int letter = reader.read();
            while(letter!=-1)
            {
                char l = (char)letter;
                data += l ;
                System.out.print(l);
                letter = reader.read();
            }
            reader.close();
            
            FileWriter writer = new FileWriter(file);
            writer.append(data+" ,Rakesh, Ramya");
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("No such file exists");
        }
        catch(IOException e){
            System.out.println("Cannot read the file");
        }

    }
}
