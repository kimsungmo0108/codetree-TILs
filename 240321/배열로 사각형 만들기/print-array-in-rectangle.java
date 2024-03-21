public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int n = 5;
        int[][] num = new int[5][5];
        for(int i=0; i<n; i++){
            for(int j=0; j<5; j++){
                if(i==0){
                    num[i][j] = 1;
                }else if(j==0){
                    num[i][j] = 1;
                }else{
                    num[i][j] = num[i-1][j]+num[i][j-1];
                }
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<5; j++){
                System.out.printf("%d ", num[i][j]);       
            }
            System.out.println();
        }
    }
}