import java.io.*;

public class Write {
    public void writeToFile() {
    File f = new File("C:/Users/46737/Desktop/newFile1.txt");
    String oldContent = "Hello";
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(f));
        // whatif i had written like:
        // BufferedReader reader = new BufferedReader (f);
        // or FileReader reader = new FileReader (f);
        // reader.readLine();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String newContent = oldContent.replace("Hello","Hello1");
        FileWriter writer = null;
        try {
            writer = new FileWriter(f);
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