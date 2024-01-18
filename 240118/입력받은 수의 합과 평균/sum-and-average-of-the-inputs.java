public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += sc.nextInt();
        }
        System.out.printf("%d %.1f", sum, (sum/(float)n));
    }
}