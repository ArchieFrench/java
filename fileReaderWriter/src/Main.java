

public class Main {
    public static void main(String[] args) {
        Reader reader = new Reader("src/input.txt");
        Writer writer = new Writer("src/output.txt");
        String line;

        System.out.println("File is ready: " + reader.isReady());
        line = reader.getLine();
        System.out.println(line);

        writer.write(line);
        System.out.println("Wrote to file");
    }
}
