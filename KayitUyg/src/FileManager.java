import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author Efe
 */
public class FileManager {
    File f = new File("log.txt");
    
    public FileManager() {
        if(!f.exists()) {
            try {
                f.createNewFile();
            } catch (IOException ex) {
                System.out.println("Dosya olusturulamadi!");
            }
        }
    }
    
    public void Write(Person person) {
        String line = person.toString();
        String[] lines = line.split(";");
        
        try{
            BufferedWriter bWriter = new BufferedWriter(new FileWriter(f,true));
            
            for(int i = 0; i < lines.length; i++) {
                bWriter.write(lines[i]+" ");
            }
            bWriter.write("\n");
            
            bWriter.close();
        }
        catch(IOException ex){
            System.out.println("Dosyaya yazma hatasi!");
        }
    }
    
    public ArrayList <String> Read() {
        String line;
        ArrayList <String> lines = new ArrayList<>();
        int i = 0;
        try{
            BufferedReader bReader = new BufferedReader(new FileReader(f));
            
            while((line = bReader.readLine()) != null) {
                lines.add(line);
            }
            return lines;
        }
        catch(IOException ex) {
            System.out.println("Dosya okuma hatasi!");
            return null;
        }
    }
    
}
