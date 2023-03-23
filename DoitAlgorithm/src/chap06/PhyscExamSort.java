// 신체검사 데이터 배열을 정렬

package chap06;

import chap02.PhysicalExamination;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;

public class PhyscExamSort {
    // 신체검사 데이터
    static class PhyscData {
        String name;
        int height;
        double vision;

        // 생성자
        PhyscData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }

        // 신체검사 데이터를 문자열로 반환
        @Override
        public String toString() {
            return name + " " + height + " " + vision;
        }

        // 키의 오름차순용 comparator
        static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparator();

        private static class HeightOrderComparator implements Comparator<PhyscData> {
            public int compare(PhyscData d1, PhyscData d2) {
                return (d1.height > d2.height) ? 1 :
                        (d1.height < d2.height) ? -1 : 0;
            }
        }
        static final Comparator<PhyscData> VISION_ORDER = new VisionOrderComparator();
        private static class VisionOrderComparator implements Comparator<PhyscData> {
            public int compare(PhyscData d1, PhyscData d2) {
                return (d1.vision > d2.vision) ? 1 :
                        (d1.vision < d2.vision) ? -1 : 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        PhyscData[] x = {
                new PhyscData("강민하", 162, 0.3),
                new PhyscData("김찬우",173, 0.7),
                new PhyscData("박준서",175, 2.0),
                new PhyscData("유서범",171, 1.5),
                new PhyscData("이수연",168, 0.4),
                new PhyscData("장경오",174, 1.2),
                new PhyscData("황지안",169, 0.8),
        };

        Arrays.sort(x, PhyscData.VISION_ORDER); // 배열 x를 HEIGHT_ORDER 를 사용하여 정렬

        System.out.println("■ 신체검사 리스트 ■");
        System.out.println("이름      키       시력");
        System.out.println("---------------------");
        for (int i = 0; i < x.length; i++)
            System.out.printf("%-8s%3d%8.1f\n", x[i].name, x[i].height, x[i].vision);
    }
}
