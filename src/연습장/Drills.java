package 연습장;

public class Drills {
    public static void main(String[] args) {
        String[] weeks = {"월","화","수","목","금","토","일"};
        for (int i = 0; i < weeks.length; i++) {
            System.out.println(weeks[i] + " ");
        }

        String c = "Hello Java";
        String d = "Hello Python";
        System.out.println("결과 : " + c.equals(d));

        String a = "Hello Java";
        String b = new String("Hello Java");
        System.out.println(a.equals(b));


    }



}
