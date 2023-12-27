public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        float d = (a+b+c)/3f;
        System.out.printf("%d\n%d\n%d", (a+b+c), (int)d, ((a+b+c)-(int)d));
    }
}