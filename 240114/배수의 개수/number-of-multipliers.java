public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int[] nums = new int[10];
        int c1 = 0;
        int c2 = 0;
        for(int i = 0; i<10; i++){
            nums[i] = sc.nextInt();
        }

        for(int i = 0; i<10; i++){
            if(nums[i]%3 == 0){
                c1++;
            }else if(nums[i]%5 == 0){
                c2++;
            }
        }
        System.out.printf("%d %d", c1, c2);
    }
}