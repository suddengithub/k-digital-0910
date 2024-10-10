package 스택기본;

import java.util.Scanner;
import java.util.Stack;
// 괄호의 닫힘 여부를 스택으로 확인하는 방법
//

public class StackExMain {
    public static void main(String[] args) {
        // Character는 char의 객체 타입
        Stack<Character> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("수식입력 : ");
        String exp = sc.next();
        for(int i = 0; i < exp.length(); i++) {//문자열을 반복하는 것이므로 length가 맞음 문자열 길이만큼을 반복함
            char ch = exp.charAt(i); // 문자열에서 인덱스에 해당하는 문자를 반환
            if (ch == '(') {    // 추출된 문자가 열림 괄호이면
                st.push(ch);
            } else if (ch == ')') {
                if (!st.isEmpty()) st.pop();
                else { //

                    System.out.println("괄호가 일치하지 않습니다. 1번 케이스");
                    return;
                }
            }
        }if (st.isEmpty()) {
            System.out.println("괄호가 일치합니다.");
        }else {
            System.out.println("괄호가 일치하지 않습니다.");
        }
    }
}