package 학생성적정렬하기;

// 5명의 학생에 대해 이름과 국어, 영어, 수학 성적을 입력 받아서 정렬하기
// 첫번째 조건은 총점 기준
// 총점이 같으면, 이름의 사전순 정렬
// 자료 구조는 TreeSet을 사용해도 되고 혹은 ArrayList 사용해도 됨

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class StudentSortEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Student> treeSet = new TreeSet<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("이름 입력 : ");
            String name = sc.next();
            System.out.println("국어 입력 : ");
            int kor = sc.nextInt();
            System.out.println("영어 입력 : ");
            int eng = sc.nextInt();
            System.out.println("수학 입력 : ");
            int math = sc.nextInt();
            treeSet.add(new Student(name, kor, eng, math));
        }
        System.out.println("===== 성젹 결과 출력 =====");
        for (Student e : treeSet) {
            System.out.println(e);
        }
    }
}
