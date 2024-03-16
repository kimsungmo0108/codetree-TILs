public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] num1 = new int[n][m];
        int[][] num2 = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                num1[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                num2[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(num1[i][j] == num2[i][j]){
                    System.out.printf("0 ");
                }else if(num1[i][j] != num2[i][j]){
                    System.out.printf("1 ");
                }
            }
            System.out.println();
        }
    }
}