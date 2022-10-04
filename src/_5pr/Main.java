package _5pr;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(F9(5,10));
        System.out.println(F10(123456789,0));
        System.out.println(F11());
    }
    public static int F9(int a, int b) {
        if (a> b+1) return 0;
        if (a==0 || b==0) return 1;
        return F9(a,b-1)+F9(a-1,b-1);
    }
    public static int F10(int a,int i) {
        return (a==0) ? i : F10( a/10, i*10 + a%10 );
    }
    public static int F11() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n == 1) {
            int m = in.nextInt();
            if (m == 1) {
                return F11() + n + m;
            } else {
                int k = in.nextInt();
                if (k == 1) {
                    return F11() + n + m + k;
                } else {
                    return n + m + k;
                }
            }
        } else {
            int m = in.nextInt();
            if (m == 1) {
                return F11() + n + m;
            } else {
                return n + m;
            }
        }
    }
}