package inputoutput;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class io3 {
    public static void main(String[] args) throws IOException {
        String filePath = "D:/Coding Assignments/inputoutput/input.txt";
        FileInputStream fis = new FileInputStream(filePath);
        BufferedInputStream bis = new BufferedInputStream(fis);
        int i;
        while ((i = bis.read()) != -1) {
            System.out.print((char) i);
        }
        bis.close();
        fis.close();
    }
}
