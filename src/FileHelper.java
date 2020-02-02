import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileHelper {

    public void createFile(String fullPathWithName) {
        File newFile = new File(fullPathWithName);
        if (newFile.exists()) {
            System.out.println("Already there!");
        } else {
            try {
                newFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void replaceAll(String fullPathWithName, String oldString, String newString) throws IOException {

        String fileContent = new String (Files.readAllBytes(Paths.get(fullPathWithName)));

        String fileContentAfterReplacement = fileContent.replaceAll(oldString, newString);

        PrintWriter pw = new PrintWriter(fullPathWithName);
        pw.print(fileContentAfterReplacement);
        pw.close();
    }

    public boolean compare(String filePath1, String filePath2) throws IOException {
        String fileContent1 = new String (Files.readAllBytes(Paths.get(filePath1)));
        String fileContent2 = new String (Files.readAllBytes(Paths.get(filePath2)));
        return fileContent1.equals(fileContent2);
    }
}

