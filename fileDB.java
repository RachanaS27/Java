import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class fileDB {
    
    public  String addEmp(employeeModel model)
    {
        String preData = getAll();
        try {
        File file = new File("empdetailFile.txt");
        FileWriter writer = new FileWriter(file);
        
        if(preData.isBlank())
       {
           
           writer.append(model.toString());
        }else
       {
           
            System.out.println(preData+"\n");
            writer.append(preData+"\n"+ model.toString());
        }
        writer.close();
        return "Data was added successfully";
        } catch (IOException e) {
            return "Something went wrong "+e.getMessage();
        }
       
    }

    public  String getAll()
    {
        File file = new File("empdetailFile.txt");

        try {
            FileReader reader = new FileReader(file);
            int ch;
            StringBuffer sb = new StringBuffer();
            while((ch =reader.read())!=-1)
            {
                sb.append((char)ch);
            }
            reader.close();
            String str = sb.toString();
            return str;
        } catch (IOException e) {
            return "Something went wrong "+e.getMessage();
        }
        
    }

    public  String deleteEmp(String id)
    {
        if(getAll().contains(id))
        {
            String[] arr = getAll().split("employeeModel ");
            for (String string : arr) {
                System.out.println(string);
            }
            File file = new File("empdetailFile.txt");
            
            try {
                FileWriter writer = new FileWriter(file);
                StringBuffer sb = new StringBuffer();
                for (String ch : arr)
                 {

                    if(!ch.contains(id)) {
                        if(ch.startsWith("EmpModel")) {
                            sb.append(ch);
                        } else {
                            sb.append("EmpModel" + ch);
                        }
                }
            }
                writer.append(sb.toString());
                writer.close();
                return "data is deleted with Id "+id;
            } catch (IOException e) {
                return "Something went wrong "+e.getMessage();
                
            }
           
        }
        return "";
    }
}
