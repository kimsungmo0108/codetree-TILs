public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        float c = (float)(a+b)/(float)(a-b);
        System.out.printf("%.2f", c);
    }
}