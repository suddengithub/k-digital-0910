package ㄱ연습장;

public class DrillEx {
    public static void main(String[] args) {
    // 참조변수 = 참조타입으로 선언된 변수는 메모리의 주소를 값으로 가진다.
    // 이 주소를 통해서 객체를 참조한다.
        String a = "Hello Java"; // 문자열 자료형인 변수 a 선언 후 a에 "Hello Java" 입력
        System.out.println(a.toUpperCase()); // a의 문자열을 전부 대문자로 바꾼 후 출력

        String oldStr = "   자바 프로그래밍    ";
        System.out.println(oldStr.trim());

        String b = "12:15:41:13";
        String[] result = b.split(":");
        System.out.println(result[0] + "시" + result[1] + "분" + result[3] + "초");

        System.out.println(String.format("저는 사과를 %d개 먹습니다.", 3));
        System.out.println(String.format("저는 사과를 %s개 먹습니다.", "다섯"));

        int number = 3;
        String day = "Sunday";
        System.out.println(String.format("저는 사과를 %d개 먹고 오늘은 %s입니다.", number, day));

//        int[] level = new int[3];
//
//        level[0] = 65;
//        level[1] = 62;
//        level[2] = 61;
//
//        for (int i = 0; i < level.length; i++) {
//            System.out.print(level[i] + "\n");
//        }
//
//        int num1 = 10, num2 = 4;
//        System.out.println(num1 + num2);
//        System.out.println(num1 - num2);
//        System.out.println(num1 * num2);
//        System.out.println((double) num1 / num2);
//        System.out.println(num1 % num2);
//
//        int num5 = 10;
//        System.out.println(num5 += 2);
//        System.out.println(num5 -= 2);
//        System.out.println(num5 *= 2);
//        System.out.println(num5 %= 3);

        int num1 = 10;
        System.out.println(num1++);





    }

}