import java.io.*;
public class CreateWriteCompare {
    public void createWriteCompare(){
        for(int x=0; x<=3; x++){
            File file = new File ("C:/Users/46737/Desktop/newFile"+x+".txt");
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
            // i wanted to write a while not null;
            BufferedReader file1 = null;
            try {
                file1 = new BufferedReader(new FileReader(file));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            try {
                file1.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            String oldString = "Ice1Mode2";
            String newString = oldString.replace("Ice1Mode2", "Ice"+x+"Mode2");
            FileWriter writer = null;
            try {
                writer = new FileWriter(file);
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                writer.write(newString);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
            BufferedReader file2 = null;
            try {
                file2 = new BufferedReader(new FileReader("C:/Users/46737/Desktop/newFile/File0.txt"));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            try {
                if(file1.readLine().equalsIgnoreCase(file2.readLine())){
                    System.out.println("Same Contents");
                }else{
                    System.out.println("Differences Found");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        System.out.println("Over with success");
    }
}
