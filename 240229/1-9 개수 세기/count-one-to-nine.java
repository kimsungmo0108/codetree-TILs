public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[9];
        int m = 0;
        for(int i=0; i<n; i++){
            m = sc.nextInt();
            nums[m-1] += 1;
        }
        for(int j=0; j<9; j++){
            System.out.println(nums[j]);
        }
    }
}