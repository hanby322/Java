package chap_19_javaInputOutput.sec02.EX05;
import javax.imageio.spi.ImageOutputStreamSpi;
import java.io.File;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;

public class FileOutputStream_2 {
    public static void main(String[] args) throws IOException{
        // 1. 입력 파일 생성
        File outFile = new File("src/chap_19_javaInputOutput/sec02/files/FileOutputStream2.txt");
        if(!outFile.exists()) {
            outFile.createNewFile();
        }
        // 2. n-byte 단위 쓰기(byte[]의 처음부터 끝까지 데이터 쓰기)
        OutputStream os2 = new FileOutputStream(outFile, true); // 내용 연결
        byte[] byteArray1 = "안녕하세요".getBytes("UTF-8");
        os2.write(byteArray1);
        os2.write('\n');
        os2.flush();
        os2.close();
        // 3. n-byte 단위 쓰기(byte[]의 offset부터 length개의 byte 데이터 쓰기)
        OutputStream os3 = new FileOutputStream(outFile, true); // 내용 연결
        byte[] byteArray2 = "반갑습니다.".getBytes(Charset.defaultCharset()); // == .getBytes("UTF-8")
        os3.write(byteArray2, 6, 6);
        os3.flush();
        os3.close();
    }
}
