package 연습장;

public class Recursive {
    public static void main(String[] args) {
        int rec = recursive_func(10);
        System.out.println(rec);
    }
    public static int recursive_func(int n) {
        if(n == 1) return 1;
        return n + recursive_func(n - 1);
    }
}
