package inputoutput;

import java.io.FileOutputStream;
import java.io.IOException;

public class io2 {
    public static void main(String[] args) throws IOException {
        String filePath = "D:/Coding Assignments/inputoutput/output.txt"; 
        FileOutputStream fos = new FileOutputStream(filePath);
        String text = "Hello, this is a test message!";
        fos.write(text.getBytes());
        fos.close();
        System.out.println("File written successfully.");
    }
}
