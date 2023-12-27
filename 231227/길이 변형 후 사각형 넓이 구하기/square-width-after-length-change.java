public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        x += 8;
        y *= 3;
        System.out.printf("%d\n%d\n%d", x, y, x*y);
    }
}