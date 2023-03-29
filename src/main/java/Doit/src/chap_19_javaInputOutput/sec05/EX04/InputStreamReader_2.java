package chap_19_javaInputOutput.sec05.EX04;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReader_2 {
    public static void main(String[] args) throws IOException{
        // 콘솔로 입력(UTF-8)
        try {
            InputStreamReader isr = new InputStreamReader(System.in, "UTF-8");
            int data;
            while((data = isr.read()) != '\n') {
                System.out.print((char)data);
            }
            System.out.println("\n" + isr.getEncoding());
        } catch (IOException e) {}
        // 콘솔로 입력(MS949)
        try {
            InputStreamReader isr = new InputStreamReader(System.in, "MS949");
            int data;
            while((data = isr.read()) != '\n') {
                System.out.print((char)data);
            }
            System.out.println("\n" + isr.getEncoding());
        } catch (IOException e) {}
    }
}
