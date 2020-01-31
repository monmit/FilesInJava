import java.io.*;
import java.io.File;
import java.io.IOException;

public class CreateAndWrite {
    public void createAndWrite(){
        for(int x=0; x<=2; x++){
            File file = new File("C:/Users/46737/Desktop/newFile"+x+".txt");
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
            FileReader reader = null;
            try {
                reader = new FileReader(file);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            try {
                reader.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
            String oldContent = "Hello";
            String newContent = oldContent.replace("Hello", "Hello"+x);
            FileWriter writer = null;
            try {
                writer = new FileWriter(file);
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                writer.write(newContent);
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
