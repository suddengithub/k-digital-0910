package 번호판계산;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberEx {
//    public static void main(String[] args) {
//        // 각 번호판의 자리수를 계산하기 위한 배열 생성
//        int[] number = {4, 2, 3, 3, 3, 3, 3, 3, 3, 3};  // 각 자리에 대한 번호 크기
//        // 총 자리수를 누적하기위한 변수
//        int sum = 0;
//        // 결과를 한번에 출력해야 하기 때문에 최대 100개의 결과 저장 배열 생성
//        int[] rst = new int[100];
//        // 배열은 인덱스 계산이 필요하기 때문에 인덱스 변수 생성
//        int index = 0;
//        // 스캐너 입력을 위한 객체 생성
//        Scanner sc = new Scanner(System.in);
//        // 무한 반복문 생성 (0이 언제 입력될 지 모르기 때문)
//        while(true) {
//            String num = sc.nextLine();
//            // 스캐너를 통해 문자열을 입력 받아 문자열이 "0"이면 반복문 탈출
//            if (num.equals("0")) break;
//            // 입력 받은 문자열 길이 만큼을 순회하면서 문자 추출 후 정수 자리수로 변환하여 자리 수 추출
//            for(int i = 0; i < num.length(); i++) {
//                sum += number[num.charAt(i) - '0'] + 1;  // + 1은 각 숫자 앞의 공백
//            }
//            // 결과 값을 저장하고 배열 인덱스 증가
//            rst[index++] = sum + 1;  // 1은 숫자 마지막의 공백 한칸
//            // 총 자리수 누적을 위한 변수 초기화
//            sum = 0;
//        }
//        // 결과 출력
//        for (int i = 0; i < index; i++) {
//            System.out.println(rst[i]);
//        }
//    }
    public static void main(String[] args) {
        int[] number = {4, 2, 3, 3, 3, 3, 3, 3, 3, 3};
        int sum = 0;
        List<Integer> rst = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(true) {
            String num = sc.nextLine();
            if (num.equals("0")) break;
            for(int i = 0; i < num.length(); i++) {
                sum += number[num.charAt(i) - '0'] + 1;  // + 1은 각 숫자 앞의 공백
            }
            rst.add(sum + 1); // 리스트의 마지막 인덱스에 값이 추가 됨
            sum = 0;
        }
        for(int e : rst) System.out.println(e);
    }

}
