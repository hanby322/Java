package chap_19_javaInputOutput.sec04.EX02;
import java.io.*;

public class DataInputOutputStream {
    public static void main(String[] args) throws IOException{
        // 파일 생성
        File dataFile = new File("src/chap_19_javaInputOutput/sec04/EX02/files/file1.data");
        if(!dataFile.exists()) {
            dataFile.createNewFile();
        }
        // 데이터 쓰기(DataOutputStream)
        try (OutputStream os = new FileOutputStream(dataFile);
             DataOutputStream dos = new DataOutputStream(os);){
            dos.writeInt(35);
            dos.writeDouble(5.8);
            dos.writeChar('A');
            dos.writeUTF("안녕하세요");
            dos.flush();
        } catch (IOException e) {e.printStackTrace();}
        // 데이터 읽기(DataInputStream)
        try (InputStream is = new FileInputStream(dataFile);
             DataInputStream dis = new DataInputStream(is);) {
            System.out.println(dis.readInt());
            System.out.println(dis.readDouble());
            System.out.println(dis.readChar());
            System.out.println(dis.readUTF());
        } catch (IOException e) {e.printStackTrace();}
    }
}
