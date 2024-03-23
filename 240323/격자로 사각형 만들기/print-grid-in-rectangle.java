public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int[][] num = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==0 || j==0){
                    num[i][j] = 1;
                }else {
                    num[i][j] = num[i][j-1] + num[i-1][j-1] + num[i-1][j];
                }
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.printf("%d ", num[i][j]);
            }
            System.out.println();
        }
    }
}