public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int[] nums = new int[10];
        int sum1 = 0;
        float sum2 = 0;
        int c = 0;
        for(int i=0; i<10; i++){
            nums[i] = sc.nextInt();
        }
        for(int j=0; j<10; j++){
            if((j+1)%2 == 0){
                sum1 += nums[j];
            }
            if((j+1)%3 == 0){
                sum2 += nums[j];
                c++;
            }
        }
        System.out.printf("%d %.1f", sum1, (sum2/c));
    }
}