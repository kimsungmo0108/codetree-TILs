public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int[] nums = new int[10];
        for(int i=0; i<10; i++){
            nums[i] = sc.nextInt();
            if(nums[i]==0){
                break;
            }
        }
        for(int i=9; i>=0; i--){
            if(nums[i]==0){
                continue;
            }
            System.out.printf("%d ", nums[i]);
        }
    }
}