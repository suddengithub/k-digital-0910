package 제네릭기본;

import java.util.ArrayList;
import java.util.List;

// 제네릭이란? 데이터타입을 일반화 한다는 의미,
// 데이터 타입 또는 자료구조에 상관없이 동일한 프로그래밍 가능
// 클라스나 메서드에서 사용할 내부 데이터 타입을 컴파일시 미리 지정하는 방식 사용
public class GenericBasic {
    public static void main(String[] args) {
        genericTypeVariableFunc();

    }
    // 제네릭타입 제한 : 컴파일시 타입 체크 가능, 타입 변환 제거
    static void genericBasicFunc() {
        List<String> list = new ArrayList();
        list.add("100");
        System.out.println(list.get(0));
    }
    static void genericTypeVariableFunc() {
        Person<String> p1 = new Person<>("안유진");
        Person<Integer> p2 = new Person<>(1004);
        System.out.println(p1.getInfo());
        System.out.println(p2.getInfo());
    }
}
// <T> : 타입 변수를 의미하며, 관례상 매개변수가 1개인 경우 대문자 T로 표기
class Person<T> {
    private T info; // T는 데이터 타입이 현재 결정안돼 있음.
    Person(T info) {
        this.info = info;
    }
    public T getInfo() {
        return info;
    }
}
