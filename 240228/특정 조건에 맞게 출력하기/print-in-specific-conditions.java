public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int[] nums = new int[100];
        for(int i=0; i<100; i++){
            nums[i] = sc.nextInt();
            if(nums[i] == 0){
                break;
            }
        }
        for(int j=0; j<100; j++){
            if(nums[j] == 0){
                break;
            }
            if(nums[j]%2 == 0){
                System.out.printf("%d ", nums[j]/2);
            }else if(nums[j]%2 == 1){
                System.out.printf("%d ", nums[j]+3);
            }
        }
    }
}