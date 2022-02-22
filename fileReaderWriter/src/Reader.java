import java.io.*;

/**
 * Reads files
 */
public class Reader {
    BufferedReader reader;

    /**
     * Creates Reader for a specific file
     * @param filePath relative path to the file
     */
    public Reader(String filePath) {
        try {
            this.reader = new BufferedReader(new FileReader(filePath));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * Gets a line from the file
     * @return the line
     */
    public String getLine() {
        String line = null;
        try {
            line = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return line;
    }

    /**
     * Determines if file is ready to read
     * @return if file is ready to read
     */
    public Boolean isReady() {
        Boolean result = false;

        try {
            result = reader.ready();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }
}
