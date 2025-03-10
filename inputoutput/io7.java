package inputoutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class io7 {
    public static void main(String[] args) throws IOException {
        String filePath = "D:/Coding Assignments/inputoutput/input.txt";
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }
}
