public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        for(int j=n-1; j>=0; j--){
            if(nums[j]%2 == 0){
                System.out.printf("%d ", nums[j]);
            }
        }
    }
}