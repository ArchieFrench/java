import java.io.*;

/**
 * Writes to file
 */
public class Writer{
    FileWriter fw;

    /**
     * Creates writer for a specific file
     * @param filePath relative path to the file
     */
    public Writer(String filePath) {
        try {
            fw = new FileWriter(filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Writes to file
     * @param line String written to file
     */
    public void write(String line) {
        try {
            fw.write(line);
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
