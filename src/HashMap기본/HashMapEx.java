package HashMap기본;
// Map 인터페이스 : 키(Key)와 값(Value)의 쌍(Pair)으로 자료를 관리하는 인터페이스
// 구현체 HashMap, TreeMap, HashTable, Properties

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {
    public static void main(String[] args) {
        // Map 생성
        Map<String, Integer>map = new HashMap<>();
        // 객체 추가 : Entry(키, 값)
        map.put("우영우", 99);
        map.put("동그라미", 55);
        map.put("최수연", 95);
        map.put("이준호", 80);
        map.put("동그라미", 96);    // 키가 같기 때문에 저장된 값이 대체 됨.
        System.out.println("총 Entity 수 : " + map.size());
        System.out.println("Key(동그라미)로 값 찾기 : " + map.get("동그라미"));
        // 반복 순회 방법 (향상된 for문을 이용하는 방법)
        for (String key : map.keySet()) { // 중복되지 않는 kEY값 써야해서 keySet이라 작성)
            System.out.println(key + " : " + map.get(key));
        }
        // 이전 방식 순회 : 반복자(iterator)를 이용하는 방식
        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println(key + " : " + map.get(key));
        }
    }
}
