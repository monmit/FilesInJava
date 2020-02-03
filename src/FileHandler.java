import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileHandler {
    //public FileHandler(String pathOfFile, String ice1_mode2, String fullPathOfFile){
       // System.out.println("Use File at"+fullPathOfFile+"to do anything you want!");
    //}

    public void ReplicateFiles(String filePath) throws IOException {
        File file = new File(filePath);
            file.createNewFile();

    }

    public void CopyContentOfFiles(String filePath1, String filePath2) throws IOException {
        String getFileContents = new String (Files.readAllBytes(Paths.get(filePath1)));
        FileWriter writeNewContentToFiles = new FileWriter(filePath2);
        writeNewContentToFiles.write(getFileContents);
        writeNewContentToFiles.close();
    }

    /*public void EditFiles(String filePath, int numberOfFilesToEdit, String oldString, String newString) throws IOException {
        File file = new File(filePath);
        for(int y=0; y<=numberOfFilesToEdit; y++){
            String fileContent = new String(Files.readAllBytes(Paths.get(String.valueOf((file))));
            String replacedFileContent = fileContent.replace(oldString, newString);
            FileWriter fileWriter = new FileWriter(filePath);
            fileWriter.write(replacedFileContent);
            fileWriter.close();
        }
    */

    public void CreateAndEditFiles(String filePath, String oldText, String newText) throws IOException {
            String getFileContents = new String (Files.readAllBytes(Paths.get(filePath)));
            String editedFileContents = getFileContents.replace(oldText, newText);
            FileWriter writeNewContentToFiles = new FileWriter(filePath);
            writeNewContentToFiles.write(editedFileContents);
            writeNewContentToFiles.close();
    }

}