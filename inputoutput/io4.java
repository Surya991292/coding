package inputoutput;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class io4 {
    public static void main(String[] args) throws IOException {
        String filePath = "D:/Coding Assignments/inputoutput/output.txt";
        FileOutputStream fos = new FileOutputStream(filePath);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        String text = "Buffered OutputStream example!";
        bos.write(text.getBytes());
        bos.close();
        fos.close();
        System.out.println("File written successfully.");
    }
}
