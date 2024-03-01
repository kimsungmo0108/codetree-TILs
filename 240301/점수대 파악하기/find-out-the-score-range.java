public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int[] nums = new int[11];
        int score = 0;
        int n = 0;
        for(;;){
            score = sc.nextInt();
            if(score == 0){
                break;
            }
            n = score/10;
            nums[n] += 1;
        }
        for(int i=10; i>0; i--){
            System.out.printf("%d - %d\n", i*10, nums[i]);
        }
    }
}