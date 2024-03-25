public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] num = new int[n][n];
        for(int i=0; i<m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            num[a-1][b-1] = a*b;
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.printf("%d ", num[i][j]);
            }
            System.out.println();
        }
    }
}