public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        char c1 = sc.next().charAt(0);
        char c2 = sc.next().charAt(0);
        int max = c1>c2 ? c1:c2;
        int min = c1<c2 ? c1:c2;
        System.out.printf("%d %d", c1+c2, max-min);
    }
}