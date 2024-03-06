public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int min = 0;
        int n = sc.nextInt();
        int[] nums = new int[n];
        int c = 0;
        for(int i = 0; i<n; i++){
            nums[i] = sc.nextInt();
            min = nums[i];
        }
        for(int i = 0; i<n; i++){
            min = min < nums[i] ? min : nums[i];
        }
        for(int i = 0; i<n; i++){
            if(nums[i]==min){
                c++;
            }
        }
        System.out.printf("%d %d ", min, c);
    }
}