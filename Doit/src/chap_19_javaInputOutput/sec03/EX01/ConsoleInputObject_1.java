package chap_19_javaInputOutput.sec03.EX01;
import java.io.IOException;
import java.io.InputStream;

public class ConsoleInputObject_1 {
    public static void main(String[] args) throws IOException{
        // InputStream 객체 생성
        InputStream is = System.in;
        int data;
        while((data = is.read()) != '\n') {
            System.out.println("읽은 데이터: " + (char)data + " 남은 바이트 수: " + is.available());
        }
        System.out.println("data: " + data); // \n (13)
//        System.out.println(is.read()); // \n (10)
    }
}
