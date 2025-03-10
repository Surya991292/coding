package inputoutput;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class io8 {
    public static void main(String[] args) throws IOException {
        String filePath = "D:/Coding Assignments/inputoutput/output.txt";
        BufferedWriter bw = new BufferedWriter(new FileWriter(filePath));
        bw.write("BufferedWriter example.");
        bw.close();
        System.out.println("File written successfully.");
    }
}
