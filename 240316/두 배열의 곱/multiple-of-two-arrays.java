public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int[][] num1 = new int[3][3];
        int[][] num2 = new int[3][3];
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                num1[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                num2[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.printf("%d ",num1[i][j]*num2[i][j]);
            }
            System.out.println();
        }
    }
}