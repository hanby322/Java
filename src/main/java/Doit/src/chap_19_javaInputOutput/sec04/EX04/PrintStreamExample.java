package chap_19_javaInputOutput.sec04.EX04;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class PrintStreamExample {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        // File 객체 생성
        File outFile1 = new File("src/chap_19_javaInputOutput/sec04/EX04/files/PrintStream1.txt");
        File outFile2 = new File("src/chap_19_javaInputOutput/sec04/EX04/files/PrintStream2.txt");
        if (!outFile1.exists()) outFile1.createNewFile();
        if (!outFile2.exists()) outFile2.createNewFile();

        // 1. PrintStream(FileOutputStream(File)
        try (OutputStream os1 = new FileOutputStream(outFile1);
             PrintStream ps = new PrintStream(os1);) {
            ps.println(5.8);
            ps.print(3 + " 안녕" + 12345 + "\n");
            ps.printf("%d ", 7).printf("%s %f", "안녕", 5.8);
            ps.println();
        } catch (IOException e) {
        }
        // 2. PrintStream(File)
        try (PrintStream ps = new PrintStream(outFile2);) {
            ps.println(5.8);
            ps.print(3 + " 안녕" + 12345 + "\n");
            ps.printf("%d ", 7).printf("%s %f", "안녕", 5.8);
            ps.println();
        } catch (IOException e) {
        }
        // 3. PrintStream ps = System.out
        try (OutputStream os2 = System.out;
             PrintStream ps = new PrintStream(os2)) {
            ps.println(5.8);
            ps.print(3 + " 안녕" + 12345 + "\n");
            ps.printf("%d ", 7).printf("%s %f", "안녕", 5.8);
            ps.println();
        } catch (IOException e) {
        }
    }
}
