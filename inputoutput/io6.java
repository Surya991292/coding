package inputoutput;

import java.io.FileWriter;
import java.io.IOException;

public class io6 {
    public static void main(String[] args) throws IOException {
        String filePath = "D:/Coding Assignments/inputoutput/output.txt";
        FileWriter fw = new FileWriter(filePath);
        fw.write("Writing using FileWriter!");
        fw.close();
        System.out.println("File written successfully.");
    }
}
