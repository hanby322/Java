package chap_19_javaInputOutput.sec05.EX02;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.io.Reader;

public class BufferedReaderWriter {
    public static void main(String[] args) throws IOException {
        // 파일 객체 생성
        File readerWriterFile = new File("src/chap_19_javaInputOutput/sec05/EX02/files/BufferedFile.txt");
        // 1. FileWriter를 이용한 파일 쓰기(UTF-8 모드)
        try (Writer writer = new FileWriter(readerWriterFile);
             BufferedWriter bw = new BufferedWriter(writer);) {
            bw.write("안녕하세요\n".toCharArray());
            bw.write("Hello");
            bw.write('\r');
            bw.write('\n');
            bw.write("반갑습니다",2 , 3);
            bw.flush();
        } catch (IOException e) {}
        // 2. FileReader를 이용한 파일 읽기(UTF-8 모드)
        try(Reader reader = new FileReader(readerWriterFile);
            BufferedReader br = new BufferedReader(reader);) {
            String data;
            while ((data = br.readLine()) != null) {
                System.out.println(data);
            }
        } catch (IOException e) {}
    }
}
