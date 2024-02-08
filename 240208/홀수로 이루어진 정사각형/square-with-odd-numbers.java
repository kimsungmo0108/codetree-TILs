public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        n *= 2;
        for(int i=1; i<=n; i+=2){
            for(int j=i; j<n+i; j+=2){
                System.out.printf("%d ", j+10);
            }
            System.out.println();
        }
    }
}