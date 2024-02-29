public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int[] nums = new int[6];
        int m = 0;
        for(int i=0; i<10; i++){
            m = sc.nextInt();
            nums[m-1] += 1;
        }
        for(int j=0; j<6; j++){
            System.out.printf("%d - %d\n", j+1, nums[j]);
        }
    }
}