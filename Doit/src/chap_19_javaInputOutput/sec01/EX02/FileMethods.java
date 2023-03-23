package chap_19_javaInputOutput.sec01.EX02;
import java.io.File;

public class FileMethods {
    public static void main(String[] args) {
        // C 드라이브 내에 temp 폴더가 업승ㄹ 때 생성
        File tempDir = new File("C:/temp");
        if(!tempDir.exists())
            tempDir.mkdir();
        // 1. 파일 객체 생성
        File file = new File("C:/Windows");
        // 2. 파일 메서드
        System.out.println("절대 경로: " + file.getAbsolutePath());
        System.out.println("폴더(?): " + file.isDirectory());
        System.out.println("파일(?): " + file.isFile());
        System.out.println("파일/폴더명: " + file.getName());
        System.out.println("부모 폴더: " + file.getParent());
        File newfile1 = new File("C:/temp/abc");
        System.out.println(newfile1.mkdir()); // 없던 폴더를 새롭게 생성할 때는 true를 리턴, 생성할 수 없거나 이미 있으면 false 리턴
        File newfile2 = new File("C:/temp/bcd/cde");
        System.out.println(newfile2.mkdir()); // bcd 라는 하위 폴더명이 없기 때문에 생성할 수 없어서 false 반환
        System.out.println(newfile2.mkdirs());
        File[] fnames = file.listFiles();
        for(File fname: fnames) {
            System.out.println((fname.isDirectory() ? "폴더: " : "파일: ") + fname.getName());
        }
    }
}
