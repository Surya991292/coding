package inputoutput;

import java.io.FileReader;
import java.io.IOException;

public class io5 {
    public static void main(String[] args) throws IOException {
        String filePath = "D:/Coding Assignments/inputoutput/input.txt";
        FileReader fr = new FileReader(filePath);
        int i;
        while ((i = fr.read()) != -1) {
            System.out.print((char) i);
        }
        fr.close();
    }
}
