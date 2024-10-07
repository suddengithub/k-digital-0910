package Math클래스;

import java.math.BigDecimal;
import java.math.RoundingMode;

// 클래스 메서드 : 수학에서 자주 사용하는 상수들과 함수들을 미리 구현해 놓은 클래스
// 모든 메서드는 클래스 메서드이므로 객체 생성 없이 바로 사용
// java.lang에 포함되어 있어 별도의 import가 필요 없음
public class MathClassEx {
    public static void main(String[] args) {
//        randomFunc();
        MathMethodFunc();
    }
    // random() 메서드 0.0 이상에서 1.0 미만의 범위에서 임의의 double 형 값 1개를 반환
    // 1 ~ 100 사이의 임의의 수를 만들기 위해서 * 100
    static void randomFunc() {
        for(int i = 0; i < 6; i++) {
            System.out.println((int)(Math.random() * 45) + 1 + " "); // 1~100 사이의 임의의 수
        }
    }
    // abs() 메서드 : 절대값 구하는 메서드
    // floor() 메서드 : 주어진 숫자를 내림한 결과를 반환
    // ceil() : 주어진 숫자를 올림한 결과를 반환
    // round() : 소수점 첫째 자리에서 반올림 결과를 반환 => 자바는 소수점 몇쨰 자리를 지정 불가
    // bigDecimal() : 메서드를 import해서 사용하는 방법이 권장되는 방식
    static void MathMethodFunc() {
        // abs() 메서드 : 절대값 구하는 메서드
        System.out.println(Math.abs(-10)); // 10을 반환
        System.out.println(Math.abs(10));  // 10을 반환
        // floor() 메서드 : 주어진 숫자를 내림한 결과를 반환
        System.out.println(Math.floor(10.99999999999999)); // 10
        // ceil() : 주어진 숫자를 올림한 결과를 반환
        System.out.println(Math.ceil(10.000000000000001)); // 11
        // round() : 소수점 첫째 자리에서 반올림 결과를 반환
        System.out.println(Math.round(10.49999999999999)); // 10
        System.out.println(Math.round(10.59999999999999)); // 11
        // Min()과 MAX()
        System.out.println(Math.min(20,30));
        System.out.println(Math.max(20,30));
        // bigDecimal() : 메서드를 import해서 사용하는 방법이 권장되는 방식
        BigDecimal number = new BigDecimal("10.355");
        System.out.println(number.setScale(2, RoundingMode.HALF_UP)); // 자리를 지정해서 몇째자리에서 반올림할 지 선택 가능
    }
}
