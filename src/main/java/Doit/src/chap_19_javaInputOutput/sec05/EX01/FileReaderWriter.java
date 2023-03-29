package chap_19_javaInputOutput.sec05.EX01;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
import java.io.IOException;
public class FileReaderWriter {
    public static void main(String[] args) throws IOException{
        // files 폴더 생성
        File createFolder = new File("src/chap_19_javaInputOutput/sec05/EX01/files");
        if(!createFolder.exists()) createFolder.mkdirs();
        // 파일 객체 생성
        File readerWriterFile = new File("src/chap_19_javaInputOutput/sec05/EX01/files/Reader WriterFile.txt");
        // 1. FileWriter를 이용한 파일 쓰기(UTF-8 모드)
        try (Writer writer = new FileWriter(readerWriterFile)) {
            writer.write("안녕하세요\n".toCharArray());
            writer.write("Hello");
            writer.write('\r');
            writer.write('\n');
            writer.write("반갑습니다.", 2, 3); // 습니다
            writer.flush();
        } catch (IOException e) {}
        // 2. FileReader를 이용한 파일 읽기(UTF-8 모드)
        try(Reader reader = new FileReader(readerWriterFile)) {
            int data;
            while((data = reader.read()) != -1) {
                System.out.print((char)data);
            }
        } catch (IOException e) {}
    }
}
