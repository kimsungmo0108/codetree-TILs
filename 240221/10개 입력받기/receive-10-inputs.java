public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int[] nums = new int[10];
        double sum = 0;
        int c = 0;
        for(int i=0; i<10; i++){
            nums[i] = sc.nextInt();
            sum += (double) nums[i];
            c++;
            if(nums[i]==0){
                c -= 1;
                break;
            }
        }
        System.out.printf("%d %.1f", (int)sum, sum/c);
    }
}