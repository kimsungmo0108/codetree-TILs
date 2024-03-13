public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int[][] nums = new int[2][4];
        double sum = 0;
        for(int i=0; i<2; i++){
            for(int j=0; j<4; j++){
                nums[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<2; i++){
            for(int j=0; j<4; j++){
                sum += nums[i][j];
            }
            System.out.printf("%.1f ", sum/4);
            sum = 0;
        }
        System.out.println();
        for(int i=0; i<4; i++){
            for(int j=0; j<2; j++){
                sum += nums[j][i];
            }
            System.out.printf("%.1f ", sum/2);
            sum = 0;
        }
        System.out.println();
        for(int i=0; i<2; i++){
            for(int j=0; j<4; j++){
                sum += nums[i][j];
            }
        }
        System.out.printf("%.1f ", sum/8);
    }
}