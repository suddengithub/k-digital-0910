package List인터페이스;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// List 인터페이스는 ArrayList, Vector, Linked List에 상속을 주기 위한 인터페이스
// List는 배열과 비슷한 형태의 자료 구조(인덱스 기반: 인덱스를 기반으로 자료를 찾아내는 것)
// List는 mutable 읽고 쓰기 가능 / 튜플은 immutable 읽기만 가능
// List는 동적으로 크기가 변함
// List는 저장 순서가 유지됨(배열처럼 연속된 공간에 들어가므로 그렇다)
// 같은 요소의 중복 저장을 허용
// 데이터 크기가 고정되어 있지 않음
// 데이터를 다루기 위한 다양한 메서드 제공
// List 인터페이스의 구현체인 ArrayList, Vector, Linked List의 사용 방법이 동일
public class ListBasicEx {
    public static void main(String[] args) {
        // List 인터페이스의 참조 변수(참조타입으로 선언된 변수로 메모리의 주소를 값으로 함. 주소를 통해서 객체를 참조함)로 ArrayList 생성된 객체를 참조함
        String[] fruitsArr = {"Watermelon", "Peach", "Cherry"};

        // Arrays.asList() 배열을 리스트 변환하는 메서드
        List<String> fruits = new ArrayList<>(Arrays.asList(fruitsArr)); // ArrayList는 generic 타입임. 데이터 타입에 대한 일반화가 돼있음

        // 요소 추가, 리스트 맨 뒤에 요소를 추가
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // 리스트 출력, toString() 메서드가 오버라이딩 되어 있음
        System.out.println("과일 목록 : " + fruits.toString()); // toString : 객체의 정보를 표시하기 위해 사용

        // 특정 인덱스에 요소 추가
        fruits.add(1, "Grape");
        System.out.println("추가 후 과일 목록 : " + fruits);

        // 요소 가져오기(인덱스 접근)
        System.out.println("과일 요소 : " + fruits.get(2));

        // 요소 제거하기
        fruits.remove(2);
        System.out.println("제거 후 과일 목록 : " + fruits);

        // List 사이즈 확인
        System.out.println("과일 목록 사이즈 : " + fruits.size());

        // 요소 순회하기
        for (String e : fruits) {
            System.out.println(e + " ");
        }
        // 리스트 정렬하기, Comparator 제 3자 비교방식
        fruits.sort(Comparator.naturalOrder()); // 오름차순
        System.out.println("오름차순으로 정렬 후 과일 목록 : " + fruits);
        fruits.sort(Comparator.reverseOrder()); // 내림차순
        System.out.println("내림차순으로 정렬 후 과일 목록 : " + fruits);
    }
}


