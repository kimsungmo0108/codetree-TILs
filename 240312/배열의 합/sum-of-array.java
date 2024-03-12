public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int[][] nums = new int[4][4];
        int sum = 0;
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                nums[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                sum += nums[i][j];
            }
            System.out.println(sum);
            sum = 0;
        }
    }
}