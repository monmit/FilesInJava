import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Compare {
    public void compare(){
        BufferedReader file1 = null;
        try {
            file1 = new BufferedReader(new FileReader("C:/Users/46737/Desktop/newFile1.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader file2 = null;
        try {
            file2 = new BufferedReader(new FileReader("C:/Users/46737/Desktop/newFile2.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            if(file1.readLine().equalsIgnoreCase(file2.readLine())){
                System.out.println("Same");
            }else{
                System.out.println("Different");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            file1.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            file2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
