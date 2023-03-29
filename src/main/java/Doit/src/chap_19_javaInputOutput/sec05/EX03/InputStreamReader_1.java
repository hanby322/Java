package chap_19_javaInputOutput.sec05.EX03;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReader_1 {
    public static void main(String[] args) throws IOException{
        // 파일 객체 생성
        File inputStreamReader = new File("src/chap_19_javaInputOutput/sec05/EX03/files/InputStreamReader.txt");
        // 1. FileReader를 이용한 파일 읽기
        try (Reader reader = new FileReader(inputStreamReader)){
            int data;
            while ((data = reader.read()) != -1) {
                System.out.print((char)data);
            }
        } catch (IOException e) {}
        System.out.println();
        // 2. FileInputStream + InputStreamReader를 이용한 파일 읽기
        try (InputStream is = new FileInputStream(inputStreamReader);
            InputStreamReader isr = new InputStreamReader(is, "MS949");) {
            int data;
            while ((data = isr.read()) != -1) {
                System.out.print((char)data);
            }
            System.out.println("\n" + isr.getEncoding()); // MS949
        } catch (IOException e) {}
    }
}
