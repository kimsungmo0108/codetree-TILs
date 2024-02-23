public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int[] nums = new int[10];
        for(int i=0; i<10; i++){
            nums[i] = sc.nextInt();
        }
        System.out.printf("%d", (nums[2]+nums[4]+nums[9]));
    }
}