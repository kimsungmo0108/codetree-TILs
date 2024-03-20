public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int[][] num = new int[n][n];
        int count = 1;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(n%2 == 0){
                    if(j%2==0){
                        num[i][j] = n*(n-1-j)+i+1;
                    }else if(j%2==1){
                        num[i][j] = n*(n-j)-i;
                    }
                }else if(n%2 == 1){
                    if(j%2==1){
                        num[i][j] = n*(n-1-j)+i+1;
                    }else if(j%2==0){
                        num[i][j] = n*(n-j)-i;
                    }
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