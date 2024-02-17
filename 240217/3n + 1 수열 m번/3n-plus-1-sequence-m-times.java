public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int m = sc.nextInt();
        int[] nums = new int[m];
        for(int i=0; i<m; i++){
            nums[i] = sc.nextInt();
            for(int j=0; ; j++){
                if(nums[i] == 1){
                    System.out.printf("%d\n", j);
                    break;
                }else if(nums[i]%2 == 0){
                    nums[i] /= 2;
                }else if(nums[i]%2 == 1){
                    nums[i] = nums[i] * 3 + 1;
                }
            }
        }
    }
}