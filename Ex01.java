import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        if (D > B) {
            System.out.println(A + (Math.abs(B - D) * C));
        } else {
            System.out.println(A);
        }

    }
}
