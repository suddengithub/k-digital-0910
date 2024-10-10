package 연습장;

import java.util.Scanner;

import static javax.management.Query.minus;

public class Drills {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 숫자를 입력 : ");
        int num1 = sc.nextInt();
        System.out.println("두번째 숫자를 입력 : ");
        int num2 = sc.nextInt();
        sc.close();

        int res = minus(num1,num2);
        System.out.println(res);
    }
    public static int minus(int num1, int num2) {
        int result = 0;
        result = num1 - num2;
        return result;
    }
}
