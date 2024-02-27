public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n=sc.nextInt();
        int[] nums = new int[50];
        int c=0;
        for(int i=0;; i++){
            if(c == 2){
                break;
            }
            nums[i] = n*(i+1);
            if(nums[i]%5 == 0){
                c++;
            }
        }
        for(int j=0;; j++){
            if(nums[j]==0){
                break;
            }else{
                System.out.printf("%d ", nums[j]);
            }
        }
    }
}