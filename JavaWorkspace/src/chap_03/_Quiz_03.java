package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        String idCode = "901231-1234567"; // 주민등록번호 13자리

        // 주민등록번호 생년월일, 성별까지만 출력
        System.out.println(idCode.substring(0, 8));
        System.out.println(idCode.substring(0, idCode.indexOf("-") + 2));
    }
}
