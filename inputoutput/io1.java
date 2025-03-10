package inputoutput;
import java.io.FileInputStream;
import java.io.IOException;

public class io1 {
    public static void main(String[] args) throws IOException {
        String filePath = "D:/Coding Assignments/inputoutput/input.txt"; // Change this to your actual file path
        FileInputStream fis = new FileInputStream(filePath);
        int i;
        while ((i = fis.read()) != -1) {
            System.out.print((char) i);
        }
        fis.close();
    }
}
