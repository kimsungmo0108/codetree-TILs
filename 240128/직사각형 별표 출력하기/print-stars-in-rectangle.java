public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i =0; i<n; i++){
            for(int j=1; j<=m; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}