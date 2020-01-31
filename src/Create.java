import java.io.File;
import java.io.IOException;

public class Create {
    public void createFiles(int x) {
        for (x = 1; x <= 4; x++) {
            File newFile = new File("C:/Users/46737/Desktop/newFile"+x+".txt");
            if (newFile.exists()) {
                System.out.println("Already there!");
            } else {
                try {
                    newFile.createNewFile();

                } catch (IOException e) {
                    e.printStackTrace();
                }
                {
                }
            }
        }
    }
}

