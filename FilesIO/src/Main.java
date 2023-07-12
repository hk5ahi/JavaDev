import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Problem 1: Create a program that reads the contents of a text file and counts the number of words and lines in it.
        // Problem 2: Write a program that handles file-related exceptions, such as file not found, permission denied, or invalid file format exceptions.
        // Problem 3: Implement a program that uses the try-with-resources statement to automatically close file streams and resources after usage.
        File file = new File("FilesIO/src/txt.txt");
        try(FileReader fileReader = new FileReader(file)) {

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            int lineCount = 0;
            int wordCount = 0;
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                lineCount++;
                String[] words = line.split(" ");
                wordCount += words.length;
                System.out.println(line);
            }

            System.out.println("Number of lines: " + lineCount);
            System.out.println("Number of words: " + wordCount);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
